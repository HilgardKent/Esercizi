package com.scuola.repository;

import com.scuola.model.Studente;

import java.util.List;

public interface StudenteRepository {
    /**
     * Metodo che selezina tutti gli studenti esistenti e presenti nel DB
     * @return lista di tutte le scuole
     * */
    List<Studente> selezionaStudente();

    /**
     * Metodo che inserisce un'istanza di scuola nel DB
     * @param studente: istanza di scuola da inserire
     * @return istanza della scuola creata
     * */
    Studente inserisciStudente(Studente studente);

    /**
     * Metodo che modifica un'istanza di scuola presente nel DB
     * @param studente: istanza di scuola da modificata
     * @return istanza della scuola modificata
     * */
    Studente modificaStudente (Studente studente);

    Boolean eliminaStudente(String matricola);
}
