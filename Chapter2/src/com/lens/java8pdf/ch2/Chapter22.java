package com.lens.java8pdf.ch2;

import java.util.ArrayList;
import java.util.List;

public class Chapter22 {
	public static void main(String[] args) {
		new Chapter22();
	}
	
	public Chapter22() {
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
		
		List<Apple> filteredApples = filterApples(inventory, new AppleHeavyWeightPredicate());
		
		for(Apple apple : filteredApples) {
			System.out.println(apple);
		}
		
		System.out.println("----------------------");
		
		List<Apple> filteredApples2 = filterApples(inventory, new AppleRedAndLessThan120gPredicate());
		
		for(Apple apple : filteredApples2) {
			System.out.println(apple);
		}
		
	}
	
	public static List<Apple> filterApples (List<Apple> inventory,ApplePredicate aPredicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(aPredicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;		
	}
	
	class AppleHeavyWeightPredicate implements ApplePredicate{
		@Override
		public boolean test(Apple apple) {
			return apple.getWeight() > 150;
		}
	}
	
	class AppleGreenColorPredicate implements ApplePredicate{
		@Override
		public boolean test(Apple apple) {
			return apple.getClass().equals("green");
		}
	}
	
	class AppleRedAndLessThan120gPredicate implements ApplePredicate{
		@Override
		public boolean test(Apple apple) {
			return "red".equals(apple.getColor()) && apple.getWeight() < 120;
		}
	}
}
