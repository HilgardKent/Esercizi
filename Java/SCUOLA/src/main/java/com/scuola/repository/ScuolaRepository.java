package com.scuola.repository;

import com.scuola.model.Scuola;

import java.util.List;

public interface ScuolaRepository
{
    /**
     * Metodo che selezina tutte le scuole esistenti e presenti nel DB
     * @return lista di tutte le scuole
     * */
    List<Scuola> selezionaScuole();

    /**
     * Metodo che inserisce un'istanza di scuola nel DB
     * @param scuola: istanza di scuola da inserire
     * @return istanza della scuola creata
     * */
    Scuola inserisciScuola(Scuola scuola);

    /**
     * Metodo che modifica un'istanza di scuola presente nel DB
     * @param scuola: istanza di scuola da modificata
     * @return istanza della scuola modificata
     * */
    Scuola modificaScuola (Scuola scuola);

    Boolean eliminaScuola(String codiceMeccanografico);
}
