package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqFunc",
sequenceName="SEQ_FUNCIONARIO",allocationSize=1)
@SecondaryTable(name="FUNCIONARIO_DADOS")
public class Funcionario {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="seqFunc")
	private int codigo;
	
	private String nome;
	
	@Column(table="FUNCIONARIO_DADOS")
	private float salario;
	
	private String funcao;
	
	@Column(table="FUNCIONARIO_DADOS")
	private float comissao;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, float salario, String funcao,
			float comissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;
		this.comissao = comissao;
	}

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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
}
