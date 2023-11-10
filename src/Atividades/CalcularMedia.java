package Atividades;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com a primeira nota: ");
		nota1 =leia.nextFloat();
		
		System.out.println("\n Entre com a Segunda nota: ");
		nota2 =leia.nextFloat();
		
		System.out.println("\n Entre com a Terceira nota: ");
		nota3 =leia.nextFloat();
		
		System.out.println("\n Entre com a Quarta nota: ");
		nota4 =leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("\nMedia Final: " +media);
		
	}

}
