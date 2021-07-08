package com.ejercicios.java.synchronization;

public class Thread2 extends Thread {

	public Table table;
	
	public Thread2(Table table) {
		this.table = table;
	}
	
	public void run() {
		table.printTable(2);
	}
}
