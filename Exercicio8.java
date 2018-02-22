package com.edu.iftm.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> Fr = new ArrayList<String>();
		String N;

		while (true) {
			System.out.println("escreva os nomes das frutas ou digite 'zero' para parar o programa");
			N = scanner.nextLine();

			if (N.equals("zero")) {
				break;
			} else {
				Fr.add(N);
			}
		}

		System.out.println("Frutas escritas: " + Fr);
		scanner.close();
	}

}
