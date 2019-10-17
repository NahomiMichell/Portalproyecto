package com.company.maestros;

public class Maestros {
    private String nombre;
    private String clase;

    public Maestros (String nombre,String clase){
        this.nombre = nombre;
        this.clase = clase;
    }
    public Maestros (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    public String toString(){
        return nombre+",\t"+clase;
    }
}
