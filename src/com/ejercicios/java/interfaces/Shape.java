package com.ejercicios.java.interfaces;


// A partir de esta versión, las interfaces pueden proveer métodos con una implementación por defecto
public interface Shape {
	void draw();
    double area();
    
    default void printSomething() {
    	System.out.print("printSomething");
    }
}
