package Ejercicio2;

import java.util.ArrayList;

public class Archivo {
    protected ArrayList<Documento> documentos;

    public Archivo(){
        this.documentos=new ArrayList<>();
    }
    public void addDocumento(Documento doc){
        if(!documentos.contains(doc)) {
            documentos.add(doc);
        }
    }
    public boolean tieneDocumento(Documento doc){
        return documentos.contains(doc);
    }
    public void removeDocumento(Documento doc){
        documentos.remove(doc);
    }

    public ArrayList <Documento> buscar(Condicion con){
        ArrayList <Documento> lista = new ArrayList<>();
        for(int i=0; i< documentos.size();i++){
        Documento doc=documentos.get(i);
        if(con.cumple(doc)){
            lista.add(doc);
        }
        }
        return lista;
    }
}
