package br.com.projeto.entidades;


/**
 * 
 * Esta classe representa um aluno. 
 * 
 * @author 
 *
 */
public class Aluno extends Pessoa {

	private long matricula;
	private String curso;

	public Aluno(String nome, int idade, char sexo, String email, long telefone, 
				 long matricula, String curso) {
		super(nome, idade, sexo, email, telefone);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
