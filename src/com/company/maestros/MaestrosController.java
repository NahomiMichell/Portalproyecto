package com.company.maestros;

import com.company.lector.LectorDeTeclado;

public class MaestrosController {
    LectorDeTeclado LDT = new LectorDeTeclado();
    int opcion;
    private MaestrosView mv;
    private MaestrosModel mm;


    public MaestrosController(){
        mv = new MaestrosView();
        mm= new MaestrosModel();
    }

    public void presentarListaMaestros(){
        mv.verLista(mm.getMaestros());
    }


    public int Leeropcion() {
        opcion = LDT.getInteger("Ingrese una opción", "Ups, opcion no valida. Intente de nuevo");
        return opcion;
    }

    public int ObtenerResultado(int opcion){
        switch (opcion){
            case 1:{
                presentarListaMaestros();
            }
            break;
            case 2:{
                String nombre = obtenernombre();
                String clase = obtenerClase();
                mm.createMaestro(nombre,clase);
                System.out.println("Se agrego con exito el maestro.");

            }
            break;
            case 3:{
               mv.pedirposicion();
               int posicion = obtenerPosicicon();
               mv.pedirnombre();
               String nombre = obtenernombre();
               mv.pedirclase();
               String clase = obtenerClase();
               mm.updateMaestro(posicion,nombre,clase);
                System.out.println("Se modifico ");
            }
            break;
            case 4 :{

            }
            break;
            case 5:{
                int posicion = obtenerPosicicon();
                mm.deleteMestro(posicion);
                System.out.println("Se elimino con exito");
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
    private String obtenerClase(){
        return LDT.getString( "Ups, vuelva a intentar");
    }
    private int obtenerPosicicon(){
        return LDT.getInteger("Ups, vuelva a intentar");
    }
}
