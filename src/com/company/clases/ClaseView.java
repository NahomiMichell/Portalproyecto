package com.company.clases;

import java.util.ArrayList;

public class ClaseView {
    public void MenuClase(){
        System.out.println("\t Menu Clase");
        System.out.println("1. Ver lista de clases");
        System.out.println("2. Crear clase");
        System.out.println("3. Modificar clase");
        System.out.println("4. Leer clase");
        System.out.println("5. Asignar al maestro");
        System.out.println("6. Agregar un alumno a la clase");
        System.out.println("7. Eliminar un clase");
    }


    void verLista (ArrayList<Clase> clases){
        System.out.println("\t\tClase:");
        System.out.println("#,\tclase, \thorario,\tclase");
        int i = 1;
        for (Clase clase : clases) {
            System.out.println("" + (i++) + "\t" + clase);
        }
    }

    public void pedirclase(){
        System.out.println("Ingrese su clase");
    }
    public void pedirhorario(){
        System.out.println("Ingrese su horario");
    }
    public void pedirposicion(){
        System.out.println("Ingrese su posicion");
    }
}
