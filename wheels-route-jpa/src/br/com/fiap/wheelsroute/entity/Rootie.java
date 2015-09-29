package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.SequenceGenerator;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="WR_ROOTIE")
@SequenceGenerator(name="SeqRootie", sequenceName="SQ_WR_ROOTIE", allocationSize=1)
@NamedStoredProcedureQueries(value={
		@NamedStoredProcedureQuery(name="insereRootie", procedureName="PRC_INSERE_ROOTIE", parameters={
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_ESTADO", type=Integer.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_CIDADE", type=String.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_BAIRRO", type=String.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_LOGRADOURO", type=String.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_CEP", type=Integer.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_NUMERO", type=Integer.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_TIPO_LOGRADOURO", type=Integer.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_NOME_ROOTIE", type=String.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_TIPO_ROOTIE", type=Integer.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_LATITUDE", type=String.class), 
				@StoredProcedureParameter(mode=ParameterMode.IN, name="P_LONGITUDE", type=String.class)})})
public class Rootie {
	
	@Id
	@Column(name="CD_ROOTIE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SeqRootie")
	private int codigo;
	
	@Column(name="NM_NOME",nullable=false,length=50)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="CD_TIPO_ROOTIE",nullable=false)
	private TipoRootie tipoRootie;
	
	@ManyToOne
	@JoinColumn(name="CD_ENDERECO",nullable=false)
	private Endereco endereco;

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
	
	public TipoRootie getTipoRootie() {
		return tipoRootie;
	}

	public void setTipoRootie(TipoRootie tipoRootie) {
		this.tipoRootie = tipoRootie;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void mediaClassificao(){
		
		
	}
	
	
}
