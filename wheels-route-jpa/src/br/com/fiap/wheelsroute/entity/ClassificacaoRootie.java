package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ClassificacaoRootie {
	
	@Column(name="NR_NOTA")
	private float nota;
	
	@Column(name="DS_COMENTARIO")
	private String comentatio;
	
	@Column(name="CD_SITUACAO")
	private int situacao;
	
	@Id
	@ManyToOne
	@Column(name="CD_ROOTIE")
	private Rootie rootie;
	
	@Id
	@ManyToOne
	@Column(name="CD_USUARIO")
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
