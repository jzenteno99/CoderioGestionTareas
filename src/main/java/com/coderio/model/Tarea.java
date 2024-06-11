package com.coderio.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tarea")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	private String detalle;
	
	private Date hora;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "id_prioridad", nullable = false)
	private Prioridad prioridad;

	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "id_estado", nullable = false)
	private Estado estado;
	

	public Tarea() {
	}

	public Tarea(long id, String nombre, String detalle, Date hora) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.hora = hora;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public Date getHora() {
		return hora;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}


}
