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
 * @version : 1.0
 */

public class CarTest {
	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");
		Car carH = new Car();
		Car carK = new Car();
		Car carS = new Car();
		
		carH.setCompany("현대자동차");
		carK.setCompany("기아자동차");
		carS.setCompany("삼성자동차");
		
		carH.setModel("제네시스");
		carK.setModel("K7");
		carS.setModel("SM7");
		
		carH.setColor("검정색");
		carK.setColor("흰색");
		carS.setColor("회색");
		
		carH.setMaxSpeed(225);
		carK.setMaxSpeed(246);
		carS.setMaxSpeed(200);
		
		carH.setPrice(50000000);
		carK.setPrice(40000000);
		carS.setPrice(38000000);
		
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
