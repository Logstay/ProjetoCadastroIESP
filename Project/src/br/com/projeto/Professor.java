package br.com.projeto;

import java.util.ArrayList;

/**
 * @author Mateus Pereira, Alex Sim�es e Kaique Moreira.
 */
public class Professor extends Pessoa{
	ArrayList<Professor> listaDeProfessores = new ArrayList<>();
	private String formacao;
	private String curso;
	
	public Professor(String nome, int idade, char sexo, String email, long telefone, String formacao, String curso) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setEmail(email);
		setTelefone(telefone);
		setFormacao(formacao);
		setCurso(curso);
	}
	
	public Professor() {
		
	}
	
	public void setFormacao(String formacao) {
		if(formacao.length() <= 19 || formacao.length() >= 50) {
			throw new IllegalArgumentException("Esta forma��o n�o existe. Tente Novamente.");
		}
		this.formacao = formacao;
	}

	public void setCurso(String curso) {
		if(curso.length() <=6 || curso.length() >= 16) {
			throw new IllegalArgumentException("Curso n�o encontrado. Tente Novamente.");
		}else {
			this.curso = curso;
		}	
	}
	
	public String getFormacao() {
		return this.formacao;
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