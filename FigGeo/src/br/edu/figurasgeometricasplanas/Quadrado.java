package br.edu.figurasgeometricasplanas;

public class Quadrado extends FigPlana {

	private double lado;
	
		public Quadrado( ){  
			this.lado = 0.0;	
		}
		
		public void setListaAtributos() {
			System.out.println("Digite o valor do lado: ");	
			
			System.out.println("\nValor do lado: " + lado);

		}
		
		
		public void getCalcArea() {
			area = (lado * lado);
			System.out.println("O valor da área é: " + area);
			System.out.println(" ");
		}
	
	}	
	
	
	
	
	

