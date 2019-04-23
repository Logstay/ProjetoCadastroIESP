package br.com.projeto.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.entidades.Funcionario;
import br.com.projeto.entidades.Professor;
import br.com.projeto.enums.Cargo;
import br.com.projeto.repositorio.RepositorioFuncionarios;

/**
 * 
 * Essa calase é responsavel por centralizar todos os metodos
 * que lidam com funcionario. Então todos os metodos aqui acessam alista.
 * Aqui estará o cadastra, listar, consultar, excluir etc.  
 * 
 * @author 
 *
 */
public class RepositorioFuncionariosImpl implements RepositorioFuncionarios{

	private List<Funcionario> funcionarios;
	private static RepositorioFuncionariosImpl instacia;
	
	private RepositorioFuncionariosImpl(){
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public static final RepositorioFuncionariosImpl gerarInstcia() {
		if(instacia == null) {
			instacia = new RepositorioFuncionariosImpl();
		}
		
		return instacia;
	}
			
	
	/**
	 * 
	 * Metodo que vai cadastro os funcionarios em uma unica lista
	 * 
	 * @param funcionario
	 * @return
	 */
	public boolean cadastrarFuncionario(Funcionario funcionario){
		//Fazer validações antes de cadastrar		
		funcionarios.add(funcionario);
		
		return true;
	}
	
	public Professor buscarProfessorPeloNome(String nome) {
		Professor professorEncontrado = null;
		
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getCargo().equals(Cargo.PROFESSOR)
					&& funcionario.getNome().toUpperCase().trim().equals(nome.toUpperCase().trim())) {
				professorEncontrado = (Professor) funcionario;
				System.out.println("Professor Encontra:"+professorEncontrado.getNome());
				System.out.println("Disciplian :" +professorEncontrado.getCurso());
				break;
			}
		}		
		
		return professorEncontrado;
	}
	
	
	public void quantidadeFuncioanrios() {
		System.out.println("Quantidade de funcioanrios até o momento: "+funcionarios.size());
	}
}
