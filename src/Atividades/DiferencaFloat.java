package Atividades;

import java.util.Scanner;

public class DiferencaFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4,calculo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n Entre com o valor de N1");
		n1 = ler.nextFloat();
		
		System.out.println("\n Entre com o valor de N2");
		n2 = ler.nextFloat();
		
		System.out.println("\n Entre com o valor de N3");
		n3 = ler.nextFloat();
		
		System.out.println("\n Entre com o valor de N4");
		n4 = ler.nextFloat();
		
		calculo = (n1*n2) - (n3*n4);
		
		System.out.println("\n Valor do calculo: "+calculo);
		

	}

}
