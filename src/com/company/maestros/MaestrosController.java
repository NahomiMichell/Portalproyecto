package com.company.maestros;

import com.company.lector.LectorDeTeclado;

public class MaestrosController {
    MaestrosView mv = new MaestrosView();
    MaestrosModel mm = new MaestrosModel();
    LectorDeTeclado LDT = new LectorDeTeclado();
    int opcion;

    public void presentarListaAlumnos(){
        mv.verLista(mm.getMaestros());
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
                String clase = obtenerClase();
                mm.createMaestro(nombre,clase);

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
                mm.deleteMestro(posicion);
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
    private String obtenerClase(){
        return LDT.getString("Ingrese el clase", "Ups, vuelva a intentar");
    }
    private int obtenerPosicicon(){
        return LDT.getInteger("Ingrese la posicion del alumno que desea remover", "Ups, vuelva a intentar");
    }
}
