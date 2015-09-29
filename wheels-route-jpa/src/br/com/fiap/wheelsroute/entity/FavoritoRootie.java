package br.com.fiap.wheelsroute.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WR_FAVORITO_ROOTIE")
public class FavoritoRootie implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name="CD_USUARIO")
	private Usuario codigo_usuario;
	
	@Id
	@ManyToOne
	@JoinColumn(name="CD_ROOTIE")
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
