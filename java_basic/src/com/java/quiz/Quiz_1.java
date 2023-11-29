package com.java.quiz;

import static java.lang.System.out;

import java.util.Scanner;

public class Quiz_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputInt = 6485;
		int num_1 = 0;
		int num_2 = 0;
		int num_3 = 0;
		int num_4 = 0;
		out.print("정수 입력 : ");
		inputInt = sc.nextInt();

		num_1 = inputInt / 1000;
		num_2 = inputInt % 1000 / 100;
		num_3 = inputInt % 1000 % 100 / 10;
		num_4 = inputInt % 1000 % 100 % 10;
		out.println("4자리 숫자 : " + num_1);
		out.println("3자리 숫자 : " + num_2);
		out.println("2자리 숫자 : " + num_3);
		out.println("1자리 숫자 : " + num_4);

//		float inputFloat = 0.001f * inputInt;
//		out.println((int)inputFloat);
//		out.println((int)((inputFloat - (float)((int)inputFloat)) * 10));

		sc.close();
	}
}
