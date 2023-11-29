package com.in28minutes.primitive.datatypes;

public class BiNumber {
	private int i;
	private int j;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public BiNumber(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int add() {
		return i + j;
	}

	public int multiply() {
		return i * j;
	}

	public void doubleValue() {
		this.i *= 2;
		this.j *= 2;
		System.out.println(i);
		System.out.println(j);

	}

}
