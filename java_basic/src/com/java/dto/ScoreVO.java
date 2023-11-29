package com.java.dto;

public class ScoreVO {
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int sci;

	public ScoreVO(String name, int kor, int eng, int math, int sci) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
	}

	public ScoreVO() {
	}

	public int getTotal() {
		return kor + eng + math + sci;
	}

	public float getAvg() {
		return this.getTotal() / 4.0f;
	}

	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sci + "\t" + getTotal() + "\t" + getAvg();
	}

}

//�ﰢ�� �簢�� ���� ���̸� �����ؼ� ���ϴ� ���α׷� �ۼ�.
