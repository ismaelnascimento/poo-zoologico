package br.edu.animal;

public class Dog extends Canine {
	@Override
	public void makeNoise() {
		System.out.println("AU AU!");
	}

	@Override
	public void eat() {
		System.out.println("Comendo " + food + "...");
		hunger = false;
	}
}
