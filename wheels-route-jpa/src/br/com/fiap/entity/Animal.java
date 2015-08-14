package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqAnimal", sequenceName="SEQ_ANIMAL",
allocationSize=1)
@Inheritance(strategy=InheritanceType.JOINED)
public class Animal {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="seqAnimal")
	private int codigo;
	
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
