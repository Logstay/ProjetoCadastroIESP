package br.com.projeto;
/**
 * @author Mateus Pereira, Alex Sim�es e Kaique Moreira.
 */
public class Coordenador extends Pessoa {
	private String setor;
	private String forma��o;
	
	public void setSetor(String setor) {
		if(setor.length() <= 1 || setor.length() >= 12) {
			throw new IllegalArgumentException("Setor inesistente. Tente Novamente.");
		}else {
			this.setor = setor;
		}
	}
	
	public void setForma��o(String forma��o) {
		if(forma��o.length() <= 19 || forma��o.length() >= 50) {
			throw new IllegalArgumentException("Esta forma��o n�o existe. Tente Novamente.");
		}else {
			this.forma��o = forma��o;
		}	
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public String getForma��o () {
		return this.forma��o;
	}
}