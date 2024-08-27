package br.edu.animal;

public class Cat extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("Miau miauuu!");
	}
	@Override
	public void eat() {
		System.out.println("Comendo " + food + "...");
		hunger = false;
	}
}