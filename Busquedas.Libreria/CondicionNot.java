package Ejercicio2;

public class CondicionNot extends Condicion{
    Condicion c1;

    public CondicionNot(Condicion c1){
        super();
        this.c1=c1;
    }

    public boolean cumple(Documento doc){
        return !c1.cumple(doc);

}
}
