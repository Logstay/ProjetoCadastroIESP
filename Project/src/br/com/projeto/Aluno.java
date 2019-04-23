package br.com.projeto;
/**
 * @author Mateus Pereira, Alex Sim�es e Kaique Moreira.
 */
public class Aluno extends Pessoa{
	private long matricula;
	private String curso;
	
	public void setMatricula(long matricula) {
		if(matricula <= 1000000 || matricula >= 100000000) {
			throw new IllegalArgumentException("Matricula n�o encontrada. Tente Novamente.");
		}else {
			this.matricula = matricula;
		}	
	}
	
	public void setCurso(String curso) {
		if(curso.length() <= 6 || curso.length() >= 16) {
			throw new IllegalArgumentException("Curso n�o encontrado. Tente Novamente.");
		}else {
			this.curso = curso;
		}
	}

	public long getMatricula() {
		return this.matricula;
	}
	
	public String getCurso() {
		return this.curso;
	}	
}