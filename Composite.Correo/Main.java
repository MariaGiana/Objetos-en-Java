package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear una carta y un paquete con el mismo cp
        Carta carta1 = new Carta(123, 1000, 0.5, 1, true, "Calle A", "Remitente A", "Calle B", "Destinatario B");
        Paquete paquete = new Paquete(456, 1000, 2.0, 2, false, "Calle C", "Remitente C", "Calle D", "Destinatario D");

        // Crear un ComboPostal y agregar la carta y el paquete
        ComboPostal comboPrincipal = new ComboPostal(789, 1000, 3.0, 3, true, "Calle E", "Remitente E", "Calle F", "Destinatario F");
        comboPrincipal.addElemento(carta1);
        comboPrincipal.addElemento(paquete);

        // Mostrar datos iniciales del combo principal
        System.out.println("Datos del combo principal antes de agregar nuevas cartas:");
        mostrarDatosCombo(comboPrincipal);
        System.out.println("Peso total del combo principal antes de agregar nuevas cartas: " + comboPrincipal.getPeso() + " kg");


        // Intentar agregar una carta con el mismo cp (debería agregarse)
        Carta cartaConMismoCp = new Carta(321, 1000, 0.4, 4, true, "Calle G", "Remitente G", "Calle H", "Destinatario H");
        comboPrincipal.addElemento(cartaConMismoCp);

        // Intentar agregar una carta con un cp diferente (no debería agregarse)
        Carta cartaConOtroCp = new Carta(654, 2000, 0.3, 5, true, "Calle I", "Remitente I", "Calle J", "Destinatario J");
        comboPrincipal.addElemento(cartaConOtroCp);

        // Mostrar datos del combo principal después de intentar agregar cartas
        System.out.println("\nDatos del combo principal después de agregar nuevas cartas:");
        mostrarDatosCombo(comboPrincipal);
        System.out.println("Peso total del combo principal despues de agregar nuevas cartas: " + comboPrincipal.getPeso() + " kg");

        // Crear un subcombo y agregarlo al combo principal
        ComboPostal subCombo = new ComboPostal(888, 1000, 1.5, 6, true, "Calle K", "Remitente K", "Calle L", "Destinatario L");
        Carta cartaEnSubCombo = new Carta(555, 1000, 0.2, 7, true, "Calle M", "Remitente M", "Calle N", "Destinatario N");
        subCombo.addElemento(cartaEnSubCombo);
        comboPrincipal.addElemento(subCombo);

        // Mostrar datos del combo principal después de agregar el subcombo
        System.out.println("\nDatos del combo principal después de agregar el subcombo:");
        mostrarDatosCombo(comboPrincipal);
        System.out.println("Peso total del combo principal despues de agregar el subcombo: " + comboPrincipal.getPeso() + " kg");

        // Cambiar el tracking del combo principal y observar cómo se propaga
        int nuevoTracking = 999;
        comboPrincipal.modificarTrancking(nuevoTracking);

        // Mostrar datos del combo principal después de cambiar el tracking
        System.out.println("\nDatos del combo principal después de cambiar el tracking:");
        mostrarDatosCombo(comboPrincipal);
        System.out.println("Peso total del combo principal: " + comboPrincipal.getPeso() + " kg");

    }

    // Método auxiliar para mostrar los datos del ComboPostal y sus elementos
    public static void mostrarDatosCombo(ComboPostal combo) {
        System.out.println("Tracking del combo: " + combo.getTracking());

        System.out.println("Lista de elementos en el combo:");
        for (ElementoSA elem : combo.getElementos()) {
            System.out.println(" - Tipo: " + elem.getClass().getSimpleName() +
                    ", Tracking: " + elem.getTracking() +
                    ", CP: " + elem.cp +
                    ", Peso: " + elem.peso +
                    ", Destinatario: " + elem.destinatario);
            // Si el elemento es un combo, mostrar sus elementos anidados
            if (elem instanceof ComboPostal) {
                ComboPostal subCombo = (ComboPostal) elem;
                System.out.println("   Elementos en el subcombo:");
                for (ElementoSA subElem : subCombo.getElementos()) {
                    System.out.println("     - Tipo: " + subElem.getClass().getSimpleName() +
                            ", Tracking: " + subElem.getTracking() +
                            ", CP: " + subElem.cp +
                            ", Peso: " + subElem.peso +
                            ", Destinatario: " + subElem.destinatario);
                }
            }
        }
    }
}
