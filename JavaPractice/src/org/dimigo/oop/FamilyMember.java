package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ FamilyMember.java
 * 
 * Date : 2017. 4. 19.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class FamilyMember {
	private static int memberCnt;
	private String memberName;

	public FamilyMember(String memberName) {
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
