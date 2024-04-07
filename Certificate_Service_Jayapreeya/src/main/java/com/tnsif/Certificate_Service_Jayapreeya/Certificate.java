package com.tnsif.Certificate_Service_Jayapreeya;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate 
{
	@Id
	@Column(name="sid")
	private int id;
	@Column(name="Cname")
	private String name;
	@Column(name="Caddress")
	private String address;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
