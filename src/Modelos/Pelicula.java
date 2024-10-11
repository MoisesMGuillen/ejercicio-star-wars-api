package Modelos;

import com.google.gson.annotations.SerializedName;

public class Pelicula {
    @SerializedName("title")
    private String nombre;
    @SerializedName("episode_id")
    private int episodio;
    @SerializedName("opening_crawl")
    private String creditosIniciales;


    @Override
    public String toString() {
        return "Nombre: "+this.nombre + "\nNro de Episodio: "+this.episodio+"\nCreditos iniciales: "+this.creditosIniciales;
    }
}
