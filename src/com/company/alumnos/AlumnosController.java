package com.company.alumnos;

import com.company.lector.LectorDeTeclado;

public class AlumnosController {
    AlumnosView av = new AlumnosView();
    AlumnosModel am = new AlumnosModel();
    LectorDeTeclado LDT = new LectorDeTeclado();
    int opcion;

    public void presentarListaAlumnos(){
        av.MenuAlumnos();
    }

    public int Leeropcion() {
        opcion = LDT.getInteger("Ingrese una opción", "Ingreso una opción no valida. Intente de nuevo");
        return opcion;
    }

   public int ObtenerResultado(int opcion){
        switch (opcion){
            case 1:{

            }
            break;
            case 2:{
                av.pedirNombre();
                String nombre = LDT.getString("Ingrese el nombre del alumno", "Ups, error. vuelva a intentar");
                String cuenta = LDT.getString("Ingrese el numero de cuenta", "ups, error. Vuelva a intentar");
                String clase = LDT.getString("Ingrese la clase", "Ups, porfavor vuelva a intentar");
                am.createAlumno(nombre,cuenta,clase);
            }
            break;
            case 3:{

            }
            default:
            {

            }
        }
        return opcion;
    }


}

