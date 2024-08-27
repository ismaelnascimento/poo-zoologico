package br.edu.animal;

public class Tiger extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("WOOUUUUUWUUUUUU WOUUUU!");
	}
	@Override
	public void eat() {
		System.out.println("Comendo " + food + "...");
		hunger = false;
	}
}