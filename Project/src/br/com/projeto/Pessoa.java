package br.com.projeto;
/**
 * @author Mateus Pereira, Alex Sim�es e Kaique Moreira.
 */
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected char sexo;
	protected String email;
	protected long telefone;
	
	public void setNome(String nome) {
		if(nome.length()<4 || nome.length()>30) {
			throw new IllegalArgumentException("Nome inv�lido. Tente Novamente.");
		}else {
			this.nome = nome;
		}
	}
	
	public void setIdade(int idade) {
		if(idade <= 0 || idade >= 100) {
			throw new IllegalArgumentException("N�mero inv�lido. Tente Novamente.");
		}
		this.idade = idade;
	}
	
	public void setSexo(char sexo) {
		if(sexo != 'M' && sexo != 'F') {
			throw new IllegalArgumentException("Caracter inv�lido. Tente Novamente.");
		}else {
			this.sexo = sexo;
		}
	}
	
	public void setEmail(String email) {
		if(email.length() <= 13 || email.length() >= 35) {
			throw new IllegalArgumentException("Voc� excedeu o n�mero maximo de caracteres. Tente Novamente.");
		}else {
			this.email = email;
		}
	}
	
	public void setTelefone(long telefone) {
		if(telefone <= 1000000 || telefone >= 99999999) {
			throw new IllegalArgumentException("N�mero de telefone n�o encontrado. Tente Novamente.");
		}else {
			this.telefone = telefone;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public long getTelefone() {
		return this.telefone;
	}
}
