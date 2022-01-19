package ec.com.ibs.kardex.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import ec.com.ibs.kardex.model.ArticuloEntity;

/**
 * Test repository articulos.
 * @author Andres
 *
 */
@DataJpaTest
public class ArticuloRepositoryTest {
	@Autowired
	IArticuloRepository articuloRepository;
	
	@Test
	public void test_guardadoArticulo_retorneArticuloGuardado() {
		ArticuloEntity articuloEntity = ArticuloEntity.builder()
				.codigoBarras("123333")
				.descripcion("Camiseta Iron man")
				.precio(20D)
				.existencia(2)
				.build();
//		
		articuloRepository.save(articuloEntity);
//		
		assertThat(articuloEntity).isNotNull();
		assertThat(articuloEntity.getIdArticulo()).isGreaterThan(0);
	}
}
