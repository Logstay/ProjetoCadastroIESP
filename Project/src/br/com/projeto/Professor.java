package br.com.projeto;

import java.util.ArrayList;

/**
 * @author Mateus Pereira, Alex Sim�es e Kaique Moreira.
 */
public class Professor extends Pessoa{
	ArrayList<Professor> listaDeProfessores = new ArrayList<>();
	private String forma��o;
	private String curso;
	
	public Professor(String nome, int idade, char sexo, String email, long telefone, String forma��o, String curso) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setEmail(email);
		setTelefone(telefone);
		setForma��o(forma��o);
		setCurso(curso);
	}
	
	public Professor() {
		
	}
	
	public void setForma��o(String forma��o) {
		if(forma��o.length() <= 19 || forma��o.length() >= 50) {
			throw new IllegalArgumentException("Esta forma��o n�o existe. Tente Novamente.");
		}
		this.forma��o = forma��o;
	}

	public void setCurso(String curso) {
		if(curso.length() <=6 || curso.length() >= 16) {
			throw new IllegalArgumentException("Curso n�o encontrado. Tente Novamente.");
		}else {
			this.curso = curso;
		}	
	}
	
	public String getForma��o() {
		return this.forma��o;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void cadastrarProfessor(Professor prof) {
		listaDeProfessores.add(prof);
	}
	
	public void excluirProfessor(Professor prof) {
		listaDeProfessores.remove(prof);
	}
}