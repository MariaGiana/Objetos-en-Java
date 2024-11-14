package Ejercicio2;

public class CondicionPorTituloIgual extends Condicion{
    String palabra;
    public CondicionPorTituloIgual(String palabra){
        super();
      this.palabra=palabra;
    }

    @Override
    public boolean cumple(Documento doc){
    return doc.getTitulo().equals(palabra);
    }
}
