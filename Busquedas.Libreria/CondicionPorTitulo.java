package Ejercicio2;

public class CondicionPorTitulo extends Condicion{
    String palabra;

   public CondicionPorTitulo(String palabra) {
       super();
       this.palabra=palabra;
   }

    @Override
    public boolean cumple(Documento d){
    return d.getTitulo().contains(palabra);
    }
}
