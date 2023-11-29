package com.java.main;

import static java.lang.System.out;

import java.util.Scanner;

import com.java.dto.ScoreVO;


public class ScoreMain {

	public static void main(String[] args) {
		final int student_num;
		Scanner sc = new Scanner(System.in);
		out.print("학생수 : ");
		student_num = sc.nextInt();
		ScoreVO[] studentArray = new ScoreVO[student_num];

		for (int i = 0; i < student_num; i++) {
			studentArray[i] = new ScoreVO();

			out.print("이름 : ");
			sc.nextLine();
			studentArray[i].name = sc.nextLine();
			out.print("국어 : ");
			studentArray[i].kor = sc.nextInt();
			out.print("영어 : ");
			studentArray[i].eng = sc.nextInt();
			out.print("수학 : ");
			studentArray[i].math = sc.nextInt();
			out.print("과학 : ");
			studentArray[i].sci = sc.nextInt();
		}
		out.println("name\tkor\teng\tmath\tsci\ttotal\tavg");
		for (int i = 0; i < student_num; i++) 
			out.println(studentArray[i]);
		sc.close();
	}
}
// alt shift s 생성자 게터 세터 
// alt shift a 멀티 커서
// alt shift r 이름 한번에
// ctrl shift f 코드 포매팅
// 29일에 바낌
