package java_basic;

import java.util.Scanner;
import static java.lang.System.out;

public class IfExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String result = "";
		out.print("정수 하나를 입력하시오 : ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			result += "2, ";
		}

		if (num % 3 == 0) {
			result += "3, ";
		}

		if (num % 5 == 0) {
			result += "5, ";
		}

		if (!result.equals("")) {
			out.println(result.substring(0, result.length() - 2) + "의 배수입니다.");
		} else {
			out.println("어떤 수의 배수도 아닙니다.");
		}
		sc.close();
	}
}
