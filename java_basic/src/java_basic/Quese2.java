package java_basic;

import java.util.Scanner;

import static java.lang.System.out;

public class Quese2 {

	public static void main(String[] args) {

		int p = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		int c = (int) (Math.random() * 3 + 1);
		out.println("��ǻ�ʹ� �����߽��ϴ�.\n����� ������?");
		out.println("1. ���� 2. ���� 3. ��");
		out.print("���� : ");
		p = sc.nextInt();
		out.printf("���\t��ǻ��\n");

		switch (p) {
		case 1:
			out.print("����\t");
			break;
		case 2:
			out.print("����\t");
			break;
		case 3:
			out.print("��\t");
			break;
		}

		switch (c) {
		case 1:
			out.print("����\t");
			break;
		case 2:
			out.print("����\t");
			break;
		case 3:
			out.print("��\t");
			break;
		}

		out.println();
		int dif = c - p;

		if (dif == -2 || dif == 1) {
			result = "��\t��";
		} else if (dif == -1 || dif == 2) {
			result = "��\t��";
		} else {
			result = "    ���";
		}
		out.println(result);
		sc.close();
	}
}
