package com.edu.iftm.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float Vn, Vt;
		System.out.println("insira o valor ");
		Vn = scanner.nextFloat();
		Vt = Vn * 1.73f;
		System.out.println("O valor com os impostos é " + Vt);
	}

}
