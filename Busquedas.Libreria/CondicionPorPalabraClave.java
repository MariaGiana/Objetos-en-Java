package Ejercicio2;

public class CondicionPorPalabraClave extends Condicion{
    String palabraClave;

    public CondicionPorPalabraClave(String palabraClave){
        super();
        this.palabraClave=palabraClave;
    }
    @Override
    public boolean cumple(Documento d){
        return d.getPalabrasClaves().contains(palabraClave);
    }

}
