package com.canting.entity;

public class chanpin {
	private int id ;
	private String name ;
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
	
	public chanpin() {
		super();
		this.id = id;
		this.name = name;
	}
	
	public chanpin(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "chanpin [id=" + id + ", name=" + name + "]";
	}
	
}
