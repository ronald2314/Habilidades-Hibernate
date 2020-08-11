package com.tarea.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Skill {
	
	@GeneratedValue
	@Id
	private int id;
	private String nombre;
	
	
   @ManyToOne
   private Ranking ranking;
   
   public Skill () {}

public Skill(int id, String nombre) {
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


@Override
public String toString() {
	return "Skill [id=" + id + ", nombre=" + nombre + ", persona=" + "]";
}
   
   

	
	
	
	
	
}
