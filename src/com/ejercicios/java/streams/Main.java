package com.ejercicios.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

/*
 * Stream : A sequence of elements supporting sequential and parallel aggregate operations. 
 * there are primitive specializations for IntStream, LongStream, and DoubleStream
 * 
 * A stream pipeline consists of a source (which might be an array, a collection, a generator function, an I/O channel, etc),
 * zero or more intermediate operations (which transform a stream into another stream, such as filter(Predicate)), 
 * and a terminal operation (which produces a result or side-effect, such as count() or forEach(Consumer)). 
 * 
 * Streams are lazy; computation on the source data is only performed when the terminal operation is initiated, 
 * and source elements are consumed only as needed
 */
public class Main {

	public static void main(String args[]) {
		// simplestIntStreamExample();
		// simplestStreamExample();
		dummyIncludesFunction();
	}
	
	public static void dummyIncludesFunction() {
		String expectedWord = "java";
		List<String>  palabras = Arrays.asList("Java", "Lambdas",  "Stream", "API");
		boolean result = palabras.stream()
				.map(el -> el.toLowerCase())
				.anyMatch(el -> expectedWord.equals(el) );

		System.out.println("dummyIncludesFunction: " + result);
	}
	
	public static void simplestStreamExample() {
		Stream.iterate(0, el -> el + 2)
			.limit(20)
			.forEach(el -> System.out.println(" : " + el) );
	}
	
	public static void simplestIntStreamExample() {
		int[]  enteros = new int[]{1,2,3,4,5};  
		IntStream  streamEnteros = Arrays.stream(enteros);

		int sum = streamEnteros.filter(el -> el > 4)
				.map(el -> el * 2)
				.sum();
		
		System.out.println("simplestIntStream array sum : " + sum);
	}
}
