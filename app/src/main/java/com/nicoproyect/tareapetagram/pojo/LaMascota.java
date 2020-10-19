package com.nicoproyect.tareapetagram.pojo;

public class LaMascota {

    private String nombreM;
    private String raitingM;
    private int fotoM;

    public LaMascota(int foto, String nombre, String raiting){
        this.fotoM = foto;
        this.nombreM = nombre;
        this.raitingM = raiting;


    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getRaitingM() {
        return raitingM;
    }

    public void setRaitingM(String raitingM) {
        this.raitingM = raitingM;
    }

    public int getFotoM() {
        return fotoM;
    }

    public void setFotoM(int fotoM) {
        this.fotoM = fotoM;
    }
}
