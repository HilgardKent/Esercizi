package com.libreria.model;

import java.io.Serializable;

public class Utente  implements Serializable {
    private  String codiceClienti;
    private  String nomeCliente;
    private String cognomeCliente;
    private String numeroTelefono;


    public Utente(String codiceClienti, String nomeCliente, String cognomeCliente, String numeroTelefono) {
        this.codiceClienti = codiceClienti;
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "codiceClienti='" + codiceClienti + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", cognomeCliente='" + cognomeCliente + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }

    public String getCodiceClienti() {
        return codiceClienti;
    }

    public void setCodiceClienti(String codiceClienti) {
        this.codiceClienti = codiceClienti;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Utente() {
    }
}
