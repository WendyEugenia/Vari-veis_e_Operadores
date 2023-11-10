package Atividades;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o Sálario: ");
		salario = leia.nextFloat();
		System.out.println("\n Digite o Abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario +abono;
		
		System.out.println("\n O seu Novo Sálario é: " +novoSalario);
		System.out.println("\n FIM");
		
	
		
		
	}

}
