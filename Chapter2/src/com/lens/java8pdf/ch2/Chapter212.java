package com.lens.java8pdf.ch2;

import java.util.ArrayList;
import java.util.List;

public class Chapter212 {
	public static void main(String[] args) {
		new Chapter212();
	}
	
	public Chapter212() {
		Apple redApple = new Apple("red");
		Apple redApple2 = new Apple("red");
		Apple greenApple = new Apple("green");
		Apple greenApple2 = new Apple("green");
		Apple yellowApple = new Apple("yellow");
		
		List<Apple> inventory = new ArrayList<>();
		inventory.add(redApple);
		inventory.add(greenApple);
		inventory.add(greenApple2);
		inventory.add(yellowApple);
		inventory.add(redApple2);
		
		for(Apple a : inventory) {
			System.out.println(a);
		}
		System.out.println("----------------------");
		List<Apple> l2 = filterGreenApples(inventory);
		
		for(Apple a : l2) {
			System.out.println(a);
		}
		System.out.println("----------------------");
		List<Apple> l3 = filterApplesByColor(inventory, "red");
		for(Apple a : l3) {
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
	
	public static List<Apple> filterApplesByColor(List<Apple> inventory,String color){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(apple.getColor().equals(color)) {
				result.add(apple);
			}
		}
		return result;
	}
}
