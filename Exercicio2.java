package com.edu.iftm.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> P = new ArrayList<Integer>();
		ArrayList<Integer> I = new ArrayList<Integer>();

		while (true) {
			System.out.println("insira um valor");
			int N = scanner.nextInt();
			if (N > 0) {
				if (N % 2 == 0) {
					P.add(N);
				} else {
					I.add(N);
				}
			} else {
				break;
			}
		}
		System.out.println("os numeros pares são " + P);
		System.out.println("tem " + P.size() + " numeros pares");

		System.out.println("os numeros impares são " + I);
		System.out.println("tem " + I.size() + " numeros impares");

	}

}
