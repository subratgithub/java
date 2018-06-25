package com.subrat.ExceptionHandlingInMVC.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class Order {

	
	public Order(int id, String name, String cat, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.cat = cat;
		this.amount = amount;
	}
	
	private int id;
	private String name;
	private String cat;
	private double amount;
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
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
