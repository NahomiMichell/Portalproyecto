package com.company.alumnos;

import com.company.lector.LectorDeTeclado;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.util.ArrayList;

public class AlumnosController {
   private AlumnosView av;
   private AlumnosModel am;
    LectorDeTeclado LDT = new LectorDeTeclado();
    int opcion;

    public AlumnosController(){
        av = new AlumnosView();
        am= new AlumnosModel();
    }

    public void presentarListaAlumnos(){
        av.verLista(am.getAlumnos());
    }


    public int Leeropcion() {
        opcion = LDT.getInteger("Ingrese una opción", "Ups, opcion no valida. Intente de nuevo");
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
                System.out.println("Se agrego con exito el alumno.");

            }
            break;
            case 3:{
                av.pedirposicion();
                int posicion = obtenerPosicionModificar();
                av.pedirnombre();
                String nombre = obtenernombre();
                av.pedircuenta();
                String cuenta = obtenerCuenta();
                av.pedirclase();
                String clase = obtenerClase();
               am.updateAlumno(posicion,nombre,cuenta,clase);
                presentarListaAlumnos();
                System.out.println("Se modifico con exito el alumno");
            }
            break;
            case 4 :{
                int posicion = obtenerPosicionLeer();
                am.readAlumno(posicion);
            }
            break;
            case 5:{
                int posicion = obtenerPosiciconRemover();
                am.deleteAlumno(posicion);
            }
            default:
            {

            }
        }
        return opcion;
    }
    private String obtenernombre() {
        return LDT.getString("Ups, vuelva a intentar");
    }
    private String obtenerCuenta(){
        return LDT.getString("Ups, vuelva a intentar");
    }
    private String obtenerClase(){
        return LDT.getString( "Ups, vuelva a intentar");
    }
    private int obtenerPosiciconRemover(){ return LDT.getInteger( "Ups, vuelva a intentar"); }
    private int obtenerPosicionModificar(){ return LDT.getInteger("Ups, vuelva a intentar"); }
    private int obtenerPosicionLeer(){ return LDT.getInteger("Ups, vuelva a intentar"); }
}

