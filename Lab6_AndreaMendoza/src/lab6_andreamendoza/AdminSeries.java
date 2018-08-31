/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_andreamendoza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class AdminSeries {

    private File archivo = null;
    private ArrayList<Serie> serie;

    public AdminSeries(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setSerie(Serie p) {
        this.serie.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Serie t : serie) {
                bw.write(t.getName() + ",");
                bw.write(t.getDuracion() + ",");
                bw.write(t.getCategoría() + ",");
                for (Object a : t.getActores()) {
                    bw.write(a + ":");
                }
                bw.write(t.getTemporadas() + ",");
                bw.write(t.getProductora() + ",");
                bw.write(t.getIdioma() + ",");
                bw.write(t.isDoblaje() + ",");
                bw.write(t.isSubtitulos() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() throws FileNotFoundException {
        Scanner sc = null;
        serie = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    serie.add(new Serie(sc.next(), sc.nextDouble(), sc.next(), new ArrayList(), sc.nextInt(), sc.next(), sc.next(), sc.nextBoolean(), sc.nextBoolean()));
                }
            } catch (Exception ex) {
            } finally {
                sc.close();
            }
        }
    }

}
