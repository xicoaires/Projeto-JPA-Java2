package br.fuctura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column (name="CEP", nullable = false, length = 10)
	private String cep;
	@Column (name="RUA", nullable = false, length = 100)
	private String rua;
	@Column (name="NUMERO", nullable = false, length = 10)
	private String numero;
	@Column (name="COMPLEMENTO", nullable = true, length = 20)
	private String complemento;
	@Column (name="BAIRRO", nullable = false, length = 50)
	private String bairro;
	@Column (name="CIDADE", nullable = false, length = 50)
	private String cidade;
	@Column (name="ESTADO", nullable = false, length = 3)
	private String estado;
	@Column(name="ID_CLIENTE", nullable = false)
	private Long idCliente;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public String toString() {
		return "Endereço: " + rua + ", " + numero + "- "+ complemento
				+ "\n" + bairro + " - " + cidade + " - " + estado
				+ "\nCEP " + cep + "\n";
	}
	
	
}
