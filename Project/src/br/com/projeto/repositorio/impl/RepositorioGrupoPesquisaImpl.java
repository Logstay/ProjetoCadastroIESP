package br.com.projeto.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.entidades.GrupoPesquisa;
import br.com.projeto.repositorio.RepositorioGrupoPesquisa;

public class RepositorioGrupoPesquisaImpl implements RepositorioGrupoPesquisa{
	private List<GrupoPesquisa> gruposPesquisa;
	private static RepositorioGrupoPesquisaImpl instancia;
	
	private RepositorioGrupoPesquisaImpl() {
		gruposPesquisa = new ArrayList<GrupoPesquisa>();
	}
	
	public static final RepositorioGrupoPesquisaImpl gerarInstacia() {
		if(instancia == null) {
			instancia = new RepositorioGrupoPesquisaImpl();
		}
		return instancia;
	}
	
	
	public boolean cadastrarGrupoPesquisa(GrupoPesquisa grupo) {		
		gruposPesquisa.add(grupo);
		
		return true;
	}
	
}
