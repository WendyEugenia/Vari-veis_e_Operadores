package Atividades;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o Salário Bruto: ");
		salarioBruto =leia.nextFloat();
		
		System.out.println("\n Digite o adicionalNoturno: ");
		adicionalNoturno =leia.nextFloat();
		
		System.out.println("\n Digite as Horas Extras: ");
		horasExtras =leia.nextFloat();
		
		System.out.println("\n Digite os Descontos: ");
		descontos =leia.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5)-descontos;
		
		
		System.out.println("\n Seu Salário liquido é: "+salarioLiquido);
	
		

	}

}