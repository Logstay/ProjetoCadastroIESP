package br.com.projeto;
/**
 * @author Mateus Pereira, Alex Simões e Kaique Moreira.
 */
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected char sexo;
	protected String email;
	protected long telefone;
	
	public void setNome(String nome) {
		if(nome.length()<4 || nome.length()>30) {
			throw new IllegalArgumentException("Nome inválido. Tente Novamente.");
		}else {
			this.nome = nome;
		}
	}
	
	public void setIdade(int idade) {
		if(idade <= 0 || idade >= 100) {
			throw new IllegalArgumentException("Número inválido. Tente Novamente.");
		}
		this.idade = idade;
	}
	
	public void setSexo(char sexo) {
		if(sexo != 'M' && sexo != 'F') {
			throw new IllegalArgumentException("Caracter inválido. Tente Novamente.");
		}else {
			this.sexo = sexo;
		}
	}
	
	public void setEmail(String email) {
		if(email.length() <= 13 || email.length() >= 35) {
			throw new IllegalArgumentException("Você excedeu o número maximo de caracteres. Tente Novamente.");
		}else {
			this.email = email;
		}
	}
	
	public void setTelefone(long telefone) {
		if(telefone <= 1000000 || telefone >= 99999999) {
			throw new IllegalArgumentException("Número de telefone não encontrado. Tente Novamente.");
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
