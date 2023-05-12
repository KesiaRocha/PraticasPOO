package br.edu.figurasgeometricasplanas;

public class Principal {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		c1.setListaAtributos();
		c1.getCalcArea();
		
		System.out.println("========================");
		
		
		Quadrado q1 = new Quadrado();
		q1.setListaAtributos();
		q1.getCalcArea();
		
		System.out.println("========================");

		
		Losango l1 = new Losango();
		l1.setListaAtributos();
		l1.getCalcArea();
		
		System.out.println("========================");

		
		Paralelogramo p1 = new Paralelogramo();
		p1.setListaAtributos();
		p1.getCalcArea();
		
		System.out.println("========================");

		
		Trapezio t1 = new Trapezio();
		t1.setlistaAtributos();
		t1.getcalcArea();
		
		System.out.println("========================");

		
		Triangulo tr1 = new Triangulo();
		tr1.setListaAtributos();
		tr1.getCalcArea();
		
		System.out.println("========================");

		
		Retangulo r1 = new Retangulo();
		r1.setListaAtributos();
		r1.getCalcArea();
		
		System.out.println("========================");

		
	}

}
