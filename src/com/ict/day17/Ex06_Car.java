package com.ict.day17;

import java.util.ArrayList;
import java.util.List;

public class Ex06_Car {
	//차를 판매할때 사용하는 리스트
	//판메할 차를 가지고 있는 공간
	private List<String> carList = null;
	
	//객체를 생성하면 carList 컬랙션이 만들어진다.
	public Ex06_Car() {
		carList = new ArrayList<String>();
	}
	
	//해당 메서드를 실행하면 carName 을 반환
	//차 생산
	public String getCar() {
		String carName = null;
		
		switch((int)(Math.random()*3)) { // 0~2 
			case 0 : carName = "SM5"; break;
			case 1 : carName = "매그너스"; break;
			case 2 : carName = "카렌스"; break;
		}
		return carName;
	}
	
	public synchronized String pop() {
		String carName = null;
		//carList 의 크기가 0 이면 wait()
		if(carList.size() == 0) {
			try {
				System.out.println("차가 없어요 생산할때 까지 " + "기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//carList 가 가지고 있는 것 중에 맨 마지막에 있는 차 삭제. (판매된것)
		carName = (String)carList.remove(carList.size()-1); //remove 삭제
		System.out.println("손님이 차를 사갔습니다.." +
						  "손님이 구입한 차이름은=>\" " + carName+"\"");
		return carName; 
	}
	
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어 졌습니다. " + "차이름은 \" " + car+"\"");
		if(carList.size()==5) {
			this.notify();
		}
	}
}
