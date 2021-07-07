package com.ejercicios.java.abstractclass;

public abstract class Shape {

	String name = "";
	
	public Shape(String name) {
		this.name = name;
	}
	
	/*
	 * Implement those methods which the functionality could be extended or shared by more than one class
	 */
	public void moveTo(int x, int y) {
		System.out.println(this.name + " has been moved to x = " + x + " y = " + y);
	}

	/*
	 * These methods will be implemented by its subclass
	 */
	abstract public double area();
    abstract public void draw();
}
