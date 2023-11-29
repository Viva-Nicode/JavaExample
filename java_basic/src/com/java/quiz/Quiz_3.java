package com.java.quiz;

import static java.lang.System.out;

import java.util.Scanner;


public class Quiz_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		out.println("1.삼 2.사 3.원");
		out.print("입력 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			out.print("밑변과 높이 입력 : ");
			out.print("넓이는 : " + new Triangle(sc.nextInt(), sc.nextInt()).surface());
			break;
		case 2:
			out.print("밑변과 높이 입력 : ");
			out.print("넓이는 : " + new Rectangle(sc.nextInt(), sc.nextInt()).surface());
			break;
		case 3:
			out.print("반지름 입력 : ");
			out.print("넓이는 : " + new Circle(sc.nextInt()).getSize());
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


