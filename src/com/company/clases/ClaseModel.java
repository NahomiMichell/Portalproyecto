package com.company.clases;

import com.company.alumnos.Alumnos;
import com.company.maestros.Maestros;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClaseModel {
    private ArrayList<Clase> clases;
    private  ArrayList<Alumnos> alumnos;

    public ArrayList<Clase> getClase(){
        return clases;
    }

    ClaseModel(){
        clases = new ArrayList<>();
        try {
            leerArchivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void  leerArchivo() throws IOException {
        File file = new File("Lista.csv");
        FileReader fileReader = new FileReader(file);

        CsvPreference.Builder builder = new CsvPreference.Builder('\'',',',"\n");
        CsvBeanReader beanReader = new CsvBeanReader(fileReader,CsvPreference.STANDARD_PREFERENCE);

        final String[] header = beanReader.getHeader(true);
        final CellProcessor[] processors = new CellProcessor[] {
                new NotNull(), // clase
                new NotNull(), // horario
        };

        Clase clase = null;

        while ((clase = beanReader.read(Clase.class,header,processors))
                != null){
            clases.add(clase);
        }

        beanReader.close();
        fileReader.close();
        file = null;
    }
    public void createClase(String clase, String horario){
        clases.add(new Clase(clase,horario));
    }
    public void updateClase(int index, String clase, String horario){
        clases.set(index, new Clase(clase,horario));
    }
    public void readClase (int index){
        System.out.println(clases.get(index));
    }
    public void asignarMaestro(Maestros maestro, String clase){
        System.out.println("Proximamente va a estar esta caracteristica, espere la actualización.");
        System.out.println("Esperamos entienda. Si tiene alguna duda no dude en comunicarse con nosotros");
        System.out.println("Numero de atención al cliente: +504 31766885");
    }
    public void agregarAlumnoClase(Alumnos alumno, String clase){
        System.out.println("Proximamente va a estar esta caracteristica, espere la actualización.");
        System.out.println("Esperamos entienda. Si tiene alguna duda no dude en comunicarse con nosotros");
        System.out.println("Numero de atención al cliente: +504 31766885");
    }
    public void deleteClase (int index){
        clases.remove(index);
    }
}

