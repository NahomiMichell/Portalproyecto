package com.company.maestros;

import com.company.alumnos.Alumnos;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MaestrosModel {
    private ArrayList<Maestros> maestros;

    public ArrayList<Maestros> getMaestros(){
        return maestros;
    }

    MaestrosModel(){
        maestros = new ArrayList<>();
        try {
            leerArchivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void  leerArchivo() throws IOException {
        File file = new File("");
        FileReader fileReader = new FileReader(file);

        CsvPreference.Builder builder = new CsvPreference.Builder('\'',',',"\n");
        CsvBeanReader beanReader = new CsvBeanReader(fileReader,CsvPreference.STANDARD_PREFERENCE);

        final String[] header = beanReader.getHeader(true);
        final CellProcessor[] processors = new CellProcessor[] {
                new NotNull(), // nombre
                new NotNull(), // cuenta
                new NotNull(), // clase
        };

        Maestros maestro = null;

        while ((maestro = beanReader.read(Maestros.class,header,processors))
                != null){
            maestros.add(maestro);
        }

        beanReader.close();
        fileReader.close();
        file = null;
    }
    public void createMaestro(String nombre, String clase){
        maestros.add(new Maestros(nombre, clase));
    }
    public void updateMaestro(int index, String nombre, String clase){
        maestros.set(index, new Maestros(nombre,clase));
    }
    public void deleteMestro (int index){
        maestros.remove(index);
    }
}
