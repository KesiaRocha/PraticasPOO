package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Triangulo extends FigPlana {
	
	Scanner sc = new Scanner (System.in);

	private double base;  // encapsulei atributos
	private double altura;
	

	//construtor
	public Triangulo( ){
		base  = 0.0;
		altura = 0.0;
	}
	
	public void getListaAtributos() {
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();	
		}
	
	public void setListaAtributos() {
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();	
		}
	
	public void getCalcArea(){
		area = (base*altura)/2;	
		System.out.println("Área do triângulo:" + area);
		}

}
