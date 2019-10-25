package co.edu.uco.uconotas.converter;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonaConverter {


    public Persona entityToModel(PersonaEntity personaEntity) {
        var persona = new Persona();
        persona.setId(personaEntity.getId());
        persona.setNombre(personaEntity.getNombre());
        persona.setApellido(personaEntity.getApellido());
        persona.setNroDocumento(personaEntity.getNroDocumento());
        persona.setTipoDocumentoIdentidad(personaEntity.getTipoDocumentoIdentidad());
        persona.setTelefono(personaEntity.getTelefono());
        persona.setCorreo(personaEntity.getTelefono());
        return persona;
    }


    public PersonaEntity modelToEntity(Persona persona) {
        var personaEntity = new PersonaEntity();
        personaEntity.setId(persona.getId());
        personaEntity.setNombre(persona.getNombre());
        personaEntity.setApellido(persona.getApellido());
        personaEntity.setNroDocumento(persona.getNroDocumento());
        personaEntity.setTipoDocumentoIdentidad(persona.getTipoDocumentoIdentidad());
        personaEntity.setTelefono(persona.getTelefono());
        personaEntity.setCorreo(persona.getCorreo());
        return personaEntity;
    }

    public List<Persona> entityToModel(List<PersonaEntity> personasEntity) {
        List<Persona> personas = new ArrayList<>(personasEntity.size());
        personasEntity.forEach(entity -> {
            personas.add(entityToModel(entity));
        });
        return personas;
    }

    public Persona entityToModel(Optional<PersonaEntity> personaEntity) {
        Persona persona = null;
        if (personaEntity.isPresent()) {
            persona = new Persona();
            persona.setId(personaEntity.get().getId());
            persona.setNombre(personaEntity.get().getNombre());
            persona.setApellido(personaEntity.get().getApellido());
            persona.setNroDocumento(personaEntity.get().getNroDocumento());
            persona.setTipoDocumentoIdentidad(personaEntity.get().getTipoDocumentoIdentidad());
            persona.setTelefono(personaEntity.get().getTelefono());
            persona.setCorreo(personaEntity.get().getCorreo());
            return persona;
        }
        return persona;
    }
}
