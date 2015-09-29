package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WR_LOGRADOURO")
@SequenceGenerator(name="seqLogradouro", sequenceName="SQ_WR_LOGRADOURO", allocationSize=1)
public class Logradouro {
	
	@Id
	@Column(name="CD_LOGRADOURO")
	@GeneratedValue(generator="seqLogradouro", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NR_CEP", nullable=false)
	private int cep;

	@Column(name="DS_LOGRADOURO",nullable=false, length=60)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="CD_BAIRRO",nullable=false)
	private Bairro bairro;
	
	@ManyToOne
	@JoinColumn(name="CD_TIPO_LOG",nullable=false)
	private TipoLogradouro tipoLogradouro;

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

}
