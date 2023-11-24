package java_basic;

import static java.lang.System.out;
import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ForExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ScoreVO s = new ScoreVO("alice", 41, 57, 60, 72);
		
		out.println(s.getAvg());

//		out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		for (int i = 0; i < num; i++)
//			out.print("*");

//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++)
//				out.println(i + " * " + j + " = " + i * j);
//		}

//		out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		boolean isPrime = false;
//		
//		for (int i = 2; i < Math.sqrt(num); i++) {
//			if (num % i == 0)
//				isPrime = true;
//		}
//		
//		if (isPrime)
//			out.println("소수 아님");
//		else
//			out.println("소수임");

//		for (int i = 1; i < 11; i++) {
//			for (int j = 1; j <= i; j++) {
//				out.print("*");
//			}
//			out.println();
//		}

		sc.close();
	}
}
