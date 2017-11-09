package com.lens.java8pdf.ch2;

import java.util.ArrayList;
import java.util.List;

public class Chapter213 {
	public static void main(String[] args) {
		new Chapter213();
	}
	
	public Chapter213() {
		Apple redApple = new Apple("red");
		Apple redApple2 = new Apple("red");
		Apple greenApple = new Apple("green");
		Apple greenApple2 = new Apple("green");
		Apple yellowApple = new Apple("yellow");
		
		redApple.setWeight(80);
		redApple2.setWeight(120);
		greenApple.setWeight(115);
		greenApple2.setWeight(200);
		yellowApple.setWeight(105);
		
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
		List<Apple> l2 = filterApples(inventory,"green",0,true);
		
		for(Apple a : l2) {
			System.out.println(a);
		}
		System.out.println("----------------------");
		List<Apple> l3 = filterApples(inventory,"",119,false);
		
		for(Apple a : l3) {
			System.out.println(a);
		}
	}
	
	public static List<Apple> filterApples (List<Apple> inventory, String color, int weight, boolean flag){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if((flag && apple.getColor().equals(color)) ||	(!flag && apple.getWeight() > weight)) {
				result.add(apple);
			}
					
		}
		return result;
	}
}
