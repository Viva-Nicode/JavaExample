package java_basic;

import java.util.Scanner;
import static java.lang.System.out;

public abstract class Shape {
	private int baseLine = 0;
	private int height = 0;
	private int radius = 0;

	public Shape(int baseLine, int height) {
		this.baseLine = baseLine;
		this.height = height;
	}

	public Shape(int radius) {
		this.radius = radius;
	}

	public Shape() {
	}

	public int getBaseLine() {
		return baseLine;
	}

	public int getHeight() {
		return height;
	}

	public void setBaseLine(int bl) {
		this.baseLine = bl;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + baseLine;
		result = prime * result + height;
		result = prime * result + radius;
		return result;
	}

}

class Rectangle extends Shape implements Inputable, Calculatable {

	public Rectangle(int baseLine, int height) {
		super(baseLine, height);
	}

	public Rectangle() {
		super();
	}

	@Override
	public float getSize() {
		return getBaseLine() * getHeight();
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		out.print("�غ��� ���� �Է� : ");
		setBaseLine(sc.nextInt());
		setHeight(sc.nextInt());
		sc.close();
	}

	@Override
	public String toString() {
		return "�ﰢ���� ���̴� : " + getSize();
	}
	
	public void self() {
		out.println("self");
	}

}

class Circle extends Shape implements Inputable, Calculatable {

	public Circle(int radius) {
		super(radius);
	}

	public Circle() {
		super();
	}

	@Override
	public float getSize() {
		return (float) (Math.pow(getRadius(), 2) * Math.PI);
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		out.print("������ �Է� : ");
		setRadius(sc.nextInt());
		sc.close();
	}

	@Override
	public String toString() {
		return "���� ���̴� " + getSize();
	}

}
