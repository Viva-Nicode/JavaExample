package com.java.dto;

public class ScoreVO {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sci;

	public ScoreVO(String name, int kor, int eng, int math, int sci) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
	}

	public int getTotal() {
		return kor + eng + math + sci;
	}

	public float getAvg() {
		return this.getTotal() / 4.0f;
	}

	public String getName() {
		return name;
	}
}
