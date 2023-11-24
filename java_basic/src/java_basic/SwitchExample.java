package java_basic;

import java.util.Scanner;

import static java.lang.System.out;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num % 7) {
		case 0:
		case 1:
			out.println("0 1");
			break;
		case 2:
		case 3:
			out.println("2 3");
			break;
		case 4:
			out.println("4");
			break;
		default:
			out.println("default");

		}
		sc.close();
	}
}
