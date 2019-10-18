package com.company.maestros;

public class Maestros {
    private String cargo;
    private String nombre;

    public Maestros (String cargo, String nombre){
        this.cargo = cargo;
        this.nombre = nombre;
    }
    public Maestros (){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String toString(){
        return nombre+",\t"+cargo;
    }
}
