package com.javainuse.model;

public class Product {

	private String type;
	private Integer discount;
	private String prog;
	private Integer amount;
	private Integer rate;
	private Integer init_sum;
	private Integer term;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getProg() {
		return prog;
	}

	public void setProg(String prog) {
		this.prog = prog;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}