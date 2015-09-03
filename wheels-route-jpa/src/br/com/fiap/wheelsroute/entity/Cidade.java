package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqCidade", sequenceName="SEQ_CIDADE", allocationSize=1)
public class Cidade {
	
	@Id
	@Column(name="CD_CIDADE")
	@GeneratedValue(generator="seqCidade", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_CIDADE",nullable=false, length=60)
	private String nome;
	
	@ManyToOne
	@Column(name="CD_ESTADO",nullable=false)
	private Estado estado;
	
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
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
