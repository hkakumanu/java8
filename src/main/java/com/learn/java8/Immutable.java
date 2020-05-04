package com.learn.java8;

public final class Immutable {
	
	
	    final String name; 
	    final int regNo; 
	  
	    public Immutable(String name, int regNo) 
	    { 
	        this.name = name; 
	        this.regNo = regNo; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public int getRegNo() 
	    { 
	        return regNo; 
	    } 
	

}


