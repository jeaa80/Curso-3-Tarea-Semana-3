package com.jesus.curso3_semana3_recyclerview_petagram.Adapter;


public class Usuarios {
    private int id;
    private String nombre;
    private String likes;
    private int foto;

    public Usuarios(int id, String nombre, String likes, int foto) {
        this.id     = id;
        this.nombre = nombre;
        this.likes  = likes;
        this.foto   = foto;
    }

    public Usuarios(int id) {
        this.id = id;
    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLikes() { return likes; }

    public void setLikes(String likes) { this.likes = likes; }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", likes='" + likes + '\'' +
                '}';
    }

}
