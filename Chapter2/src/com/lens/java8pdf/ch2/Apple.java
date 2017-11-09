package com.lens.java8pdf.ch2;

public class Apple {
	private String color;
	private int weight;
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ";weight"+ weight + "]";
	}
	
	
}
