package br.com.projetofinal.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  
@Table(name="tb_musica")
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private int id;
	
	@Column(name="titulo", length=40)
	private String titulo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="cadastro")
	private Date cadastro;
	
	@Column(name="lancamento", length=50)
	private String lancamento;
	
	
	@ManyToOne //esse é o lado "n" do SGBD
	@JsonIgnoreProperties("musicas")
	private Artista artista;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}



	public Musica(int id, String titulo, String lancamento, Date cadastro, String idArtista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		
	}

	public void getAll(int id, String titulo, String lancamento, Date cadastro, String idArtista) {
		//super();
		this.id = id;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		
	}
	
	
	public Musica() {
		super();
	}

}