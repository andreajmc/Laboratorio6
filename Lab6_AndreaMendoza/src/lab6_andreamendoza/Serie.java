package lab6_andreamendoza;

import java.util.ArrayList;

public class Serie extends Media {

    protected int temporadas;

    public Serie(String name, double duracion, String categoría, ArrayList Actores, int temporadas, String productora, String idioma, boolean doblaje, boolean subtitulos) {
        super(name, duracion, categoría, Actores, productora, idioma, doblaje, subtitulos);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

}
