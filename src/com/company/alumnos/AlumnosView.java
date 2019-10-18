package com.company.alumnos;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
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


    void verLista (ArrayList<Alumnos> alumnos){
        System.out.println("\t\tAlumnos:");
        System.out.println("#,\tnombre, \tcuenta,\tclase");
        int i = 1;
        for (Alumnos alumno : alumnos) {
            System.out.println("" + (i++) + "\t" + alumno);
        }
    }
    public void pedirnombre(){
        System.out.println("Ingrese su nombre");
    }
    public void pedircuenta(){
        System.out.println("Ingrese su cuenta");
    }
    public void pedirclase(){
        System.out.println("Ingrese su clase");
    }
    public void pedirposicion(){
        System.out.println("Ingrese su posicion");
    }


    }

