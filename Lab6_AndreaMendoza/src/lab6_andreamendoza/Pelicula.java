package lab6_andreamendoza;

import java.util.ArrayList;

public class Pelicula extends Media{    
String Director;

    public Pelicula(String name, double duracion, String categoría, ArrayList Actores, String productora, String idioma, boolean doblaje, boolean subtitulos, String Director) {
        super(name, duracion, categoría, Actores, productora, idioma, doblaje, subtitulos);
        this.Director = Director;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
    
    
    

}
