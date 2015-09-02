package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqLogradouro", sequenceName="SEQ_LOGRADOURO", allocationSize=1)
public class Logradouro {
	
	@Id
	@Column(name="CD_LOGRADOURO")
	@GeneratedValue(generator="seqLogradouro", strategy=GenerationType.SEQUENCE)
	private int cep;
	
	@Column(name="DS_LOGRADOURO")
	private String descricao;
	
	@ManyToOne
	@Column(name="CD_BAIRRO")
	private int codigo;
	
	@OneToOne
	@Column(name="CD_TIPO_LOG")
	private TipoLogradouro tipoLogradouro;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
