package com.company;

import com.company.alumnos.AlumnosController;
import com.company.alumnos.AlumnosView;
import com.company.clases.ClaseController;
import com.company.clases.ClaseView;
import com.company.lector.LectorDeTeclado;
import com.company.maestros.MaestrosController;
import com.company.maestros.MaestrosView;

public class MenuPrincipal {
    int opcion;
    LectorDeTeclado LDT = new LectorDeTeclado();
    public void MenuPrincipal(){
        System.out.println("\tPortal Universidad");
        System.out.println("Eliga una opcion");
        System.out.println("\n 1.Menu Alumnos");
        System.out.println("\n 2.Menu Maestros");
        System.out.println("\n 3.Menu Clase");
    }
    public int Leeropcion() {
        opcion = LDT.getInteger("Ingrese una opción", "Ups, opcion no valida. Intente de nuevo");
        return opcion;
    }
    public int ObtenerRedultadoP(int opcion) {
        switch (opcion) {
            case 1: {
                AlumnosView av = new AlumnosView();
                AlumnosController ac = new AlumnosController();
                av.MenuAlumnos();
                System.out.println();
                ac.ObtenerResultado(ac.Leeropcion());
            }
            break;
            case 2: {
                MaestrosView mv = new MaestrosView();
                MaestrosController mc = new MaestrosController();
                mv.MenuMaestros();
                System.out.println();
                mc.ObtenerResultado(mc.Leeropcion());
            }
            break;
            case 3: {
                ClaseView cv = new ClaseView();
                ClaseController cc = new ClaseController();
                cv.MenuClase();
                System.out.println();
                cc.ObtenerResultado(cc.Leeropcion());
            }
            break;
        }
        return opcion;
    }

}
