package com.ict.day18;

import java.util.Arrays;
import java.util.stream.Stream;

// Integer 라는 클래스배열로 하면 
// Stream.of 와 Arrays.stream 둘다 Stream<Integer> 를 리턴 합니다.


// int 라는 기본자료형으로 하면 
// Arrays.stream 은 IntStream 을 리턴하지만, 
// Stream.of 는 Stream<Integer> 리턴되어 주소값이 찍힙니다.
// 4번의 해결방법은 5번 입니다. IntStream 바꿔줍니다.

public class Test18 {
	public static void main(String[] args) {
		
		//1. return Stream<Integer> 
		Integer[] array = { 1, 2, 3, 4, 5 };
		Stream.of(array).forEach(s-> System.out.println(s));
		
		System.out.println("===");
		
		//2. return Stream<Integer>
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Arrays.stream(array1).forEach(s-> System.out.println(s));
		
		System.out.println("===");
		
		//3. returns IntStream
		int[] array2 = { 1, 2, 3, 4, 5 };
		Arrays.stream(array2).forEach(s-> System.out.println(s));
		
		System.out.println("===");
		
		//4. returns `Stream<int[]>`
		int[] array3 = { 1, 2, 3, 4, 5 };
		Stream.of(array3).forEach(s-> System.out.println("주소값 나옴" + s));
		
		System.out.println("===");
		
		//5.해결방법
		//returns `Stream<int[]>`
		// returns IntStream
		int[] array4 = { 1, 2, 3, 4, 5 };
		Stream.of(array4).flatMapToInt(Arrays::stream).forEach(s-> System.out.println(s));
	}
}