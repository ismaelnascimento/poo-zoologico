package br.edu.principal;

import br.edu.animal.*;

public class Principal {

	public static void main(String[] args) {
		Hippo h1 = new Hippo();
		h1.makeNoise();
		h1.roam();
		h1.setLocation("África na floresta");
		h1.setPicture("🦛");
		System.out.println("Localização: " + h1.getLocation()); 
		System.out.println("Personalização: " + h1.getPicture()); 
		h1.setHunger(true);
		h1.setFood("Folha");
		System.out.println("Fome: " + h1.isHunger()); 
		h1.eat();
		System.out.println("Fome: " + h1.isHunger()); 
		h1.sleep();
		
		Tiger t1 = new Tiger();
		t1.makeNoise();
		t1.roam();
		t1.setLocation("Albânia na floresta");
		t1.setPicture("🐯🐅");
		System.out.println("Localização: " + t1.getLocation()); 
		System.out.println("Personalização: " + t1.getPicture()); 
		t1.setHunger(true);
		t1.setFood("Carne");
		System.out.println("Fome: " + t1.isHunger()); 
		t1.eat();
		System.out.println("Fome: " + t1.isHunger()); 
		t1.sleep();
		
		Wolf w1 = new Wolf();
		w1.makeNoise();
		w1.roam();
		w1.setLocation("Austrália na neve");
		w1.setPicture("🐺");
		System.out.println("Localização: " + w1.getLocation()); 
		System.out.println("Personalização: " + w1.getPicture()); 
		w1.setHunger(true);
		w1.setFood("Fruta");
		System.out.println("Fome: " + w1.isHunger()); 
		w1.eat();
		System.out.println("Fome: " + w1.isHunger()); 
		w1.sleep();
	}

}
