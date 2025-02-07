package com.example.saasbarber.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_client")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	private Integer cpf;
	private Date dateNasc;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id") // The foreign key column in the cliente table
	private Usuario usuario;
	
	public Cliente () {
	}
	
	public Cliente (Long id, String name, String email, String password, 	Integer cpf, Date dateNasc) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cpf = cpf;
		this.dateNasc = dateNasc;	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Date getdateNasc() {
		return dateNasc;
	}

	public void setdateNasc(Date dateNasc) {
		this.dateNasc = dateNasc;
	}
	
	
}
