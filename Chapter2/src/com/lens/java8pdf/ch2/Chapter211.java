package com.lens.java8pdf.ch2;

import java.util.ArrayList;
import java.util.List;

public class Chapter211 {
	public static void main(String[] args) {
		new Chapter211();
	}
	
	public Chapter211() {
		Apple redApple = new Apple("red");
		Apple greenApple = new Apple("green");
		Apple greenApple2 = new Apple("green");
		Apple yellowApple = new Apple("yellow");
		
		List<Apple> inventory = new ArrayList<>();
		inventory.add(redApple);
		inventory.add(greenApple);
		inventory.add(greenApple2);
		inventory.add(yellowApple);
		
		for(Apple a : inventory) {
			System.out.println(a);
		}
		System.out.println("----------------------");
		List<Apple> l2 = filterGreenApples(inventory);
		
		for(Apple a : l2) {
			System.out.println(a);
		}
		
	}
	
	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if("green".equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
}
