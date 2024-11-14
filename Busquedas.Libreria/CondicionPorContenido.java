package Ejercicio2;

public class CondicionPorContenido extends Condicion{
    String frase;
    public CondicionPorContenido(String frase){
        super();
        this.frase=frase;
    }
    @Override
    public boolean cumple(Documento doc){
        return doc.getContenido().contains(frase);
    }
}
