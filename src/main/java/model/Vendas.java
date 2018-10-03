package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.mapping.Collection;

@Entity
@Table(name="vendas")
public class Vendas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_vendas;
	@Column
	private String produto;
	@Column 
	private String valor;
	
	// FK clientes
	
	@ManyToOne @JoinColumn(name="id_cliente")
	private Cliente cli;
	
	
	
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public Integer getId_vendas() {
		return id_vendas;
	}
	public void setId_vendas(Integer id_vendas) {
		this.id_vendas = id_vendas;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	


}
