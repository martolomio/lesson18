package com.hometask.generic2;

public class List<T> {
	
	//created my List and have put String field.
	
	private T id;
    private String name;
     
    List(T id, String name){
        this.id = id;
        this.name = name;
    }
     
    public T getId() {
    	return id; 
    	}
    public String getName() {
    	return name;
    	}
    public void setName(String name) {
    	this.name = name; 
    	}
    public void setId(T id) {
    	this.id = id; 
    	}

	@Override
	public String toString() {
		return "List [id=" + id + ", name=" + name + "]";
	}
    
}
