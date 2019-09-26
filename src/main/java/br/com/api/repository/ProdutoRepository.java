package br.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public Produto findById(long id);

}
