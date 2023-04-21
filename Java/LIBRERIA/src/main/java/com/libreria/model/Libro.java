package com.libreria.model;

import java.io.Serializable;

public class Libro implements Serializable {
    private String codiceLibro;
    private  String titoloLibro;
    private String casaEditrice;

    public Libro() {

    }

    public Libro(String codiceLibro, String titoloLibro, String casaEditrice) {
        this.codiceLibro = codiceLibro;
        this.titoloLibro = titoloLibro;
        this.casaEditrice = casaEditrice;
    }

    public String getCodiceLibro() {
        return codiceLibro;
    }

    public void setCodiceLibro(String codiceLibro) {
        this.codiceLibro = codiceLibro;
    }

    public String getTitoloLibro() {
        return titoloLibro;
    }

    public void setTitoloLibro(String titoloLibro) {
        this.titoloLibro = titoloLibro;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codiceLibro='" + codiceLibro + '\'' +
                ", titoloLibro='" + titoloLibro + '\'' +
                ", casaEditrice='" + casaEditrice + '\'' +
                '}';
    }
}
