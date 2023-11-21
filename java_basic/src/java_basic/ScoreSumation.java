package java_basic;

import static java.lang.System.out;

public class ScoreSumation {

	public static void main(String[] args) {
//		int firstInt = 3;
//		int secondInt = 5;
//
//		float sum;
//		float subtract;
//		float multi;
//		float divid;
//
//		int share;
//		int remainder;
//
//		sum = firstInt + secondInt;
//		subtract = firstInt - secondInt;
//		multi = firstInt * secondInt;
//		divid = firstInt / (float) secondInt;
//
//		share = secondInt / firstInt;
//		remainder = secondInt % firstInt;
//
//		out.println("첫번쨰 정수  : " + firstInt);
//		out.println("두번째 정수 : " + secondInt);
//		out.println("더하기 : " + sum);
//		out.println("뺴기 : " + subtract);
//		out.println("곱하기 : " + multi);
//		out.println("나누기 : " + divid + "\n");
//		out.println("몫 : " + share);
//		out.println("나머지 : " + remainder);

		float num = 1234.5679f;
		out.println(String.format("%.1f", num));
		float inputFloat = 1234.5679f;
//		float outputFloat = (int) ((inputFloat * 100 + 5) / 10) / 10f;
		float outputFloat = (((int) (inputFloat * 100 + 5)) / 10) / 10f;
		out.println(outputFloat);

		int kor = 76;
		int eng = 80;
		int math = 90;
		int sci = 67;
		int total = (kor + eng + math + sci);
		float avg = (int)((total / 4f) * 100 + 5) / 10 / 10f;
//		float avg = ((int)(((total / 4f) * 100 + 5) / 10)) / 10f;
//		7830
		
		
		out.println("kor\teng\tmath\tsci\ttotal\tavg");
		out.printf("%d\t%d\t%d\t%d\t%d\t%f\t", kor, eng, math, sci, total, avg);

	}
}

// alt shift r : 변수명 한번에 
