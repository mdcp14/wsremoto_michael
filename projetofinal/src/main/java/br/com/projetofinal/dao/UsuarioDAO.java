package br.com.projetofinal.dao;
/*Design Pattern => DAO => Data Access Object;
 * O DAO é uma classe/interface que é responsável pelo CRUD.
 * C = Create (cadastra algum dado) - insert
 * R = Read   (consulta algum dado) - select
 * U = Update (altera algum dado)   - update
 * D = Delete (exclui algum dado)   - delete 
 * */

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer > {

	/*
	 * save() => gravar ou alterar um registro/linha da tabela
	 * findById() => pesquisar pela PK
	 * findAll() => pesquisar todos
	 * deleteById() => apaga pelo ID
	 * deletaAll() => apaga todas as linhas da tabela
	 * 
	 * */
	
	
	
}
