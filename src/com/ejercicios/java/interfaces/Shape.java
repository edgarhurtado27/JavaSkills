package com.ejercicios.java.interfaces;


// A partir de esta versi�n, las interfaces pueden proveer m�todos con una implementaci�n por defecto
public interface Shape {
	void draw();
    double area();
    
    default void printSomething() {
    	System.out.print("printSomething");
    }
}
