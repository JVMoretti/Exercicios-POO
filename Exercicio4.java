package com.edu.iftm.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] Nomes = new String[5];

		for (int i = 0; i < Nomes.length; i++) {
			System.out.println("digite os nome: ");
			Nomes[i] = scanner.nextLine();

		}
		for (int i = Nomes.length - 1; i >= 0; i--) {
			System.out.println(Nomes[i]);
		}

	}

}
