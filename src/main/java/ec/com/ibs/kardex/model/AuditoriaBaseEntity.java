package ec.com.ibs.kardex.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase base de campos de auditoria auditoria
 * @author Andres
 *
 */
@MappedSuperclass
@Getter
@Setter
public class AuditoriaBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Column(name = "FECHAREGISTRO")
    protected Date fechaRegistro;

}
