package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ SnackTest.java
 * 
 * Date : 2017. 4. 5.
 * This program is for making a introduction of 3 representative snacks.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class SnackTest {
	public static void main(String[] args) {
		int sum = 0;
		Snack[] snack = {
			new Snack("새우깡", "농심", 1100, 2),
			new Snack("콘칲", "크라운", 1200, 1),
			new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(int i = 0; i < snack.length; i++) {
			System.out.println(snack[i].toString());
			sum += snack[i].calcPrice();
		}
		System.out.println("총 구매 금액 : " + String.format("%,d", sum) + "원");
	}
}
