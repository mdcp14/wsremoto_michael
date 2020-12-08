package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="tb_musica")
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private int ID;
	
	@Column(name="titulo", length=60)
	private String titulo;
	
	@Column(name="lancamento", length=50)
	private String lancamento;
	
	@Column(name="cadastro", length=100)
	private String cadastro;
	
	@Column(name="idArtista", length=80)
	private String idArtista;

	
	
	public void setAll(int iD, String titulo, String lancamento, String cadastro, String idArtista) {
		//super();
		ID = iD;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		this.idArtista = idArtista;
	}
	
	
	public void getAll(int iD, String titulo, String lancamento, String cadastro, String idArtista) {
		//super();
		ID = iD;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		this.idArtista = idArtista;
	}

	public Musica() {
		super();
	}

	public Musica(int iD, String titulo, String lancamento, String cadastro, String idArtista) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		this.idArtista = idArtista;
	}

	@Override
	public String toString() {
		return "Musica [ID=" + ID + ", titulo=" + titulo + ", lancamento=" + lancamento + ", cadastro=" + cadastro
				+ ", idArtista=" + idArtista + "]";
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public String getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(String idArtista) {
		this.idArtista = idArtista;
	}
	
	
	
	
	
	
	
}
