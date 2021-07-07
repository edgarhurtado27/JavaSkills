package com.ejercicios.java.interfaces;

public class Main {

	public static void main(String args[]) {

        Shape rect = new Rectangle(2, 3);
        System.out.println("Area of rectangle: " + rect.area());
 
        Shape circle = new Circle(2);
        System.out.println("Area of circle: " + circle.area());	
	}
}
