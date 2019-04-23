package br.com.projeto;

import java.util.ArrayList;

/**
 * @author Mateus Pereira, Alex Simões e Kaique Moreira.
 */
public class Professor extends Pessoa{
	ArrayList<Professor> listaDeProfessores = new ArrayList<>();
	private String formação;
	private String curso;
	
	public Professor(String nome, int idade, char sexo, String email, long telefone, String formação, String curso) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setEmail(email);
		setTelefone(telefone);
		setFormação(formação);
		setCurso(curso);
	}
	
	public Professor() {
		
	}
	
	public void setFormação(String formação) {
		if(formação.length() <= 19 || formação.length() >= 50) {
			throw new IllegalArgumentException("Esta formação não existe. Tente Novamente.");
		}
		this.formação = formação;
	}

	public void setCurso(String curso) {
		if(curso.length() <=6 || curso.length() >= 16) {
			throw new IllegalArgumentException("Curso não encontrado. Tente Novamente.");
		}else {
			this.curso = curso;
		}	
	}
	
	public String getFormação() {
		return this.formação;
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