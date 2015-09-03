package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="SeqTipoRootie", sequenceName="SEQ_TIPOROOTIE", allocationSize=1)
public class TipoRootie {
	
	@Id
	@Column(name="CD_TIPOROOTIE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="SeqTipoRootie")
	private int codigo;
	
	@Column(name="NM_NOME",nullable=false, length=100)
	private String nome;

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
}
