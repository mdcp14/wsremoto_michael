package br.com.votacao.beans;

public class Eleitor extends Pessoa {
	
	private int titulo;
	private boolean ativo;
	
	
	public Eleitor() {
		super();
	}

	public void getAll(int titulo, boolean ativo) {
		//super();
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	public void setAll(int titulo, boolean ativo) {
		//super.setAll(nome);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Eleitor [titulo=" + titulo + ", ativo=" + ativo + "]";
	}

	public Eleitor(int titulo, boolean ativo) {
		super();
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
