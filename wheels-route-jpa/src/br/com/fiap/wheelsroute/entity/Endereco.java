package br.com.fiap.wheelsroute.entity;

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
@Table(name="WR_ENDERECO")
@SequenceGenerator(name="seqEndereco", sequenceName="SQ_WR_ENDERECO", allocationSize=1)
public class Endereco {
	
	@Id
	@Column(name="CD_ENDERECO")
	@GeneratedValue(generator="seqEndereco", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NR_ENDERECO",nullable=false)
	private int numero;
	
	@Column(name="DS_COMPLEMENTO", length=20)
	private String complemento;
	
	@ManyToOne
	@JoinColumn(name="CD_LOGRADOURO",nullable=false)
	private Logradouro lougradouro;

	@Column(name="DS_LATITUDE", nullable=false)
	private String latitude;
	
	@Column(name="DS_LONGITUDE", nullable=false)
	private String longitude;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Logradouro getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(Logradouro lougradouro) {
		this.lougradouro = lougradouro;
	}

}
