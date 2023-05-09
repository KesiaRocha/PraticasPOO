package br.edu.FigPlanas;

public class Triangulo extends FigPlanas {
	
	//atributos
	public double base;
	public double altura;

	//construtor
	public Triangulo(){
	base = 0;
	altura = 0;
	}

	//metodos
	public void calcArea(){
	Area = (base*altura)/2;	
	System.out.println(Area);
			}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void getcalcArea(){ 
		Area = (base*altura)/2;	
		System.out.println(Area);
	}
	}


