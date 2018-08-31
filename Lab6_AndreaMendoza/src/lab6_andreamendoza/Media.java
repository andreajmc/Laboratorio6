package lab6_andreamendoza;

import java.util.ArrayList;

public class Media {
protected String name;
protected double duracion;
protected String categoría;
protected ArrayList Actores;
protected String productora;
protected String idioma;
protected boolean doblaje;
protected boolean subtitulos;

    public Media(String name, double duracion, String categoría, ArrayList Actores, String productora, String idioma, boolean doblaje, boolean subtitulos) {
        this.name = name;
        this.duracion = duracion;
        this.categoría = categoría;
        this.Actores = Actores;
        this.productora = productora;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subtitulos = subtitulos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public ArrayList getActores() {
        return Actores;
    }

    public void setActores(ArrayList Actores) {
        this.Actores = Actores;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isDoblaje() {
        return doblaje;
    }

    public void setDoblaje(boolean doblaje) {
        this.doblaje = doblaje;
    }

    public boolean isSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(boolean subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    

}
