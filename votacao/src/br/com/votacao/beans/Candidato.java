package br.com.votacao.beans;

public class Candidato extends Pessoa {

	private int numero;
	private String cargo;
	private String partido;
	int votos = 0;
	
	
	public void getAll(int numero, String cargo, String partido, int votos) {
		//super();
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
		this.votos = votos;
	}
	
	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", cargo=" + cargo + ", partido=" + partido + ", votos=" + votos + "]";
	}

	public void setAll(int numero, String cargo, String partido, int votos) {
		//super.setAll(nome);
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
		this.votos = votos;
	}
	
	
	public Candidato() {
		super();
	}
	
	
	public Candidato(int numero, String cargo, String partido, int votos) {
		super();
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
		this.votos = votos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
	
	
}
