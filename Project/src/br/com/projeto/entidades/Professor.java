package br.com.projeto.entidades;

import br.com.projeto.enums.Cargo;


/**
 * 
 * Esta � a classe que reprensata professor e ele � um funcionario.
 * 
 * @author 
 *
 */
public class Professor extends Funcionario {
	
	private String formacao;
	private String curso;

	public Professor(String nome, int idade, char sexo, String email,
					  long telefone, String formacao, char turno, Cargo cargo, String curso) {
		super(nome, email, telefone, idade, sexo, turno, cargo);
		
		this.formacao = formacao;
		this.curso = curso;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
