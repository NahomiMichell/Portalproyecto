package com.company;

import com.company.alumnos.AlumnosController;
import com.company.alumnos.AlumnosModel;
import com.company.alumnos.AlumnosView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AlumnosView av = new AlumnosView();
       AlumnosController ac = new AlumnosController();
        av.MenuAlumnos();
        ac.ObtenerResultado(ac.Leeropcion());
        ac.presentarListaAlumnos();

    }
}
