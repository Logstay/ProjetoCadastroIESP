package br.com.projeto;
/**
 * @author Mateus Pereira, Alex Sim�es e Kaique Moreira.
 */
public class Coordenador extends Pessoa {
	private String setor;
	private String formacao;
	
	public void setSetor(String setor) {
		if(setor.length() <= 1 || setor.length() >= 12) {
			throw new IllegalArgumentException("Setor inesistente. Tente Novamente.");
		}else {
			this.setor = setor;
		}
	}
	
	public void setFormacao(String formacao) {
		if(formacao.length() <= 19 || formacao.length() >= 50) {
			throw new IllegalArgumentException("Esta formacao n�o existe. Tente Novamente.");
		}else {
			this.formacao = formacao;
		}	
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public String getFormacao () {
		return this.formacao;
	}
}