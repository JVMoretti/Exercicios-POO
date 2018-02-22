package com.edu.iftm.exercicios;

import java.util.Scanner;
import java.util.Vector;

public class Exercicio9 {

	public class dados {
		public String Nm;
		public byte Id;
		public float Ps;
	}

	public static void main(String[] args) {

		Exercicio9 ex9 = new Exercicio9();
		Scanner scan = new Scanner(System.in);
		String txtNome;
		Vector<dados> pessoas = new Vector<dados>();
		dados txtAtual = null;

		System.out.println("Insira nome, Idade e Peso ou finalize digitando 'fim'");

		while (true) {

			System.out.println("Insira o Nome: ");
			txtNome = scan.nextLine();
			if (txtNome.equals("fim"))
				break;
			txtAtual = ex9.new dados();
			txtAtual.Nm = txtNome;
			System.out.println("Insira a Idade: ");
			txtAtual.Id = Byte.parseByte(scan.nextLine());
			System.out.println("Insira o Peso : ");
			txtAtual.Ps = Float.parseFloat(scan.nextLine());
			pessoas.add(txtAtual);
		}
		scan.close();

		for (dados pessoa : pessoas) {
			System.out.println("Nm: " + pessoa.Nm);
			System.out.println("Id: " + pessoa.Id);
			System.out.println("Ps: " + pessoa.Ps);
		}
	}
}