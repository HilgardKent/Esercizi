package com.scuola.controller;


import com.scuola.model.Studente;
import com.scuola.repository.StudenteRepository;
import com.scuola.repository.impl.StudenteRepositoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/studente") //indirizzo controller studente
public class StudenteController implements StudenteRepository {


    @Override
    @GetMapping(value = "/selezionaStudente")
    public List<Studente> selezionaStudente()
    {
        return StudenteRepositoryImpl.selezionaStudente();
    }

    @Override
    @PostMapping(value = "/inserisciStudente")
    public Studente inserisciStudente(@RequestBody Studente studente)
    {
        Studente s = StudenteRepositoryImpl.inserisciStudente(studente);
        System.out.println("Studente " + s.getMatricola() + " Inserita");
        return s;
    }

    @Override
    @PutMapping (value = "/modificaStudente")
    public Studente modificaStudente(@RequestBody Studente studente) {
        Studente s = StudenteRepositoryImpl.modificaStudente(studente);
        System.out.println("Scuola " + s.getMatricola() + " aggiornata");
        return s;
    }

    @Override
    @DeleteMapping(value = "eliminaStudente")
    public Boolean eliminaStudente(@RequestParam("p") String matricola) {
        boolean s = StudenteRepositoryImpl.eliminaStudente(matricola);
        System.out.println("Studente " + matricola + " eliminata");
        return s;
    }
}
