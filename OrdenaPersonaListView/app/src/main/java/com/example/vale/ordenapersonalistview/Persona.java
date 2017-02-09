package com.example.vale.ordenapersonalistview;

/**
 * Created by vale on 8/02/17.
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return nombre + " " +edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
