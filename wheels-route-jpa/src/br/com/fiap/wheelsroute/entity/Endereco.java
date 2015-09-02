package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqEndereco", sequenceName="SEQ_ENDERECO", allocationSize=1)
public class Endereco {
	
	@Id
	@Column(name="CD_ENDERECO")
	@GeneratedValue(generator="seqEndereco", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_ENDERECO")
	private int numero;
	
	@Column(name="DS_COMPLEMENTO")
	private String complemento;
	
	@ManyToOne
	@Column(name="NR_CEP")
	private Logradouro lougradouro;

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
