package br.com.projeto;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Mateus Pereira, Alex Sim�es e Kaique Moreira.
 */
public class Projeto {
	private static Scanner scan;
	/**
	 * Ser� bom criar uma classe departamento? para armazenar os funcionarios separadamente em cada setor especifico
	 */
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		String nome;		char sexo;
		String email;		char turno;
		String cargo;		int idade;
		String formacao;	int resposta;
		String curso;		long telefone;
		int resp;
									
		System.out.println("========================================");
		System.out.println("	  BEM VINDO COORDENADOR");
		System.out.println("========================================");
		System.out.println("O que deseja fazer hoje?");
		System.out.println("========================================");
		System.out.println("01 - Cadastro de Funcionarios");
		System.out.println("02 - Cadastro de Grupos de Pesquisa");
		System.out.println("03 - Cadastro de Projetos");
		System.out.println("04 - Gerenciamento de Dados");
		System.out.println("05 - Sair");
		System.out.println("========================================");
		resposta = scan.nextInt();
		
		
		switch(resposta) {
		case 1:
			System.out.println("========================================");
			System.out.println("      Cadastramento de Funcionario");
			System.out.println("========================================");
			System.out.println("1 - Professor");
			System.out.println("2 - Funcionario");
			System.out.println("========================================");
			resp = scan.nextInt();
			
			switch(resp) {
			case 1:
				try {
					System.out.println("========================================");
					System.out.println("   Informa��es para o  Cadastramento");
					System.out.println("========================================");
					
					System.out.println("Nome: ");
					nome = scan.next();
					
					System.out.println("Idade: ");
					idade = scan.nextInt();
					
					System.out.println("Sexo: ");
					sexo = (char) System.in.read();
					
					System.out.println("Email: ");
					email = scan.next();
					
					System.out.println("Telefone: ");
					telefone = scan.nextLong();
					
					System.out.println("Forma��o: ");
					formacao = scan.next();
					
					System.out.println("Curso: ");
					curso = scan.next();
					
					Professor prof = new Professor(nome, idade, sexo, email, telefone, formacao, curso);
					prof.cadastrarProfessor(prof);
					System.out.println(prof);
					
				} catch(IOException ex) {
					Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
				} catch (IllegalArgumentException ex){
					System.out.println(ex.getMessage());
				}
			case 2:
				try {
					System.out.println("========================================");
					System.out.println("   Informa��es para o  Cadastramento");
					System.out.println("========================================");
					
					System.out.println("Nome: ");
					nome = scan.next();
					
					System.out.println("Idade: ");
					idade = scan.nextInt();
					
					System.out.println("Sexo: ");
					sexo = (char) System.in.read();
					
					System.out.println("Email: ");
					email = scan.next();
					
					System.out.println("Telefone: ");
					telefone = scan.nextLong();
					
					System.out.println("Cargo: ");
					cargo = scan.next();
					
					System.out.println("Turno: ");
					turno = (char) System.in.read();
					
					Funcionario func = new Funcionario(nome, email, telefone, idade, sexo, turno, cargo);
					func.cadastrarFuncionario(func);
					System.out.println(func);
					
				} catch(IOException ex) {
					Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
				} catch (IllegalArgumentException ex){
					System.out.println(ex.getMessage());
				}
			default:
				System.out.println("Est� op��o n�o existe.");
				System.out.println("Finalizando sistema.......");
			}
		}		
	}
}