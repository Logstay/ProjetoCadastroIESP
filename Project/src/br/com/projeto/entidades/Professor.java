package br.com.projeto.entidades;

import br.com.projeto.enums.Cargo;


/**
 * 
 * Esta é a classe que reprensata professor e ele é um funcionario.
 * 
 * @author 
 *
 */
public class Professor extends Funcionario {
	
	private String formação;
	private String curso;

	public Professor(String nome, int idade, char sexo, String email,
					  long telefone, String formação, char turno, Cargo cargo, String curso) {
		super(nome, email, telefone, idade, sexo, turno, cargo);
		
		this.formação = formação;
		this.curso = curso;
	}

	public String getFormação() {
		return formação;
	}

	public void setFormação(String formação) {
		this.formação = formação;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
