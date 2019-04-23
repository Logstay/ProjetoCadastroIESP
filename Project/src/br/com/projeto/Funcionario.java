package br.com.projeto;
import java.util.ArrayList;
/**
 * @author Mateus Pereira, Alex Simões e Kaique Moreira.
 */
public class Funcionario extends Pessoa{
	ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();
	private String cargo;
	private char turno;
	
	public Funcionario(String nome, String email, long telefone, int idade, char sexo, char turno, String cargo) {
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
		setIdade(idade);
		setSexo(sexo);
		setTurno(turno);
		setCargo(cargo);
	}
	
	public Funcionario() {
		
	}
	
	public void setCargo(String cargo) {
		if(cargo.length() <= 4 || cargo.length() >= 30) {
			throw new IllegalArgumentException("Cargo não encontrado. Tente Novamente.");
		}else {
			this.cargo = cargo;
		}
	}
	
	public void setTurno(char turno) {
		if(turno != 'M' && turno != 'T' && turno != 'N') {
			throw new IllegalArgumentException("Carater inválido. Tente Novamente.");
		}else {
			this.turno = turno;
		}	
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public char getTurno() {
		return this.turno;
	}
	
	public String toString() {
		return nome + " = {Email: " + email + " | Telefone: " + telefone + " | Idade: " + idade + " | Sexo: " + sexo + " | Turno: " + turno + " | Cargo: " + cargo + "}";
	}
	
	public void cadastrarFuncionario(Funcionario func) {
		listaDeFuncionarios.add(func);
	}
	
	public void deletarFuncionario(Funcionario func) {
		listaDeFuncionarios.remove(func);
	}
	
	public int numeroDeFuncionarios() {
		return listaDeFuncionarios.size();
	}
}