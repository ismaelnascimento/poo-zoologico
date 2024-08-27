package br.edu.animal;

public class Hippo extends Hippopotamidae {
	@Override
	public void makeNoise() {
		System.out.println("OOOAAaaaaa!");
	}

	@Override
	public void eat() {
		System.out.println("Comendo " + food + "...");
		hunger = false;
	}
}
