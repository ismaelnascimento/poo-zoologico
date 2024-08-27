package br.edu.animal;

public class Lion extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("AAUUUUUUUUUUUUUUUU!");
	}
	@Override
	public void eat() {
		System.out.println("Comendo " + food + "...");
		hunger = false;
	}
}
