package co.edu.uco.uconotas.controller;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import co.edu.uco.uconotas.service.persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/{id}/persona")
    public Persona findById(@PathVariable(value = "id", required = true) Long id){
        return personaService.findById(id);
    }
    @GetMapping("/{nroDocumento}/personad")
    public Persona findBynroDocumento(@PathVariable(value= "nroDocumento", required = true) String nroDocumento){
        return personaService.findBynroDocumento(nroDocumento);
    }

    @GetMapping("/personas")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @DeleteMapping("/{id}/persona")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
         personaService.deleteById(id);
    }

    @PostMapping("/persona")
    public void insert(@RequestBody Persona persona){
        personaService.save(persona);
    }

    @PutMapping("/{id}/persona")
    public void update(@RequestBody PersonaEntity personaEntity,@PathVariable(value = "id",required = true) Long id){
        personaEntity.setId(id);
        personaService.save(personaEntity);
    }

    //https://stackblitz.com/edit/angular-yvdgp1
    //https://www.w3schools.com/bootstrap/bootstrap_glyphicons.asp


}
