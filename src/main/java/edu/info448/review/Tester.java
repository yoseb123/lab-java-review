package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		// Dog dog = new Dog();
		// dog.bark();
		// dog.walk();
		// Dog[] pups = Dog.createPuppies(3);
		// System.out.println(Arrays.toString(pups));
		// Husky huskyDog = new Husky();
		// huskyDog.bark();
		// huskyDog.pullSled();
		// huskyDog.hug();
		// TeddyBear bear = new TeddyBear();
		// bear.hug();
		// Dog v1 = new Husky();
		// ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		// hugList.add(new Husky()); //a Husky is Huggable
		// hugList.add(new TeddyBear()); //so are Teddybears!

		// //enhanced for loop ("foreach" loop)
		// //read: "for each Huggable in the hugList"
		// for(Huggable thing : hugList) {
		// 	thing.hug();
		// }
		Dog dog = new Dog();
		dog.speak();
	}
}