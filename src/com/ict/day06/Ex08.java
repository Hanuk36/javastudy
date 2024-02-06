package com.ict.day06;

public class Ex08 {

	public static void main(String[] args) {
		
		String str = "ICT 인재개발원 5강의장";
		
		//CharAt(int index) : char
		//위치정보(index, 0부터 시작)가 숫자로 들어오면 해당 위치레 존재하는 문자를 반환한다.
		
		char c1 = str.charAt(7);
		System.out.println(c1);
		
		
		str = "대한민국 I Love You 1004 ♥";
		//str 에 모든 글자를 대문자로 만들자. (소문자는 대문자에 -32)
		
		//해당 문자의 위치정보를 가지고 하나씩 꺼내서 검사할수 있다.
		for (int i = 0; i < str.length(); i++) {
			char c2 = str.charAt(i);
			if(c2 >= 'a' && c2 <= 'z') {
				c2 = (char)(c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();
		
		// 2. concat (String str) : String
		// 입력돤 문자열을 현재 문자열과 합친다. ("문자열" + "문자열" 과 같은 결과)
		String s1 = "대한민국";
		String s2 = s1.concat("KOREA");
		System.out.println(s2);
		
		//기본적으로는 변수에 저장해서 출력한다.
		String s3 = " KOREA";
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		// 3. contains (CharSequence s) : boolean
		//    CharSequence 는 char 값을 순서대로 읽을 수 있다.
		//    지금은 String 이라고 생각하자.
		//    입력된 String 을 넣어주면 해당 문자열에 입력된 String 이 존재하면 true, 존재하지 않으면 false
		
		String s5 = "12fdamb@gmail.com";
		boolean res = s5.contains("@");
		//boolean res = s5.contains('@'); //'' char 는 사용 불가능. 홑따옴표 쓰면 오류 발생
		System.out.println("res: " + res);
		System.out.println("결과11 : " + s5.contains(".com"));
		System.out.println("결과22 : " + s5.contains(".COM")); //대소문자 구분
		
		
		// 4. equals(Object anObject) : boolean
		//    입력된 믄지열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별한다.)
		// 5. equalsIgnoreCase(Object antherObject) : boolean
		//    입력된 믄지열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별 안한다)
		// ** 문자열과 문자열을 같다고 비교할때는 == 를 사용하지 않는다.
		
		String s6 = "Korea";
		String s7 = "KOREA";
		
		if(s6.equals(s7)) {
			System.out.println("같다"); //대소문자가 같아야 "같다"가 나온다 (대소문자 구분)
		}else {
			System.out.println("다르다");	
		}
		
		if(s6.equalsIgnoreCase(s7)) {
			System.out.println("같다"); //대소문자가 달라도 같다. "같다"가 나온다 (대소문자 구분하지 않는다.)
		}else {
			System.out.println("다르다");
		}
		
		
		// 6. format(String format, Object... args) : static String
		//    형식을 지정하고 형식에 맞춰서 문자열 생성
		String s8 = "한국 ICT 인재 개발원";
		
		System.out.println("----- %s -----");
		// %s 문자열
		String s9 = String.format("@@ %s !! 화이팅", s8);
		System.out.println(s9);
		
		// %30s 30가지 차지하는 문자열 (남은 자리는 비워둔다.) 오른쪽 정렬
		String s10 = String.format("%30s", s8);
		System.out.println(s10);
		
		// -는 왼쪽 정렬이 된다.
		String s11 = String.format("%-30s", s8);
		System.out.println(s11);
		
		String s12 = String.format("%16s !!", s8);
		System.out.println(s12);
		
		
        ////////////////////////////////////////
		System.out.println();
		System.out.println("-----%d 정수형식-----");
		//%d 정수형식
		
		int k1 = 2134;
		String s13 = String.format("%d @@", k1);
		System.out.println(s13);
		
		String s14 = String.format("%15d @@", k1);
		System.out.println(s14);
		
		String s15 = String.format("%-15d @@", k1);
		System.out.println(s15);
		
		
		////////////////////////////////////////
		System.out.println();
		System.out.println("-----%f 실수형식-----");
		
		// %f 실수형식 지정
		double s16 = 123.445678;
		
		String s17 = String.format("%f", s16); //반올림
		System.out.println(s17);
		
		String s18 = String.format("%.1f", s16);
		System.out.println(s18);
		
		String s19 = String.format("%.4f", s16);
		System.out.println(s19);
		
		
		//7. getByte() : byte[]
		//해당 문자열을 byte[]로 변환 시킨다.
		//보통 입/출력 할때 사용한다. (대소문자. 숫자 가능, 영어 이외에 글자는 안됨)
		//나중에 [] 배열을 배운후에 한다.
		
		
		////////////////////////////////////////
		System.out.println();
		System.out.println("----- indexOf -----");
		
		//8. indexOf(int ch), indexOf(String str) : int
		//   입력된 문자(ch), 문자열(str)의 위치값을 알려준다.
		//   문자나 문자열이 없으면 -1 반환
		
		String h1 = "BufferedReader"; //대소문자 구분 "A"를 찍으면 -1 리턴
		int h2 = h1.indexOf("a");
		System.out.println(h2); // 10
		
		h2 = h1.indexOf("er");
		System.out.println(h2); // 4
		
		h2 = h1.indexOf("err");
		System.out.println(h2); // -1
		
		// 9. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		//    fromIndex 는 시작 위치를 말한다.
		//    2번째, 3번째 문자나 글자를 찾기 위함
		
		// 2반째 e 를 찾자 (우선. 첫번째 e 를 찾아라)
		
		int h3 = h1.indexOf('e'); 
		System.out.println(h3); //4
		
		int h4 = h1.indexOf('e', h3 + 1);
		System.out.println(h4); //6
		
		
		System.out.println("----- lastIndexOf -----");
		
		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을때 사용
		
		//   BufferedReader
		int h5 = h1.lastIndexOf('e');
		System.out.println(h5);  // 12
		
		
		
		System.out.println("----- length() -----");
		
		// 11. length() : int 
		// 문자열의 길이를 구한다. (1부터 시작한다.)

		String str1 = "Hello";
		System.out.println("길이 : " + str1.length());
		
		
		System.out.println("----- replace() -----");
		// 12. replace(char oldChar, char newChar) : String
		//     replace(CharSequences target, CharSequences replacement) : String
		// 지금은 replace(String oldString, String newString) : String : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기) 한다.
		
		String str2 = "대한민국";
		String str3 = str2.replace('민', '民');
		System.out.println(str3); //대한民국
		
		String str4 = str2.replace("민", "民 ♥"); 
		System.out.println(str4); //대한民 ♥국
		
		String str30 = str2.replace("민아", "民 ♥"); 
		System.out.println(str30); // 안바뀜. "민아"가 업기 때문에
;		
		
		System.out.println("----- isEmpty() -----");
		// 13. isEmpty() : boolean
		// 해당 문자열이 비어 있으면 true. 내용이 있으면 false;
		
		String str5 = "대한민국";
		System.out.println(str5.isEmpty());
		
		String str6 = "";
		System.out.println(str6.isEmpty());
		
		//오류발생: Exception
		//String str7 = null;
		//System.out.println(str7.isEmpty());
		
		
		//14. split(String regex)            : String[]
		//    split(String regex, int limit) : String[]
		//배열 배운 이후에 나중에 한다.
		
		
		System.out.println("----- substring() -----");
		//15. substring(int beginIndex)               : String
		//    입력된 시작위치 부터 끝까지 문자열 추출
		//    substring(int beginIndex, int endIndex) : String 
		//	  입력된 시작위치 부터 입력된 끝위치 전까지 문자열 추출 (끝위치는 포함하지 않는다.)
		// endIndex - beginIndex = 추출할 문자의 갯수가 나온다.
		
		String t1 = "010-9732-9110";
		String t2 = t1.substring(4);
		System.out.println(t2); // 9732-9110
		
		t2 = t1.substring(9); 
		System.out.println(t2); // 9110
		
		t2 = t1.substring(t1.lastIndexOf('-') + 1);
		System.out.println(t2); // 9110
		
		String t3 = t1.substring(4,8);
		System.out.println(t3); // 9732
		
		// 010-7777-9999 => 010-7777-****, 010-****-9999 
		
		String t4 = "010-7777-9999";
		String t5 = "****";
		System.out.println(t4.replace(t4.substring(9), t5)); //010-7777-****
		
		System.out.println(t4.replace(t4.substring(4, 8), t5)); //010-****-9999
		
		
		// 16. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
		// 17. toUpperCase() : String => 해당 문자열을 모두 소문자로 변경
		
		
		System.out.println("----- toLowerCase() && toUpperCase() -----");
		String t6 = "대한민국 I Love You @ 1004";
		System.out.println(t6.toLowerCase()); // 대한민국 i love you @ 1004
		System.out.println(t6.toUpperCase()); // 대한민국 I LOVE YOU @ 1004
		
		
		
		
		
		System.out.println("----- toString() -----");
		
		// 18. toString : String
		// 모든 클래스의 toString : 모든 객체(클래스)에서 사용가능.
		//                      객체(클래스)가 가지고 있는 정보나 값(데이터)들을
		//                      문자열로 만들어서 반환하는 메서드
		//String 의 toString 은 문자열 자체를 반환
		
		String t7 = "java 17 자바 17";
		String t8 = t7.toString();
		System.out.println(t7);
		System.out.println(t8);
		
		
		System.out.println("----- trim() -----");
		//19. trim() : String (반환형)
		//    해당 문자열에 앞뒤 공백 제거, 중간 공백은 제거하지 않는다.
		String t9 = "  java 자바 JAVA  ";
		String t10 = t9.trim(); // () 안에 아무것도 안들어간다
		
		System.out.println(t9); //"  java 자바 JAVA  "
		System.out.println(t9.length()); //16 
		System.out.println(t10);          // "java 자바 JAVA"
		System.out.println(t10.length()); //12
		
		
		
		
		
		System.out.println("----- startWith() & endsWith() -----");
		//20. startsWith(String prefix) : boolean => 주어진 문자로 시작하는지 검색
		//    startsWith(String prefix, int toffset) : boolean => 주어진 문자로 시작하는지 검색
		//                                            toffset => 시작 위치
		// endsWith(String suffix) : boolean => 주어진 문자열로 끝나는지 검색
		
		//  (예) "java 자바 JAVA"
		boolean b1 = t10.startsWith("java"); //true
		System.out.println(b1);
		
		boolean b2 = t10.startsWith("JAVA"); //false
		System.out.println(b2);
		
		boolean b3 = t10.startsWith("자바",5); //true
		System.out.println("b3: " + b3);
		
		//endsWith()
		boolean b4 = t10.endsWith("JAVA"); //true
		System.out.println("b4: " + b4);
		
		
		
		
		System.out.println("----- valueOf(기본자료형) -----");
		//21. valueOf(기본자료형) : static String
		//    어떤 기본 자료형이든지 String 으로 변경 시킴 (기본자료형 + "") <= 무조건 String 으로 바뀜
		
		
		boolean bo1 = true;
		char ch1 = 'c';
		int num1 = 34;
		long num2 = 37L;
		float num3 = 3.1572f;
		double num4 = 3654.1241;
		
		//자료형 + 1 = 실제로 덧셈을 한다.
		//System.out.println(bo1 + 1); //boolean 이라 더하기 안됨. 오류남.
		System.out.println(ch1+1);
		System.out.println((char)(ch1+1)); // int >char 이기 때문에 숫자로 나옴. char 로 보려면 형변환
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		
		System.out.println("--");
		System.out.println(String.valueOf(b1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		
		System.out.println("--");
		System.out.println(bo1 + "1");
		System.out.println(ch1 + "1");
		System.out.println(num1 + "1");
		System.out.println(num2 + "1");
		System.out.println(num3 + "1");
		System.out.println(num4 + "1");  // 바로 위에거랑 결과는 같다.
		
		
		
		
		
		
		System.out.println("----- Wrapper 클래스 -----");
		System.out.println("--parseBoolean()--");
		//22. Wrapper 클래스
		//    기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경 시키는 클래스들
		//    기본 자료형을 객체로 만들 때 사용하는 클래스
		
		//22-1. "true", "false" 문자열을 기본자료형인 boolean 형으로 변경: Boolean.parseBoolean(String);
		//      "true", "false"  ==>  true, false  (즉, 문자열 true, false 가 실제 true, false 로 바뀜)
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg); // "true" => true
		System.out.println(msg + 1); // true1
		
		//실제 boolean 형으로 변경했으므로 덧셈 계산을 할수 없다.
		//System.out.println(msg2 + 1); //String true 가 아니고, boolean 형 실제 true 라서 덧셈이 안됨.
		
		msg2 = Boolean.parseBoolean("가나다");
		System.out.println(msg2); //true 뺀 나머진 다 false 로 나옴
		
		
		
		
		System.out.println("--parseInt()--");
		//22-2. "10", "124" 문자열을 기본자료형인 int 형으로 변경 : Integer.parseInt(String s);
		msg = "124";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10);   // 12410
		System.out.println(msg3 + 10);  // 134
		
		
		System.out.println("--parseLong()--");
		//22-3. 문자열을 기본자료형인 long형으로 변경: Long.parseLong();
		//      "숫자" => ok,    "숫자L" = err (오류)
		
		//msg = "12345612312L";
		  msg = "12345612312";
		//int 형의 범위를 벗어나서 L 을 붙여야 한다.
		long msg4 = 12345612312L;
		//long msg4 = 12345612312L;
		//long msg5 = 1234L;
		//long msg6 = 1234;
		
		long msg5 = Long.parseLong(msg); //L 을 지워야 컴파일이 된다. 즉, msg = "12345612312"; 이렇게 해야함.
		System.out.println(msg5 + 1);  
		
		
		System.out.println("--parseFloat()--");
		// 22-3. 문자열을 float 로 변경 : Float.parseFloat();
		// "숫자f" => ok
		// 되도록이면 double, BigDecimal 을 쓰는게 낫다.
		msg = "32.14f";
		float msg6 = Float.parseFloat(msg);
		System.out.println(msg6 + 10);  // long 과 다르게 숫자+f 가 있어도 컴파일 됨. 즉, 에러 안남.
		
		
		System.out.println("--parseDouble()--");
		//22-4. 문자열을 double 변경: Double.parseDouble();
		msg = "3.17598";
		double msg7 = Double.parseDouble(msg);
		System.out.println(msg7 + 10);
		
		
		
		System.out.println("--Character--");
		//22-5. Character.parseCharacter() 는 존재 하지 않는다.
		//      문자열을 char 로 변경하는 클래스는 존재하지 않는다.
		//      그러나 String 의 charAt() 사용하면 char 로 만들수 있다.
 		
		msg = "A";
		char msg8 = msg.charAt(0);
		System.out.println(msg + 1);
		System.out.println(msg8 + 1); // int 가 더 크기때문에 숫자로 나옴
		System.out.println((char)(msg8 + 1)); // 형변환을 해야 문자로 나옴
		
		
		
		
		//23. 배열을 배운후 하자.
		// String.getBytes()               : byte[]
		// String.toCharArray()            : char[]
		// split(String regex)             : String[]
		// split(String regex, int limit)  : String[]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	}
}
