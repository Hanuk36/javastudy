package com.ict.day15;

public class Ex01 {
/*
  제네릭과 컬랙션(자료구조)
  제네릭: 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체 타입 (같은 클래스로 만든 객체들만 모아둔것)
  컬랙션: 객체들을 모아서 저장 관리하는 인터페이스들을 말한다.
  
  변수 => 하나의 데이터를 저장할수 있는 공간
  배열 => 같은 종류의 자료형을 저장
  		크기를 먼저 지정해야 된다. 변경이 안된다.
  		변수와 객체를 여러개를 저장 할 수 있다.
  클래스 => 배열은 같은 종류의 자료형을 저장하는 것이 불편해서 클래스에 저장하면
  다양한 종류의 데이터를 저장 할 수 있다.
  
  컬렉션 => 다양한 종류의 데이터를 저장한 클래스를 하나의 객체로 만들고
  		  그 객체를 컬랙션에 저장한 후 관리까지 할수 있는 인터페이스들이다.
  		  
  형식) 컬렉션<제네릭>
  API: <T> => 객체 타입(Type), <E> => 요소(Element), 즉 컬랙션 안에 존재하는 객체 하나 하나를 뜻한다.
  	   Map 형식 : <K,V> = > Key(키값), Value(데이터값) //1:1 대응이다
  	   1:1 대응 , **key 를 호출하면 (그것와 연결된) Value(값) 이 온다.
  
  촤상위 컬랙션 Collection<E> , Map<K,V>
  Collection<E> 를 상속 받아서 인터페이스들 : Set<E>, List<E>, Queue<E>     // 자식은 부모것을 쓸수 있다.
  
  Collection 의 주요 메서드
  add(E e) : boolean => 해당 컬렉션에 인자로 받은 요소를 추가. 성공하면 true, 실패하면 false
  addAll(Collection< ? extends E > c) : boolean   // E 를 상속받은 ? 이다   특정컬렉션 => Collection< ? extends E > c 이라 부른다
         => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
  clear : void => 모든 요소 제거
  contains(Object o) : boolean => 인자로 들어온 객체가 포함 되어 있으면 true
  isEmpty() : boolean => 비어 있으면 true
  remove(Object o) : boolean => 인자로 들어온 객체만 삭제하자. 성공하면 true.
  size() : int => 컬랙션안에 존재하는 Element 의 수
  toArray() : Object[] => 컬렉션을 배열로 만들어준다.
              반대 개념 => Arrays.asList() => 배열을 ArrayList 컬랙션으로 만들어 준다.
  
  ** iterator() : Iterator<E>  =>  컬랙션안에 존재하는 객체들을 순서대로 접근해서 위해서
                                   Iterator 객체를 반환
                                   컬랙션안에 존재하는 객체들을 하나씩 꺼내서 작업할때 사용
	 
 */
}
