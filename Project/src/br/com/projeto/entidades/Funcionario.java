package br.com.projeto.entidades;

import br.com.projeto.enums.Cargo;


/**
 * 
 * Aqui é um funcionario, um tipo generico que vai servir de base para os outros.
 * 
 * @author p_991264
 *
 */
public class Funcionario extends Pessoa {
	private Cargo cargo;
	private char turno;

	
	public Funcionario(String nome, String email, long telefone, 
						int idade, char sexo, char turno, Cargo cargo){
		super(nome, idade, sexo, email, telefone);
		this.cargo = cargo;
		this.turno = turno;
		
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

}
