package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ PiggyBankTest.java
 * 
 * Date : 2017. 4. 19.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember[] member = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생"),
		};
		int[] money = {10000, 5000, 2000, 1000};
		
		FamilyMember.printMemberCnt();
		
		for(int i = 0; i < money.length; i++) {
			PiggyBank.putMoney(member[i], money[i]);
		}
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(member[2], money[3]);
		PiggyBank.printBalance();
	}
}