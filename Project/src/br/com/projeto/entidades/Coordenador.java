package br.com.projeto.entidades;

import br.com.projeto.enums.Cargo;


/**
 * 
 * Esta classe representa um coordenador que é um Professor e um Funcionario
 * 
 * @author 
 *
 */
public class Coordenador extends Professor {

	private String setor;

	public Coordenador(String nome, int idade, char sexo, String email,
			long telefone, String formação, String curso, String setor, 
			char turno, Cargo cargo) {
		super(nome, idade, sexo, email, telefone, formação, turno, cargo, curso);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}
