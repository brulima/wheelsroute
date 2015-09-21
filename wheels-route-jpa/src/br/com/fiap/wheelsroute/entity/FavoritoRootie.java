package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FavoritoRootie {
	
	@ManyToOne
	@Column(name="CD_USUARIO")
	private Usuario codigo_usuario;
	
	@ManyToOne
	@Column(name="CD_ROOTIE")
	private Rootie codigo_rootie;

	public Usuario getCodigo_usuario() {
		return codigo_usuario;
	}

	public void setCodigo_usuario(Usuario codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}

	public Rootie getCodigo_rootie() {
		return codigo_rootie;
	}

	public void setCodigo_rootie(Rootie codigo_rootie) {
		this.codigo_rootie = codigo_rootie;
	}
	
	

}
