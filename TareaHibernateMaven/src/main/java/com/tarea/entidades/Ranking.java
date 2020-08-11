package com.tarea.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Ranking {
	
	@GeneratedValue
	@Id
	private int id;
	private String nombre;
	
	
	@OneToOne
	private Persona persona;
	
	public Ranking () {}

	
	@OneToMany(mappedBy = "ranking")
	private List<Skill> skills = new ArrayList<Skill>();

	
	
	
	
	public Ranking(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Ranking [id=" + id + ", nombre=" + nombre + ", persona=" + persona + "]";
	}
    
	
	
}
