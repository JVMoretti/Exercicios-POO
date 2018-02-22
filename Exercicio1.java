package com.edu.iftm.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float h, b, B;

		System.out.println("Insira a altura.");
		h = scanner.nextFloat();

		System.out.println("insira a base menor");
		b = scanner.nextFloat();

		System.out.println("insira a base maior");
		B = scanner.nextFloat();

		float resultado = (h * (b + B)) / 2;

		System.out.println("o resultado " + resultado);
	}

}
