package com.Hibernate.Hibernate1to1Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hno")
	private int hno;
	
	@Column(name="colony")
	private String colony;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state; 
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
