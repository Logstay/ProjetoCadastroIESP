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
	
	private String forma��o;
	private String curso;

	public Professor(String nome, int idade, char sexo, String email,
					  long telefone, String forma��o, char turno, Cargo cargo, String curso) {
		super(nome, email, telefone, idade, sexo, turno, cargo);
		
		this.forma��o = forma��o;
		this.curso = curso;
	}

	public String getForma��o() {
		return forma��o;
	}

	public void setForma��o(String forma��o) {
		this.forma��o = forma��o;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
