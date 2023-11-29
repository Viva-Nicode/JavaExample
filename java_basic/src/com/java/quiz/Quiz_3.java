package com.java.quiz;

import static java.lang.System.out;

import java.util.Scanner;


public class Quiz_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		out.println("1.�� 2.�� 3.��");
		out.print("�Է� : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			out.print("�غ��� ���� �Է� : ");
			out.print("���̴� : " + new Triangle(sc.nextInt(), sc.nextInt()).surface());
			break;
		case 2:
			out.print("�غ��� ���� �Է� : ");
			out.print("���̴� : " + new Rectangle(sc.nextInt(), sc.nextInt()).surface());
			break;
		case 3:
			out.print("������ �Է� : ");
			out.print("���̴� : " + new Circle(sc.nextInt()).getSize());
			break;
		}
		sc.close();
	}
}

abstract class Shape{
	public int width;
	public int height;
	
	public Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public abstract float surface();
	
}

class Triangle extends Shape{
	
	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public float surface() {
		return width * height / 2.0f;
	}

	
}

class Rectangle extends Shape{

	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public float surface() {
		return width * height;
	}

}

class Circle {
	public int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public float getSize() {
		return (float) (Math.pow(radius, 2) * Math.PI);
	}
}


