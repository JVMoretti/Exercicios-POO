package com.edu.iftm.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float saldo;
		System.out.println("Digite o valor do seu saldo ");
		saldo = scanner.nextFloat();
		switch ((int) saldo / 1000) {
		case 0:
			System.out.println("Voc� n�o p�de ter nenhum cr�dito especial.");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("Voc� p�de receber 20% cr�dito especial: " + saldo * 0.2);
			break;
		case 4:
		case 5:
			System.out.println("Voc� p�de receber 30% cr�dito especial: " + saldo * 0.3);
			break;

		default:
			System.out.println("Voc� p�de receber 40% cr�dito especial: " + saldo * 0.4);
			break;
		}
		scanner.close();
	}

}
