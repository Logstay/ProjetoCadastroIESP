package br.com.projeto.repositorio;

import br.com.projeto.entidades.Aluno;

/**
 * 
 * Interface do Repositorio de aluno;
 * 
 * @author 
 *
 */
public interface RepositorioAluno {

	
	boolean matriculaAluno(Aluno aluno);
	
	Aluno buscarAlunoPorMatricula(long matricula);
}
