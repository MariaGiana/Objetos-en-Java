package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear algunos documentos
        Documento doc1 = new Documento("Historia", "Este es un contenido histórico con muchas palabras.");
        doc1.addAutores("Juan Campogrande");
        doc1.addPalabra("historia");
        doc1.addPalabra("palabras");

        Documento doc2 = new Documento("Ciencia", "Contenido científico con enfoque en biología y física.");
        doc2.addAutores("Maria Siracuza");
        doc2.addPalabra("ciencia");
        doc2.addPalabra("biologia");

        Documento doc3 = new Documento("Literatura", "Un contenido extenso de literatura y poesía.");
        doc3.addAutores("Juan Campogrande");
        doc3.addPalabra("poesía");

        // Crear archivo y agregar documentos
        Archivo archivo = new Archivo();
        archivo.addDocumento(doc1);
        archivo.addDocumento(doc2);
        archivo.addDocumento(doc3);

        // Definir condiciones de búsqueda
        Condicion condicionTituloIgual = new CondicionPorTituloIgual("Historia");
        Condicion condicionPalabraClave = new CondicionPorPalabraClave("ciencia");
        Condicion condicionAutor = new CondicionPorAutor("Maria Siracuza");
        Condicion condicionMinPalabras = new CondicionPorTamanioContenido(5);
        Condicion condicionNoPalabraClave= new CondicionNot(condicionPalabraClave);

        // Realizar búsquedas en el archivo
        System.out.println("Documentos con título exactamente igual a 'Historia':");
        for (Documento doc : archivo.buscar(condicionTituloIgual)) {
            System.out.println(doc);
        }
        // Realizar búsquedas en el archivo
        System.out.println("\nDocumentos con palabra clave DIFERENTE a 'ciencia':");
        for (Documento doc : archivo.buscar(condicionNoPalabraClave)) {
            System.out.println(doc);
        }

        System.out.println("\nDocumentos que contienen la palabra clave 'ciencia':");
        for (Documento doc : archivo.buscar(condicionPalabraClave)) {
            System.out.println(doc);
        }

        System.out.println("\nDocumentos de 'Maria Siracuza:");
        for (Documento doc : archivo.buscar(condicionAutor)) {
            System.out.println(doc);
        }

        System.out.println("\nDocumentos con al menos 5 palabras en el contenido:");
        for (Documento doc : archivo.buscar(condicionMinPalabras)) {
            System.out.println(doc);
        }
    }
}
