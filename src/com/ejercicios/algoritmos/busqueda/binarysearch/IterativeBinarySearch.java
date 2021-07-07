package com.ejercicios.algoritmos.busqueda.binarysearch;

/*
 * O(1)
 */
public class IterativeBinarySearch {

	public static void main(String args[]) {
		long timeInit = System.currentTimeMillis();
		int[] sortedArray;
		sortedArray = new int[20000000];
		for(int i = 0; i<20000000; i++) {
			sortedArray[i] = i;
		}
		int seek = 2;
		int result = binarySearch(sortedArray, seek, 0, sortedArray.length - 1);
		long timeEnd = System.currentTimeMillis();
		String totalTime = String.valueOf(timeEnd - timeInit);
		System.out.println("Result : " + result);
		System.out.println("Time total : " + totalTime);
	}

	public static int binarySearch(int[] sortedArray, int seek, int init, int end) {
		int middle = (init + end)/2;
		while(init<=end) {
			if(sortedArray[middle] == seek)
				return middle;
			
			if(seek > sortedArray[middle])
				init = middle + 1;
			else 
				end = middle -1;
			middle = (init + end)/2;
		}
		return -1;
	}
}
