package br.fuctura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTATO")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column (name="EMAIL", nullable = false, length = 50)
	private String email;
	@Column(name="DDD", nullable = false, length = 3)
	private String ddd;
	@Column (name="TELEFONE", nullable = false, length = 11)
	private String telefone;
	@Column (name="ID_CLIENTE", nullable = false)
	private Long idCliente;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public String toString() {
		return "Email: " + email
				+ "\nTelefone: (" + ddd +") " + telefone;
	}
	
}
