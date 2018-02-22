package com.edu.iftm.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final float VH = 10.25f;
		int H;

		System.out.println("Insira as horas trabalhadas");
		H = scanner.nextInt();

		System.out.println("O valor a se pgar é " + (H * VH));

	}

}
