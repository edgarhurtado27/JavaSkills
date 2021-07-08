package com.ejercicios.java.synchronization;

public class Table {
	public synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
