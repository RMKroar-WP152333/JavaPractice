package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ Person.java
 * 
 * Date : 2017. 4. 26.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class Person {
	private String name;
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	public void sayBye() {
		System.out.println("Bye");
	}
	public String toString() {
		return "저는 " + name + "입니다."; 
	}
}
