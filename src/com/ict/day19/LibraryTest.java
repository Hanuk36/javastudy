package com.ict.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이선", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		//스트림 생성하고 출력하기
		Stream<Book> stream = bookList.stream();
		
		//모든 책의 가격의 합
		int sum = stream.mapToInt(i -> i.getPrice()).sum();
		System.out.println("모든 책의 가격의 합: " + sum);
		
		
		//책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력
		stream = bookList.stream();
		stream.filter(i -> i.getPrice() >= 20000)
			  .map(i->i.getName())
		      .forEach(i->System.out.print(i + " "));
	}
}
