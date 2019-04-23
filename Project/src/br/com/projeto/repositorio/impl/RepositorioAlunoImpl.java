package br.com.projeto.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.entidades.Aluno;
import br.com.projeto.repositorio.RepositorioAluno;

/**
 * 
 * Essa classe é responsavel por centralizar as operações de aluno.
 * Aqui estara o cadastrar, listar, consultar, excluir, etc.
 * 
 * 
 * @author 
 *
 */
public class RepositorioAlunoImpl implements RepositorioAluno{

	private List<Aluno> alunos;
	private static RepositorioAlunoImpl instancia;
	
	private RepositorioAlunoImpl(){
		alunos = new ArrayList<Aluno>();
	}
	
	public static final RepositorioAlunoImpl gerarInstacia() {
		if(instancia == null) {
			instancia = new RepositorioAlunoImpl();
		}
		return instancia;
	}
		
	/**
	 * 
	 * Esse metodo é responsavel por cadastrar um novo aluno.
	 * 
	 * @param aluno
	 * @return
	 */
	public boolean matriculaAluno(Aluno aluno){
		aluno.setMatricula(geradorMatricula());
		alunos.add(aluno);
		
		return true;
	}
	
	/**
	 * 
	 * Busca alunos pelo numero da matricula.
	 * 
	 * @param matricula
	 * @return
	 */
	public Aluno buscarAlunoPorMatricula(long matricula){
		for (Aluno aluno : alunos) {
			if(aluno.getMatricula() == matricula){
				return aluno;
			}
		}
		
		return null;
	}
	
	
	
	/**
	 * 
	 * Retorna ultimo aluno matriculado.
	 * 
	 * @return
	 */
	private Aluno retornaUltimaMatricula(){
		if(alunos.isEmpty()){
			return alunos.get(alunos.size()-1);
		}
		
		return null;				
	}
	
	
	/**
	 * 
	 * Gera a matricula para um novo aluno.
	 * 
	 * @return
	 */
	private long geradorMatricula(){
		Aluno ultimoAluno = retornaUltimaMatricula();
		if(ultimoAluno != null){
			return ultimoAluno.getMatricula()+1;			
		}else{
			return 1000001;
		}		
	}
}
