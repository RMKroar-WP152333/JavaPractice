package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Operator.java
 * 
 * Date : 2017. 3. 13.
 * This program is for calculating entire personal expenses of DIMIBENE in a year.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class Operator {
	public static void main(String[] args) {
		int salary = 1700000, clerkN = 3, storeN = 1500;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + clerkN + "명");
		System.out.println("점포 수 : " + String.format("%,d", storeN) + "개");
		System.out.printf("\n");
		System.out.println("연간 인건비 : " + String.format("%,d", (long)salary * 12 * clerkN * storeN) + "원");
	}
}