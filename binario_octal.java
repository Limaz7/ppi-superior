package trabalho;

import java.util.Scanner;

public class binario_octal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número binário: ");
		String binario = scanner.nextLine();

		boolean entradaValida = true;

		// Verifica se é por 0 e 1
		int i = 0;
		while (i < binario.length()) {
			char c = binario.charAt(i);
			if (c != '0' && c != '1') {
				entradaValida = false;
				break;
			}
			i++;
		}

		if (!entradaValida) {
			System.out.println("Entrada inválida! Digite apenas 0 e 1.");
		} else {
			 // Converter binário para decimal
			 int decimal = 0;
	            int potencia = 1;
	            int indice = binario.length() - 1;
	            
	            while (indice >= 0) {
	                char digito = binario.charAt(indice);
	                if (digito == '1') {
	                    decimal += potencia;
	                }
	                potencia *= 2;
	                indice--;
	            }

	            //  Converter decimal para octal
	            String octal = "";
	            if (decimal == 0) {
	                octal = "0";
	            } else {
	                while (decimal > 0) {
	                    int resto = decimal % 8;
	                    octal = resto + octal;
	                    decimal /= 8;
	                }
	            }

	            System.out.println("O número em octal é: " + octal);
	        }
		
	}
}
