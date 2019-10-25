package co.edu.uco.uconotas.entity;

import co.edu.uco.uconotas.model.TipoDocumentoIdentidad;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tipodocumentoidentidad")
public class TipoDocumentoIdentidadEntity extends TipoDocumentoIdentidad {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "activo")
    private boolean activo;
}
