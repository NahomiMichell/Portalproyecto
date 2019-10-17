package com.company.alumnos;

import com.company.lector.LectorDeTeclado;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.util.ArrayList;

public class AlumnosController {
    AlumnosView av = new AlumnosView();
    AlumnosModel am = new AlumnosModel();
    LectorDeTeclado LDT = new LectorDeTeclado();
    int opcion;

    public void presentarListaAlumnos(){
        av.verLista(am.getAlumnos());
    }


    public int Leeropcion() {
        opcion = LDT.getInteger("Ingrese una opción", "Ingreso una opción no valida. Intente de nuevo");
        return opcion;
    }

   public int ObtenerResultado(int opcion){
        switch (opcion){
            case 1:{
              presentarListaAlumnos();
            }
            break;
            case 2:{
                String nombre = obtenernombre();
                String cuenta = obtenerCuenta();
                String clase = obtenerClase();
                am.createAlumno(nombre,cuenta,clase);

            }
            break;
            case 3:{

            }
            break;
            case 4 :{
                
            }
            break;
            case 5:{
                int posicion = obtenerPosicicon();
                am.deleteAlumno(posicion);
            }
            default:
            {

            }
        }
        return opcion;
    }

    private String obtenernombre() {
        return LDT.getString("Ingrese el nombre","Ups, vuelva a intentar");
    }
    private String obtenerCuenta(){
        return LDT.getString("Ingrese su cuenta","Ups, vuelva a intentar");
    }
    private String obtenerClase(){
        return LDT.getString("Ingrese el clase", "Ups, vuelva a intentar");
    }
    private int obtenerPosicicon(){
        return LDT.getInteger("Ingrese la posicion del alumno que desea remover", "Ups, vuelva a intentar");
    }
}

