package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valores[] = new int [6];
		int somaImpares = 0;
		
		System.out.println("-----------------------------");
		System.out.println("  DIGITE 6 NÚMEROS INTEIROS");
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.print("Digite o primeiro número: ");
		valores[0] = teclado.nextInt();
		System.out.println();
		
		System.out.print("Digite o segundo número: ");
		valores[1] = teclado.nextInt();
		System.out.println();
		
		System.out.print("Digite o terceiro número: ");
		valores[2] = teclado.nextInt();
		System.out.println();
		
		System.out.print("Digite o quarto número: ");
		valores[3] = teclado.nextInt();
		System.out.println();
		
		System.out.print("Digite o quinto número: ");
		valores[4] = teclado.nextInt();
		System.out.println();
		
		System.out.print("Digite o sexto número: ");
		valores[5] = teclado.nextInt();
		System.out.println();
		

	        for (int i = 0; i < valores.length; i++) {
	            if (valores[i] % 2 == 1) {
	                somaImpares += valores[i];
	            }
	        }

	        System.out.println("A soma dos números ímpares é: " + somaImpares);
	}

}
