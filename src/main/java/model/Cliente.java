package model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_cliente;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private String rg;
	
	
	// primary key cliente
	@OneToMany(mappedBy="cli",
			targetEntity=Vendas.class,
			cascade=CascadeType.ALL)
	
	private Collection vendas;


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}




	public void setVendas(Collection vendas) {
		vendas = vendas;
	}


	public Collection getVendas() {
		return vendas;
	}
	
	
	
	
	
}
