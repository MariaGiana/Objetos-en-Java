package Ejercicio2;

import java.util.ArrayList;

public class ComboPostal extends ElementoSA{
    private ArrayList<ElementoSA> elementos;

    public ComboPostal (int tracking, int cp,double peso, int id, boolean retiran, String direccionRemitente, String remitente, String direccionDestinatario, String destinatario){
        super(tracking,cp,peso, id,retiran,direccionRemitente,remitente,direccionDestinatario,destinatario);
        elementos=new ArrayList<>();

    }

    public ArrayList<ElementoSA> getElementos() {
        return elementos;
    }

    public void addElemento(ElementoSA nuevo) {
        if (nuevo.getCp() == this.cp) {
            this.elementos.add(nuevo);
        }
    }
    public void removeElemento(ElementoSA aBorrar){
        this.elementos.remove(aBorrar);  //NO OLVIDAR EL EQUALS
    }
    public void modificarTrancking(int nuevoTracking) {
        this.traking = nuevoTracking;
        for (ElementoSA elem : elementos) {
            if (elem instanceof ComboPostal) {
                // Llamada recursiva para combos anidados
                ((ComboPostal) elem).modificarTrancking(nuevoTracking);
            } else {
                // Si es un elemento simple, solo cambiamos su tracking
                elem.setTraking(nuevoTracking);
            }
        }
    }

    @Override
    public double getPeso(){
    double total=0;
    for(ElementoSA elem:elementos){
        total+= elem.getPeso();
    }
        return total;
    }

    @Override
    public int getTracking() {
        int primerTracking=elementos.get(0).getTracking();
       modificarTrancking(primerTracking);
       return primerTracking;
    }

}
