package com.globallogic.bootcamp.patterns;

public class Game {
    
    private String title;
	
    public Game(){
    }

    public Game(String title){
	this.title = title;
    }
	
    public String getTittle(){
	return title;
    }

    public void setTittle(String title){
	this.title = title;
    }
}
