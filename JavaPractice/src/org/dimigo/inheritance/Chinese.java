package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ Chinese.java
 * 
 * Date : 2017. 4. 26.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class Chinese extends Person {
	public Chinese(String name) {
		super(name);
	}
	
	public void sayHello() {
		System.out.println("니하오");
	}
	public void sayBye() {
		System.out.println("쨔이찌엔");
	}
	public String toString() {
		return "저는 중국사람 " + getName() + "입니다."; 
	}
}
