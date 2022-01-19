/**
 * 
 */
package ec.com.ibs.kardex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase de articulo.
 * @author Andres
 *
 */


@Getter
@Setter
@Builder
@AllArgsConstructor

@Entity
@Table(name = "SCKARTICULO")
public class ArticuloEntity extends AuditoriaBaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticulo;

	@Column(name = "CODIGOBARRAS", nullable = false)
    private String codigoBarras;

    @Column
    private String descripcion;

    @Column
    private Double precio;

    @Column
    private Integer existencia;
	
    @Version
    private Integer version;
}
