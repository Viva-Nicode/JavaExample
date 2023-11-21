package java_basic;

import java.util.Scanner;
import static java.lang.System.out;

public class ConsoleInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		float inputFloat = 0f;
//		float outputFloat = 0f;
//		
//		out.print("반올림할 실수를 입력하세요 : ");
//		inputFloat = sc.nextFloat();
//		outputFloat = (int) (inputFloat * 100 + 5) / 10 / 10f;
//		
//		out.println(inputFloat);
//		out.println(outputFloat);

//		int firstInt = 0;
//		int secondInt = 0;
//
//		float sum = 0f;
//		float minus = 0f;
//		float multi = 0f;
//		float div = 0f;
//
//		int mock = 0;
//		int namuge = 0;
//
//		out.print("두 수 입력 : ");
//		firstInt = sc.nextInt();
//		secondInt = sc.nextInt();
//
//		sum = firstInt + secondInt;
//		minus = firstInt - secondInt;
//		multi = firstInt * secondInt;
//		div = firstInt / (float) secondInt;
//
//		mock = secondInt / firstInt;
//		namuge = secondInt % firstInt;
//
//		out.println("첫번쨰 정수  : " + firstInt);
//		out.println("두번째 정수 : " + secondInt);
//		out.println("더하기 : " + sum);
//		out.println("뺴기 : " + minus);
//		out.println("곱하기 : " + multi);
//		out.println("나누기 : " + div + "\n");
//		out.println("몫 : " + mock);
//		out.println("나머지 : " + namuge);

		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		int total = 0;
		float avg = 0f;

		out.print("네 개의 과목 점수를 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sci = sc.nextInt();

		total = kor + eng + math + sci;
		avg = ((total / 4f) * 100 + 5) / 10 / 10f;
//		avg = total/4f;
//		avg = (int)((avg*100+5)/10)/10f;

		out.println("kor\teng\tmath\tsci\ttotal\tavg");
		out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t", kor, eng, math, sci, total, avg);

		sc.close();
	}
}
