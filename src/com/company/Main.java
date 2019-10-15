package com.company;

import com.company.alumnos.AlumnosController;
import com.company.alumnos.AlumnosModel;
import com.company.alumnos.AlumnosView;

public class Main {

    public static void main(String[] args) {
        AlumnosView av = new AlumnosView();
        AlumnosModel am = new AlumnosModel();
        AlumnosController ac = new AlumnosController();

        av.MenuAlumnos();
        ac.ObtenerResultado(ac.Leeropcion());
    }
}
