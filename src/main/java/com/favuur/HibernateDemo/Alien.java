package com.favuur.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien
{	@Id
	private String name;
	private String colour;
	private int aid;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}



}
