package com.libreria.controller;

import com.libreria.model.Utente;
import com.libreria.repository.UtenteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/utente")
public class UtenteController
{
    @GetMapping(value = "selezionaUtenti")
    public List<Utente> selezionaUtenti()
    {
        return UtenteRepository.selezionautenti();

    }
}
