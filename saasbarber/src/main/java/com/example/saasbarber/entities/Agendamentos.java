package com.example.saasbarber.entities;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agendamentos")
public class Agendamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalTime horario;
    private LocalDate data;
	
    @ManyToOne
    @JoinColumn(name = "cliente_id") // Foreign key to the cliente table
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "administrador_id") // Foreign key to the funcionario table (if applicable)
    private Administrator administrador; // The emp
    
    public Agendamentos(Long id, LocalTime horario, LocalDate data) {
		super();
		this.id = id;
		this.horario = horario;
		this.data = data;
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
