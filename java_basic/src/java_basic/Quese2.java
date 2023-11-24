package java_basic;

import java.util.Scanner;

import static java.lang.System.out;

public class Quese2 {

	public static void main(String[] args) {

		int p = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		int c = (int) (Math.random() * 3 + 1);
		out.println("컴퓨터는 결정했습니다.\n당신의 선택은?");
		out.println("1. 가위 2. 바위 3. 보");
		out.print("선택 : ");
		p = sc.nextInt();
		out.printf("당신\t컴퓨터\n");

		switch (p) {
		case 1:
			out.print("가위\t");
			break;
		case 2:
			out.print("바위\t");
			break;
		case 3:
			out.print("보\t");
			break;
		}

		switch (c) {
		case 1:
			out.print("가위\t");
			break;
		case 2:
			out.print("바위\t");
			break;
		case 3:
			out.print("보\t");
			break;
		}

		out.println();
		int dif = c - p;

		if (dif == -2 || dif == 1) {
			result = "패\t승";
		} else if (dif == -1 || dif == 2) {
			result = "승\t패";
		} else {
			result = "    비김";
		}
		out.println(result);
		sc.close();
	}
}
