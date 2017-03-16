/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Loop.java
 * 
 * Date : 2017. 3. 15.
 * This program is for making a simple game-unlike game.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */
public class Loop {
	public static void main(String[] args) {
		int attack = 100, choice = 0;
		Scanner scanner = new Scanner(System.in);
		String[] character = {"마법사", "영주", "기사", "농민"};
		String user;

		do {
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------");

			System.out.println("메뉴 입력 -> ");
			choice = scanner.nextInt(); // input
			switch (choice) {
			case 1:
				attack += 10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", attack);
				break;
			case 2:
				attack -= 10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n", attack);
				break;
			case 3:
				user = character[new Random().nextInt(4)];
				System.out.printf("%s(으)로 설정되었습니다.", user);
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
		} while (choice != 9);
	}
}
