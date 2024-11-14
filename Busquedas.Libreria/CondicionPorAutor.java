package Ejercicio2;

public class CondicionPorAutor extends Condicion{
    String autor;
    public CondicionPorAutor(String autor){
        super();
        this.autor=autor;
    }
    @Override
    public boolean cumple(Documento d){
        return d.getListaAutores().contains(autor);
    }
}
