package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqTipoLogradouro", sequenceName="SEQ_TIPO_LOUGRADOURO", allocationSize=1)
public class TipoLogradouro {

	@Id
	@Column(name="CD_TIPO_LOG")
	@GeneratedValue(generator="seqTipoLogradouro", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="DS_TIPO_LOG")
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
