package Ejercicio2;

public abstract class  ElementoSA {
    String destinatario, direccionDestinatario, remitente, direccionRemitente;
    int cp;
    double peso;
    int traking;
    boolean retiran;


    public ElementoSA(int tracking, int cp,double peso, int id, boolean retiran, String direccionRemitente, String remitente, String direccionDestinatario, String destinatario) {
        this.retiran = retiran;
        this.direccionRemitente = direccionRemitente;
        this.remitente = remitente;
        this.direccionDestinatario = direccionDestinatario;
        this.destinatario = destinatario;
        this.traking=tracking;
        this.cp=cp;
        this.peso=peso;
    }

    public void setTraking(int traking) {
        this.traking = traking;
    }

    public int getCp(){
        return cp;
    }
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public boolean isRetiran() {
        return retiran;
    }

    public void setRetiran(boolean retiran) {
        this.retiran = retiran;
    }

    public abstract double getPeso();
    public abstract int getTracking();

}


