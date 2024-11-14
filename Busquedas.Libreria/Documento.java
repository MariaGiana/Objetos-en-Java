package Ejercicio2;

import java.util.ArrayList;

public class Documento {
    public String titulo;
    public ArrayList<String> listaAutores;
    public String contenido;
    public ArrayList<String> palabrasClaves;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.listaAutores = new ArrayList<>();
        this.palabrasClaves = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void addAutores(String autor) {
        listaAutores.add(autor);
    }

    public boolean tieneAutor(String autor) {
        return listaAutores.contains(autor);
    }

    public void removeAutores(String autor) {
        listaAutores.remove(autor);
    }

    public void addPalabra(String palabra) {
        palabrasClaves.add(palabra);
    }

    public boolean tienePalabra(String palabra) {
        return palabrasClaves.contains(palabra);
    }

    public void removePalabra(String palabra) {
        palabrasClaves.remove(palabra);
    }

    public boolean equal(Object o1) {
        try {
            //casting
            Documento doc = (Documento) o1;
            for (int i = 0; i < listaAutores.size(); i++) {
                if (!doc.tieneAutor(listaAutores.get(i)))
                    return false;
            }
            for (int i = 0; i < palabrasClaves.size(); i++) {
                if (!doc.tienePalabra(palabrasClaves.get(i)))
                    return false;
            }
                return titulo.equals(doc.getTitulo()) &&
                        contenido.equals(doc.getContenido())&&
                        palabrasClaves.equals(doc.getPalabrasClaves())&&
                        listaAutores.equals(doc.getListaAutores());

        }
        catch(Exception e) {
            return false;

        }
        }

    public ArrayList<String> getListaAutores() {
        return listaAutores;
    }

    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    public String toString () {
            return titulo + "-" + contenido + "-" + palabrasClaves+ "-" + listaAutores;
        }
    }
