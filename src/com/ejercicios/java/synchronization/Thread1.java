package com.ejercicios.java.synchronization;

public class Thread1 extends Thread{
	
	public Table table;
	
	public Thread1(Table table) {
		this.table = table;
	}
	
	public void run() {
		table.printTable(5);
	}

}
