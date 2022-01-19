package ec.com.ibs.kardex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.ibs.kardex.model.ArticuloEntity;

public interface IArticuloRepository extends JpaRepository<ArticuloEntity, Long>{

}
