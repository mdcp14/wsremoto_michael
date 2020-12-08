package br.com.votacao.beans;

import java.util.List;

public class Urna {
	
	private int zona;
	private int secao;
	private String cidade;
	public List <Voto> votos;
	
	public int totalVotos() {
		return votos.size();
		
	}
	

	
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		Votos = votos;
	}
	
	@Override
	public String toString() {
		return "Urna [zona=" + zona + ", secao=" + secao + ", cidade=" + cidade + ", votos=" + votos + "]";
	}



	public Urna(int zona, int secao, String cidade, List<Voto> votos) {
		super();
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		Votos = votos;
	}
	
	
	public void getAll(int zona, int secao, String cidade, List<Voto> votos) {
		//super();
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		Votos = votos;
	}
	
	public void setAll(int zona, int secao, String cidade, List<Voto> votos) {
		//super();
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		Votos = votos;
	}
	
	
	public Urna() {
		super();
	}
	
	
	
	
	
	
	
	
	

}
