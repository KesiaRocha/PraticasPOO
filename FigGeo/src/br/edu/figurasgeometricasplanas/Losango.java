package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Losango extends FigPlana {
	Scanner sc = new Scanner(System.in);

	// ATRIBUTOS;
		private double Dmaior;
		private double Dmenor;
		
		
		
	// CONSTRUTOR
		
		public Losango() {
			this.Dmaior = 0.0;
			this.Dmenor = 0.0;
			
			
		}
		
	// MÉTODO PRA ALTERAR ATRIBUTOS
		
		public void setListaAtributos() {
			
			System.out.println("Digite o valor da diagonal maior do losango:\n");
			this.Dmaior = sc.nextDouble();
			
			System.out.println("Digite o valor da diagonal menor do losango:\n");
			this.Dmenor = sc.nextDouble();
			
			System.out.println("\nValor da diagonal maior:" + Dmaior);
			System.out.println("Valor da diagonal menor:" + Dmenor);
			
		
		}	
	// ÁREA
		
		public void getCalcArea(){
			area = (Dmaior * Dmenor)/2;
			System.out.println("Área do Losango: "+area);
		}
		}


			


