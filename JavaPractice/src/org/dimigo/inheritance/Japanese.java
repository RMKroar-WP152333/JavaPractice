package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ Japanese.java
 * 
 * Date : 2017. 4. 26.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class Japanese extends Person {
	public Japanese(String name) {
		super(name);
	}
	
	public void sayHello() {
		System.out.println("오하이요");
	}
	public void sayBye() {
		System.out.println("사요나라");
	}
	public String toString() {
		return "저는 일본사람 " + getName() + "입니다."; 
	}
}
