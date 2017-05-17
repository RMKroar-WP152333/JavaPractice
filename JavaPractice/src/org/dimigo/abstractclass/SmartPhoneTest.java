package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ SmartPhoneTest.java
 * 
 * Date : 2017. 5. 12.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones = {
			new IPhone("iPhone 7", "애플", 900000),
			new Galaxy("갤럭시 S8", "삼성", 800000),
		};
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
		}
	}
}
