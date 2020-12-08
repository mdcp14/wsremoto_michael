package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_artista")
public class Artista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private int ID;
	
	@Column(name="nomeArtistico", length=70)
	private String nomeArtistico;
	
	@Column(name="nacionalidade", length=50)
	private String nacionalidade;
	
	
	public Artista() {
		super();
	}

	public void setAll(int iD, String nomeArtistico, String nacionalidade) {
		//super();
		ID = iD;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
	}

	public Artista(int iD, String nomeArtistico, String nacionalidade) {
		super();
		ID = iD;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
	}



	@Override
	public String toString() {
		return "Artista [ID=" + ID + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade + "]";
	}
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	
	
	
}