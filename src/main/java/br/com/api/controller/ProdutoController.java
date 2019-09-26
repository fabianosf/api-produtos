package br.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.models.Produto;
import br.com.api.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos") // nome da aplicacao
@CrossOrigin(origins = "*")//liberar todos os dominios, podem acessar
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@GetMapping("/produtos")
	@ApiOperation(value = "Retorna uma lista de Produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value = "Retorna um produto")
	public Produto listaProduto(@PathVariable(value = "id") long id){
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")	
	@ApiOperation(value = "Salva um produto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")	
	@ApiOperation(value = "Deleta um produto")
	public void deleteProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	

	@PutMapping("/produto")	
	@ApiOperation(value = "Atualiza um produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	
}
