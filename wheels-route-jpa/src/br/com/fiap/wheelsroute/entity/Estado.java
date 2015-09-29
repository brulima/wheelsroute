package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author julio.oliveira
 *
 */
@Entity
@Table(name="WR_ESTADO")
public class Estado {
	
	@Id
	@Column(name="CD_ESTADO")
	private int codigo;
	
	@Column(name="NM_ESTADO",nullable=false, length=60, unique=true)
	private String nome;
	
	@Column(name="SG_ESTADO",nullable=false, length=2, unique=true)
	private String sigla;

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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
