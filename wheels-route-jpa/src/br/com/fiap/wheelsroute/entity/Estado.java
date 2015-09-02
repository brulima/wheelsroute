package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * @author julio.oliveira
 *
 */
@Entity
@SequenceGenerator(name="seqEstado", sequenceName="SEQ_ESTADO", allocationSize=1)
public class Estado {
	
	@Id
	@Column(name="CD_ESTADO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEstado")
	private int codigo;
	
	@Column(name="NM_ESTADO")
	private String nome;
	
	@Column(name="SG_ESTADO")
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
