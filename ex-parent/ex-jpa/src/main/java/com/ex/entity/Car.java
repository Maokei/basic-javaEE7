package com.ex.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private int id;
	@Column(unique = true)
	private String regNr;
	private String modelName;

	public Car() {
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getRegNr() {
		return regNr;
	}

	public void setRegNr(final String regNr) {
		this.regNr = regNr;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(final String modelName) {
		this.modelName = modelName;
	}
}
