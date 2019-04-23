package br.com.projeto.repositorio;

import br.com.projeto.entidades.Funcionario;
import br.com.projeto.entidades.Professor;


/**
 * 
 * Interface que define as a��es do repositorio de funcionarios.
 * 
 * @author 
 *
 */
public interface RepositorioFuncionarios {
	
	boolean cadastrarFuncionario(Funcionario funcionario);
	
	void quantidadeFuncioanrios();
	
	Professor buscarProfessorPeloNome(String nome);
}
