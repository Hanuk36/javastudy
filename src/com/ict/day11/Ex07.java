package com.ict.day11;

public class Ex07 {

	String name = "";
	int sum = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;
	
	//기본 생성자는 ctrl + space 찍으면 나온다
	public Ex07() {
		
	}
	//생성자는 메서드를 호출할수 있다.
	public Ex07(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		process(); //이렇게 하면 된다. ///Ex08 47줄과 연관. 중요
	}

	// 한번에 처리하자.
	public void process() {
		
		sum = kor + eng + math;
		// sum = k1 + k2 + k3; 이렇게 해도 된다.
		avg = (int) ((sum) / 3 * 10) / 10.0;

		if (avg >= 90) {

			hak = "A학점";

		} else if (avg >= 80) {

			hak = "B학점";
		} else if (avg >= 70) {

			hak = "C학점";
		} else {

			hak = "F학점";
		}
	}
}