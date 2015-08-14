package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="SeqRootie", sequenceName="SEQ_ROOTIE", allocationSize=1)
public class Rootie {
	@Id
	@Column(name="CD_ROOTIE")
	private int codigo;
	
	@Column(name="NM_NOME",nullable=false)
	private String nome;
	
	@Column(name="NR_NOTA")
	private double nota;
	
	@Column(name="NR_CEP",nullable=false)
	private int cep;
	
	@Id
	@ManyToOne
	private TipoRootie tipoRootie;
	
	@Id
	@OneToOne
	private Endereco endereco;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public TipoRootie getTipoRootie() {
		return tipoRootie;
	}

	public void setTipoRootie(TipoRootie tipoRootie) {
		this.tipoRootie = tipoRootie;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}