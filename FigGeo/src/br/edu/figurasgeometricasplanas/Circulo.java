package br.edu.figurasgeometricasplanas;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo extends FigPlana {
	Scanner sc = new Scanner(System.in);

	// ATRIBUTOS;
		private double raio;
		
		
		
	// CONSTRUTOR
		
		public Circulo() {
			this.raio = 0.0;
			
		}
		
		
	// MÉTODO PRA ALTERAR ATRIBUTOS
		
		public void setListaAtributos() {
			
			System.out.println("Digite o valor do raio do círculo:\n");
			this.raio = sc.nextDouble();
			
			
			System.out.println("\nValor do raio: " + raio);
			
			
		}
		
	// ÁREA
		
		public void getCalcArea(){
			area = Math.pow(raio, 2) * Math.PI;
			System.out.println("Área do Círculo: "+ new DecimalFormat(".##").format(area));
		}
		
}

