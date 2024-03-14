package br.com.fiap;

import java.util.Scanner;

public class UsaCalculadora {

	public static void main(String[] args) {
		// instanciando classes
		Scanner scan = new Scanner(System.in);
		Calculadora calculos = new Calculadora();
		
		// criando variáveis
		int num1, num2, opcao;
		
		// programa principal
		try {
			System.out.println("Menu de opções");
			System.out.println("\n 1 - Adição; \n 2 - Subtração;"
					+ "\n 3 - Multiplicação; \n 4 - Divisão;");
			
			System.out.println("Escolha uma opção");
			opcao = scan.nextInt();
			
			if (opcao == 1){
				// adição
				System.out.println("Digite o primeiro número");
				num1 = scan.nextInt();
				
				System.out.println("Digite o segundo número");
				num2 = scan.nextInt();
				
				calculos.soma(num1, num2);
			}
			else if (opcao == 2) {
				//subtração
				System.out.println("Digite o primeiro número");
				num1 = scan.nextInt();
				
				System.out.println("Digite o segundo número");
				num2 = scan.nextInt();
				
				calculos.subtracao(num1, num2);
			}
			else if (opcao == 3) {
				// multiplicação
				System.out.println("Digite o primeiro número");
				num1 = scan.nextInt();
				
				System.out.println("Digite o segundo número");
				num2 = scan.nextInt();
				
				calculos.multiplicacao(num1, num2);
			}
			else if (opcao == 4) {
				// divisão
				System.out.println("Digite o primeiro número");
				num1 = scan.nextInt();
				
				System.out.println("Digite o segundo número");
				num2 = scan.nextInt();
				
				calculos.divisao(num1, num2);
				
			}
			else {
				throw new Exception("Opção inválida! Tente novamente.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
