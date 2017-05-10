package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ PersonTest2.java
 * 
 * Date : 2017. 5. 10.
 * This program is for practicing polymorphism in Java.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class PersonTest2 {
	public static void main(String[] args) {
		Person[] person = {
			new Person("Tom"),
			new Korean("홍길동"),
			new Japanese("다나카"),
			new Chinese("왕밍")
		};
		
		for(Person p : person) {
			greeting(p);
		}
	}
	
	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
}
