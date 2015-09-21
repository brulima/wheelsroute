package br.com.fiap.wheelsroute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqUsuario", sequenceName="SEQ_USUARIO", allocationSize=1)
public class Usuario {
	
	@Id
	@Column(name="CD_USUARIO")
	@GeneratedValue(generator="seqUsuario", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_USUARIO",nullable=false, length=80)
	private String nome;
	
	@Column(name="DS_EMIAL",nullable=false, length=50)
	private String email;
	
	@Column(name="DS_LOGIN", length=40)
	private String login;
	
	@Column(name="DS_SENHA",nullable=false, length=20)
	private String senha;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
