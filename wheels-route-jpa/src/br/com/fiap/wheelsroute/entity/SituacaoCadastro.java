package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqSituacaoCadasro",sequenceName="SEQ_SITUACAO_CADASTRO", allocationSize=1)
public class SituacaoCadastro {
	
	@Id
	@Column(name="CD_SITUACAO")
	@GeneratedValue(generator="seqSituacaoCadastro",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_NOME", length=20)
	private String nome;

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
	
	
}
