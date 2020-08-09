package com.globallogic.bootcamp.patterns;

public class Order {

    private String description;
    private Integer count;
    private Currency currency;
    //private static Order instancia;
    
    public Order(String description, Integer count) {
	this.description = description;
	this.count = count;
	currency = Currency.getInstance();
    }
    
    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public int getCount() {
	return count;
    }

    public void setCount(int count) {
	this.count = count;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
	this.currency = currency;
    }
}
