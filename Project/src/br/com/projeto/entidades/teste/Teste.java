package br.com.projeto.entidades.teste;

import java.io.IOException;
import java.util.Scanner;

import br.com.projeto.entidades.GrupoPesquisa;
import br.com.projeto.entidades.Professor;
import br.com.projeto.enums.Cargo;
import br.com.projeto.repositorio.RepositorioAluno;
import br.com.projeto.repositorio.RepositorioFuncionarios;
import br.com.projeto.repositorio.RepositorioGrupoPesquisa;
import br.com.projeto.repositorio.impl.RepositorioAlunoImpl;
import br.com.projeto.repositorio.impl.RepositorioFuncionariosImpl;
import br.com.projeto.repositorio.impl.RepositorioGrupoPesquisaImpl;

public class Teste {

	private static Scanner scan;
	private static int reposta = 0;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);

		RepositorioAluno repositorioAluno = RepositorioAlunoImpl.gerarInstacia();
		RepositorioFuncionarios ropositorioFuncionario = RepositorioFuncionariosImpl.gerarInstcia();
		RepositorioGrupoPesquisa repositorioGrupoPesquisa = RepositorioGrupoPesquisaImpl.gerarInstacia(); 
		
		// reporsitorio curoso
		// reporsitorio projeto
		// repositorio grupo pesquisa
		// Co�

		int opcoesSistema = 0;
		do {

			System.out.println("Opcoes do sistma :");
			System.out.println("1 - Funcioanrio");
			System.out.println("2 - Grupo de Pesquisa");
			
			System.out.println("20 - Voltar");
			System.out.println("10 - sair");

			opcoesSistema = scan.nextInt();

			switch (opcoesSistema) {
			case 1:
				menuFuncioanrios(ropositorioFuncionario);
				break;

			case 2:
				menuGrupoPesquisa(repositorioGrupoPesquisa,ropositorioFuncionario);
				break;
				
			case 20:
				for (int i = 0; i < 50; ++i)
				    System.out.println ();
				break;
				
				
			default:
				reposta = 10;
				break;
			}

		} while (reposta != 10);

	}

	public static void menuFuncioanrios(RepositorioFuncionarios ropositorioFuncionario) throws IOException {
		int opcoesFuncionario = 0;

		System.out.println("Escolha sua op��o para Funcionario:");
		System.out.println("1 - Incluir");
		System.out.println("20 - Voltar");
		System.out.println("10 - sair");

		opcoesFuncionario = scan.nextInt();

		switch (opcoesFuncionario) {
		case 1:

			System.out.println("========================================");
			System.out.println("   Informa��es para o  Cadastramento");
			System.out.println("========================================");

			System.out.println("Nome: ");
			String nome = scan.next();

			System.out.println("Idade: ");
			int idade = scan.nextInt();

			System.out.println("Sexo: ");
			char sexo = (char) System.in.read();

			System.out.println("Email: ");
			String email = scan.next();

			System.out.println("Telefone: ");
			long telefone = scan.nextLong();

			System.out.println("Forma��o: ");
			String formacao = scan.next();

			System.out.println("Curso: ");
			String curso = scan.next();

			System.out.println("Turno: ");
			char turno = (char) System.in.read();

			Professor prof = new Professor(nome, idade, sexo, email, telefone, formacao, turno, Cargo.PROFESSOR, curso);

			ropositorioFuncionario.cadastrarFuncionario(prof);

			break;

		case 20:
			for (int i = 0; i < 50; ++i)
			    System.out.println ();
			break;
		default:
			System.out.println("FODA-SE");
			if (opcoesFuncionario == 10) {
				reposta = opcoesFuncionario;
			}
			break;
		}
	}
	
	
	public static void menuGrupoPesquisa(RepositorioGrupoPesquisa repositorioGrupos, RepositorioFuncionarios ropositorioFuncionario) throws IOException {
		int opcoesFuncionario = 0;

		System.out.println("Escolha sua op��o para GrupoPesquisa:");
		System.out.println("1 - Incluir");
		System.out.println("20 - Voltar");
		System.out.println("10 - sair");

		opcoesFuncionario = scan.nextInt();

		switch (opcoesFuncionario) {
		case 1:

			System.out.println("========================================");
			System.out.println("   Informa��es para o  Cadastramento");
			System.out.println("========================================");

			System.out.println("Identifica��o Gurpo de Pesquisa: ");
			String nomeGrupo = scan.next();
		
			System.out.println("Professor Responsavel: ");
			String nomeProfessor = scan.next();
			
			//Verificar se o professor existe antes de proseguir o cadastro
			Professor professor = ropositorioFuncionario.buscarProfessorPeloNome(nomeProfessor);
			
			GrupoPesquisa grupo = new GrupoPesquisa(nomeGrupo, professor);
						
			repositorioGrupos.cadastrarGrupoPesquisa(grupo);
			
			break;

		case 20:
			for (int i = 0; i < 50; ++i)
			    System.out.println ();
			break;
		default:
			System.out.println("FODA-SE 2 ");
			if (opcoesFuncionario == 10) {
				reposta = opcoesFuncionario;
			}
			break;
		}
	}

}
