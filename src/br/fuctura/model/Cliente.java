package br.fuctura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id // informar quem é o ID
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // Auto incremento
	private Long id;
	@Column(name="NOME", nullable = false, length = 200) //Coluna do banco
	private String nome;
	@Column(name="CPF", nullable = false, length = 14)
	private String cpf;
	@Column (name="GENERO", nullable = true, length = 3)
	private String genero;
	@Column (name="ANO_NASC", nullable = false, length = 4)
	private String anoNasc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(String anoNasc) {
		this.anoNasc = anoNasc;
	}
	@Override
	public String toString() {
		return "ID nº: " + id
				+ "\nNome: " + nome
				+ "\nCPF nº: " + cpf
				+ "\nGênero: " + genero
				+ "\nAno de Nascimento: " + anoNasc;

	}
}
