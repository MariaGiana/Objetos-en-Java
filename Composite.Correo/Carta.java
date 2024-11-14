package Ejercicio2;

public class Carta extends ElementoSA{
    double peso;
    int id;
    public Carta (int tracking, int cp,double peso, int id, boolean retiran, String direccionRemitente, String remitente, String direccionDestinatario, String destinatario){
        super(tracking,cp,peso, id,retiran,direccionRemitente,remitente,direccionDestinatario,destinatario);
        this.peso=peso;
        this.id=id;

    }
    @Override
    public double getPeso(){
        return peso;
    }

    @Override
    public int getTracking() {
        return traking;
    }

}
