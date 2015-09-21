package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqBairro", sequenceName="SEQ_CIDADE", allocationSize=1)
public class Bairro {
	
	@Id
	@Column(name="CD_BAIRRO")
	@GeneratedValue(generator="seqBairro", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_BAIRRO" ,nullable=false, length=50)
	private String nome;
	
	@ManyToOne
	@Column(name="CD_CIDADE",nullable=false)
	private Cidade cidade;

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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
