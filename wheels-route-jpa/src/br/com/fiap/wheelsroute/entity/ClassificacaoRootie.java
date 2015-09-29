package br.com.fiap.wheelsroute.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WR_CADASTRO_ROOTIE")
public class ClassificacaoRootie implements Serializable{
	
	@Column(name="NR_NOTA",nullable=false)
	private float nota;
	
	@Column(name="DS_COMENTARIO", length=300)
	private String comentatio;
	
	@Column(name="CD_SITUACAO",nullable=false)
	private int situacao;
	
	@Id
	@ManyToOne
	@JoinColumn(name="CD_ROOTIE",nullable=false)
	private Rootie rootie;
	
	@Id
	@ManyToOne
	@JoinColumn(name="CD_USUARIO",nullable=false)
	private Usuario usuario;

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getComentatio() {
		return comentatio;
	}

	public void setComentatio(String comentatio) {
		this.comentatio = comentatio;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public Rootie getRootie() {
		return rootie;
	}

	public void setRootie(Rootie rootie) {
		this.rootie = rootie;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
