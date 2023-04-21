package com.scuola.controller;

import com.scuola.model.Scuola;
import com.scuola.repository.ScuolaRepository;
import com.scuola.repository.impl.ScuolaRepositoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/scuola") //indirizzo controller scuola
public class ScuolaController implements ScuolaRepository
{
    @Override
    @GetMapping(value = "/selezionaScuole")
    public List<Scuola> selezionaScuole()
    {
        return ScuolaRepositoryImpl.selezionaScuole();
    }

    @Override
    @PostMapping (value = "/inserisciScuola")
    public Scuola inserisciScuola(@RequestBody Scuola scuola)
    {
        Scuola s = ScuolaRepositoryImpl.inserisciScuola(scuola);
        System.out.println("Scuola " + s.getCodiceMeccanografico() + " Inserita");
        return s;
    }

    @Override
    @PutMapping (value = "/modificaScuola")
    public Scuola modificaScuola(@RequestBody Scuola scuola) {
        Scuola s = ScuolaRepositoryImpl.modificaScuola(scuola);
        System.out.println("Scuola " + s.getCodiceMeccanografico() + " aggiornata");
        return s;
    }

    @Override
    @DeleteMapping(value = "eliminaScuola")
    public Boolean eliminaScuola(@RequestParam("p") String codiceMeccanografico) {
        boolean s = ScuolaRepositoryImpl.eliminaScuola(codiceMeccanografico);
        System.out.println("Scuola " + codiceMeccanografico + " eliminata");
        return s;
    }
}
