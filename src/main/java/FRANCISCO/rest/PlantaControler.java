package FRANCISCO.rest;


import FRANCISCO.Model_Repository.Planta_Repository;
import FRANCISCO.Plantas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Plantas")
public class PlantaControler {

    private Planta_Repository repository;
    @GetMapping
    public List<Plantas>obter(){return repository.findAll();}

    @Autowired
    public PlantaControler(Planta_Repository repository) {
        this.repository = repository;
    }

@PostMapping
@ResponseStatus(HttpStatus.CREATED)

    public Plantas salvar(@RequestBody Plantas plantas){
        return repository.save(plantas);


}
}
