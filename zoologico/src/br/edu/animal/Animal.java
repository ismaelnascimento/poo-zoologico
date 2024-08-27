package br.edu.animal;

public abstract class Animal {
    protected String picture;
    protected String food;
    protected boolean hunger;
    protected double boundaries;
    protected String location;
    
    public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public boolean isHunger() {
		return hunger;
	}
	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}
	public double getBoundaries() {
		return boundaries;
	}
	public void setBoundaries(double boundaries) {
		this.boundaries = boundaries;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public abstract void makeNoise();
    public abstract void eat();
    public void sleep() {
    	System.out.println("Dormindo...");
    }
    public void roam() {
    	System.out.println("Correndo...");
    };
}
