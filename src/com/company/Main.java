package com.company;

import com.company.alumnos.AlumnosController;
import com.company.alumnos.AlumnosModel;
import com.company.alumnos.AlumnosView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       MenuPrincipal mp = new MenuPrincipal();
       mp.MenuPrincipal();
        System.out.println();
       mp.ObtenerRedultadoP(mp.Leeropcion());
    }
}
