package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ CarTest.java
 * 
 * Date : 2017. 3. 23.
 * This program is for making a introduction of 3 representative cars in Korea.
 * </pre>
 *
 * @author : RMKroar
 * @version : 2.0
 */

public class CarTest2 {
	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");
		Car2 carH = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 carK = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 carS = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("제조사명 : " + carH.getCompany());
		System.out.println("모델명 : " + carH.getModel());
		System.out.println("색상 : " + carH.getColor());
		System.out.println("최대속도 : " + carH.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", carH.getPrice()) + "원");
		System.out.println("");
		
		System.out.println("제조사명 : " + carK.getCompany());
		System.out.println("모델명 : " + carK.getModel());
		System.out.println("색상 : " + carK.getColor());
		System.out.println("최대속도 : " + carK.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", carK.getPrice()) + "원");
		System.out.println("");
		
		System.out.println("제조사명 : " + carS.getCompany());
		System.out.println("모델명 : " + carS.getModel());
		System.out.println("색상 : " + carS.getColor());
		System.out.println("최대속도 : " + carS.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", carS.getPrice()) + "원");
	}
}
