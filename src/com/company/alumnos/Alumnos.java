package com.company.alumnos;

public class Alumnos {
    private String nombre;
    private String cuenta;
    private String clase;

    public Alumnos(String nombre, String cuenta, String clase) {
    }
    public Alumnos (){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", cuenta='" + cuenta + '\'' +
                ", clase='" + clase + '\'' +
                '}';
    }
}
