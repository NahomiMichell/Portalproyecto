package com.company.alumnos;

import java.util.ArrayList;

public class AlumnosView {
    public void MenuAlumnos(){
        System.out.println("\t Menu Alumnos");
        System.out.println("1. Ver lista de alumnos ");
        System.out.println("2. Crear un alumno");
        System.out.println("3. Modificar un alumno");
        System.out.println("4. Leer alumno");
        System.out.println("5. Eliminar un alumno");
    }

    void pedirNombre(){
        System.out.println("ingrese el Nombre");
    }

    void pedirAnimalFavorito(){
        System.out.println("ingrese animal favorito");
    }

    void verLista(ArrayList<Alumnos> alumnos){
        System.out.println("\t\tAlumnos:");
        System.out.println("#,\tnombre, \tanimalFavorito");
        int i = 1;
        for (Alumnos alumno : alumnos){
            System.out.println(""+(i++)+"\t"+alumno);
        }
    }


}
