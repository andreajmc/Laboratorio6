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
public class Admin {

    private File archivo = null;
    private ArrayList<Pelicula> pelicula;

    public Admin(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
       public void setPelicula(Pelicula p) {
        this.pelicula.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Pelicula t : pelicula) {
                bw.write(t.getName() + ",");
                bw.write(t.getDuracion() + ",");
                bw.write(t.getCategoría() + ",");
                for (Object a : t.getActores()) {
                    bw.write(a + ":");
                }
                bw.write(t.getDirector() + ",");
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
        pelicula = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    pelicula.add(new Pelicula(sc.next(), sc.nextDouble(), sc.next(), new ArrayList(), sc.next(),sc.next(),sc.nextBoolean(),sc.nextBoolean(), sc.next()));
                }
            } catch (Exception ex) {
            } finally {
                sc.close();
            }
        }
    }

}
