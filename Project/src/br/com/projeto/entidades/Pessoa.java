package br.com.projeto.entidades;

/**
 * 
 * Esta classe servi de base para todas as outras classes.
 * 
 * Veja que ela apenas tem representação de dados, logo não pode-se ter 
 * regras de negocio associadas a ela.
 * 
 * @author 
 *
 */
public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String email;
	private long telefone;

	
	
	public Pessoa(String nome, int idade, char sexo, String email, long telefone) {		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

}
