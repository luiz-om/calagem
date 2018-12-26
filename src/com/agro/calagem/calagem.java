package com.agro.calagem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calagem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		double somaBases = 0;
		double ctcph7 = 0, ctce = 0;
		double necessidadeCalagem = 0;
		double cem = 100;
		double v1 = 0, v2 = 0;
		DecimalFormat saida = new DecimalFormat("0.00");
		

		do {

			System.out.println("Digite um numero: ");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Digite os valores dos nutrientes conforme a analise!");
				System.out.println("Valor de Ca: ");
				double ca = scan.nextDouble();
				System.out.println("Valor de Mg: ");
				double mg = scan.nextDouble();
				System.out.println("Valor de k: ");
				double k = scan.nextDouble();

				System.out.println("Valor de al: ");
				double al = scan.nextDouble();
				System.out.println("Valor de (Al + H): ");
				double alh = scan.nextDouble();

				somaBases = mg + ca + k;
				ctce = somaBases + al;
				ctcph7 = somaBases + alh;
				v1 = (somaBases * cem) / ctcph7;
				System.out.println(necessidadeCalagem);
				break;

			case 2:
				System.out.println("informe o V% exigido pela cultura: ");
				v2 = scan.nextDouble();
				break;

			case 3:
				necessidadeCalagem = (((v2 - v1) / cem) * ctcph7 * (cem / 80));

				System.out.println("Soma de bases é: " + somaBases);

				System.out.println("Ctc efetiva é: " + ctce);

				System.out.println("Ctc ph7 é: " + ctcph7);
				System.out.println(necessidadeCalagem);
				if (v1 <= v2) {
					System.out.println("valor v1= " + v1);
					System.out.println(
							"jogar  " + necessidadeCalagem + "kg/ha, ");
					System.out.println(saida.format(necessidadeCalagem));
				} else {
					
					System.out.println("Não há necessidade de fazer calagem pois o v% do solo é maior que o do solo.");
				}
				break;

			default:
				System.out.println("opção invalida");
				break;
			}
		} while (opcao != 0);

	}

}
