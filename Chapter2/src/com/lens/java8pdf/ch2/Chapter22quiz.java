package com.lens.java8pdf.ch2;

import java.util.ArrayList;
import java.util.List;

public class Chapter22quiz {
	public static void main(String[] args) {
		new Chapter22quiz();
	}
	
	public Chapter22quiz() {
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
		
		applePrinter(inventory, new AppleFancyFormatter());
		
		System.out.println("----------------------");
		
		applePrinter(inventory, new AppleSimpleFormatter());
	}
	
	public static void applePrinter(List<Apple> inventory,AppleFormatter appleFormatter) {
		for(Apple apple : inventory) {
			String out = appleFormatter.accept(apple);
			System.out.println(out);
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
	
	class AppleFancyFormatter implements AppleFormatter{
		@Override
		public String accept(Apple apple) {
			return "An apple that is " + apple.getColor() + " and weighs " + apple.getWeight() + " grams.";
		}
	}
	
	class AppleSimpleFormatter implements AppleFormatter{
		@Override
		public String accept(Apple apple) {
			return "apple -> color : " + apple.getColor() + " / weight : " + apple.getWeight();
		}
	}
}
