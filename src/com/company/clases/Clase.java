package com.company.clases;

public class Clase {

private String clase;
private String horario;


    public Clase(String clase, String horario) {
        this.clase = clase;
        this.horario = horario;
    }
    public Clase(){

    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String toString() {
        return clase+"\t"+horario;
    }
}
