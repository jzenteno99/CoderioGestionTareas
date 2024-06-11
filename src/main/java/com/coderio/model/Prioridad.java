package com.coderio.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "prioridad")
public class Prioridad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	private String status;
	

	@OneToMany (fetch = FetchType.LAZY, mappedBy = "prioridad", cascade = CascadeType.ALL )
	private List<Tarea> tareas;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getStatus() {
		return status;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
