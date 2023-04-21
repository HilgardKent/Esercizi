package com.scuola.model;

import java.io.Serializable;

public class Scuola implements Serializable
{
    private String codiceMeccanografico;
    private String nomeScuola;
    private String indirizzoScuola;
    private String tipologiaIstituto;
    private String numeroTelefono;

    public Scuola() {}

    public Scuola(String codiceMeccanografico, String nomeScuola, String indirizzoScuola,
                  String tipologiaIstituto, String numeroTelefono)
    {
        this.codiceMeccanografico = codiceMeccanografico;
        this.nomeScuola = nomeScuola;
        this.indirizzoScuola = indirizzoScuola;
        this.tipologiaIstituto = tipologiaIstituto;
        this.numeroTelefono = numeroTelefono;
    }

    public String getCodiceMeccanografico() {
        return codiceMeccanografico;
    }

    public void setCodiceMeccanografico(String codiceMeccanografico) {
        this.codiceMeccanografico = codiceMeccanografico;
    }

    public String getNomeScuola() {
        return nomeScuola;
    }

    public void setNomeScuola(String nomeScuola) {
        this.nomeScuola = nomeScuola;
    }

    public String getIndirizzoScuola() {
        return indirizzoScuola;
    }

    public void setIndirizzoScuola(String indirizzoScuola) {
        this.indirizzoScuola = indirizzoScuola;
    }

    public String getTipologiaIstituto() {
        return tipologiaIstituto;
    }

    public void setTipologiaIstituto(String tipologiaIstituto) {
        this.tipologiaIstituto = tipologiaIstituto;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
