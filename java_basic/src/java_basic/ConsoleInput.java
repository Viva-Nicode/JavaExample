package java_basic;

import java.util.Scanner;
import static java.lang.System.out;

public class ConsoleInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		float inputFloat = 0f;
//		float outputFloat = 0f;
//		
//		out.print("�ݿø��� �Ǽ��� �Է��ϼ��� : ");
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
//		out.print("�� �� �Է� : ");
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
//		out.println("ù���� ����  : " + firstInt);
//		out.println("�ι�° ���� : " + secondInt);
//		out.println("���ϱ� : " + sum);
//		out.println("���� : " + minus);
//		out.println("���ϱ� : " + multi);
//		out.println("������ : " + div + "\n");
//		out.println("�� : " + mock);
//		out.println("������ : " + namuge);

		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		int total = 0;
		float avg = 0f;

		out.print("�� ���� ���� ������ �Է� : ");
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
