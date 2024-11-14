package Ejercicio2;

public class CondicionOr extends Condicion{
    Condicion c1;
    Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2){
        super();
        this.c1=c1;
        this.c2=c2;
    }

    public boolean cumple(Documento doc){
        return c1.cumple(doc)|| c2.cumple(doc);
    }
}
