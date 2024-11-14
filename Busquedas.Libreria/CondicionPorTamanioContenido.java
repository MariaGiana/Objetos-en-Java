package Ejercicio2;

public class CondicionPorTamanioContenido extends Condicion{
 int cantidadPalabras;

    public CondicionPorTamanioContenido(int cantidadPalabras){
        super();
        this.cantidadPalabras=cantidadPalabras;
    }
    public int contarPalabras(Documento doc){
        String contenido= doc.getContenido();
        if(contenido==null || contenido.isEmpty()){
            return 0;
        }
        String[] palabras = contenido.trim().split("\\s+");
        return palabras.length;
    }
    @Override
    public boolean cumple(Documento doc){
        return contarPalabras(doc)>=cantidadPalabras;

    }
}
