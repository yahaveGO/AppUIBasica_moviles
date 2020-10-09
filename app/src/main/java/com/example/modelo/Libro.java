package com.example.modelo;

public class Libro {
    private String isnb;
    private String titulo;
    private String autor;
    private String editorial;
    private String edicion;

    public Libro(String isnb, String titulo, String autor, String editorial, String edicion) {
        this.isnb = isnb;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public Libro() {

    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}