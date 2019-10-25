package co.edu.uco.uconotas.service.persona.impl;

import co.edu.uco.uconotas.converter.TipoDocumentoIdentidadConverter;
import co.edu.uco.uconotas.model.TipoDocumentoIdentidad;
import co.edu.uco.uconotas.repository.TipoDocumentoIdentidadRepository;
import co.edu.uco.uconotas.service.persona.TipoDocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoIdentidadServiceImpl implements TipoDocumentoIdentidadService {

    @Autowired
    private TipoDocumentoIdentidadRepository tipoDocumentoIdentidadRepository;

    @Autowired
    private TipoDocumentoIdentidadConverter converter;

    @Override
    public List<TipoDocumentoIdentidad> findAll() { return converter.entityToModel(tipoDocumentoIdentidadRepository.findAll()); }

}
