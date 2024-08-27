package br.edu.animal;

public class Wolf extends Canine {
	@Override
	public void makeNoise() {
		System.out.println("AUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU baby a !");
	}

	@Override
	public void eat() {
		System.out.println("Comendo " + food + "...");
		hunger = false;
	}
}
