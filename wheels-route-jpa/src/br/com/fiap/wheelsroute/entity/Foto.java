package br.com.fiap.wheelsroute.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WR_FOTO")
@SequenceGenerator(name="seqFoto",sequenceName="SQ_WR_FOTO",allocationSize=1)
public class Foto {
	
		
		@Id
		@Column(name="CD_FOTO")
		@GeneratedValue(generator="seqFoto", strategy=GenerationType.SEQUENCE)
		private int codigo;
		
		@ManyToOne
		@JoinColumn(name="CD_ROOTIE")
		private Rootie rootie;
		
		@Column(name="DS_FOTO", nullable=false)
		private Blob foto;

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

		public Blob getFoto() {
			return foto;
		}

		public void setFoto(Blob usuario) {
			this.foto = usuario;
		}

}
