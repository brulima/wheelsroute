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
@SequenceGenerator(name="seqFoto",sequenceName="SEQ_FOTO",allocationSize=1)
public class Foto {
	
		
		@Id
		@Column(name="CD_FOTO")
		@GeneratedValue(generator="seqFoto", strategy=GenerationType.SEQUENCE)
		private int codigo;
		
		@ManyToOne
		@Column(name="CD_ROOTIE")
		private Rootie rootie;
		
		@OneToOne
		@Column(name="CD_USUARIO")
		private Usuario usuario;

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
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
