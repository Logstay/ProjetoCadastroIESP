package br.com.projeto.entidades;

public class GrupoPesquisa {

	private String identificacao;
	private Professor professor;
	
	
	public GrupoPesquisa(String identificacao, Professor professor) {
		this.identificacao = identificacao;
		this.professor = professor;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
