package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Trapezio extends FigPlana {
	Scanner sc = new Scanner(System.in);

	// ATRIBUTOS;
		private double Bmaior;
		private double Bmenor;
		private double altura;
		
		
	// CONSTRUTOR
		
		public Trapezio() {
			this.Bmaior = 0.0;
			this.Bmenor = 0.0;
			this.altura = 0.0;
			
			
		}
		
	// MÉTODO PRA ALTERAR ATRIBUTOS
		
		public void setlistaAtributos() {
			
			System.out.println("Digite o valor da Base maior do trapézio:\n");
			this.Bmaior = sc.nextDouble();
			
			System.out.println("Digite o valor da Base menor do trapézio:\n");
			this.Bmenor = sc.nextDouble();
			
			System.out.println("Digite o valor da altura do trapézio:\n");
			this.altura = sc.nextDouble();
			
			System.out.println("\nValor da base maior:" + Bmaior);
			System.out.println("Valor da base menor:" + Bmenor);
			System.out.println("Valor da altura:" + altura);
			
		}
		
	// ÁREA
		
		public void getcalcArea(){
			area = (Bmaior + Bmenor)* altura/2;
			System.out.println("Área do Trapézio: "+area);

			
			
}
	
	

}
