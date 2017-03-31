package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Question.java
 * 
 * Date : 2017. 3. 31.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class Question {
	public static void main(String[] args) {
		String[] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers = {"안예은", "신세경", "음악"};
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("" + i + "." + questions[i-1]);
			answer = scanner.nextLine();
			System.out.println((answers[i-1].equals(answer))? "정답입니다!" : "틀렸습니다!"); // nullPointerException
		}
		System.out.println("<< 결과 출력 >>");
		for(int i = 1; i <= 3; i++) {
			StringBuilder output = new StringBuilder(questions[i-1]);
			output.append(" ").append(answers[i-1]).append("입니다.");
			System.out.println(output);
		}
		scanner.close();
	}
}
