package com.java.main;

import static java.lang.System.out;

import java.util.Scanner;

import com.java.dto.ScoreVO;


public class ScoreMain {

	public static void main(String[] args) {
		final int student_num;
		Scanner sc = new Scanner(System.in);
		out.print("�л��� : ");
		student_num = sc.nextInt();
		ScoreVO[] studentArray = new ScoreVO[student_num];

		for (int i = 0; i < student_num; i++) {
			studentArray[i] = new ScoreVO();

			out.print("�̸� : ");
			sc.nextLine();
			studentArray[i].name = sc.nextLine();
			out.print("���� : ");
			studentArray[i].kor = sc.nextInt();
			out.print("���� : ");
			studentArray[i].eng = sc.nextInt();
			out.print("���� : ");
			studentArray[i].math = sc.nextInt();
			out.print("���� : ");
			studentArray[i].sci = sc.nextInt();
		}
		out.println("name\tkor\teng\tmath\tsci\ttotal\tavg");
		for (int i = 0; i < student_num; i++) 
			out.println(studentArray[i]);
		sc.close();
	}
}
// alt shift s ������ ���� ���� 
// alt shift a ��Ƽ Ŀ��
// alt shift r �̸� �ѹ���
// ctrl shift f �ڵ� ������
// 29�Ͽ� �ٳ�
