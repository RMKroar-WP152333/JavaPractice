/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ PrimitiveDataType.java
 * 
 * Date : 2017. 3. 9.
 * This program is for
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */
public class PrimitiveDataType {
	public static void main(String[] args) {
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 65;
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + (isMale? "남자" : "여자"));
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
	}
}
