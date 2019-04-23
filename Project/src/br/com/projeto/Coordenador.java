package br.com.projeto;
/**
 * @author Mateus Pereira, Alex Simões e Kaique Moreira.
 */
public class Coordenador extends Pessoa {
	private String setor;
	private String formação;
	
	public void setSetor(String setor) {
		if(setor.length() <= 1 || setor.length() >= 12) {
			throw new IllegalArgumentException("Setor inesistente. Tente Novamente.");
		}else {
			this.setor = setor;
		}
	}
	
	public void setFormação(String formação) {
		if(formação.length() <= 19 || formação.length() >= 50) {
			throw new IllegalArgumentException("Esta formação não existe. Tente Novamente.");
		}else {
			this.formação = formação;
		}	
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public String getFormação () {
		return this.formação;
	}
}