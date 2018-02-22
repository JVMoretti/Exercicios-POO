package com.edu.iftm.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] Nomes = new String[3];
		int[] Idades = new int[3];

		for (int i = 0; i < Nomes.length; i++) {
			System.out.println("digite os nomes");
			Nomes[i] = scanner.next();
			System.out.println("digite as idades");
			Idades[i] = scanner.nextInt();
		}
		int maisnovo = 0, maisvelho = 0;
		for (int i = 1; i < Nomes.length; i++) {
			if (Idades[i] < Idades[maisnovo]) {
				maisnovo = i;
			} else if (Idades[i] > Idades[maisvelho]) {
				maisvelho = i;
			}
		}
		System.out.println("O mais velho é " + Nomes[maisvelho]);
		System.out.println("O mais novo é " + Nomes[maisnovo]);
	}

}
