package br.com.fiap;

public class Calculadora {
	// variáveis 
	private int num1;
	private int num2;
	
	// getters e setters
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		try {
			if (num2 >= 0) {
				this.num2 = num2;
			}
			else {
				throw new Exception("Não é permitido o segundo número ser menor que 0!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// metódos
	public void soma(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
		
		int soma = num1 + num2;
		
		System.out.println("A soma entre esses números é de " + soma);
	}
	
	public void subtracao(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
		
		int subtracao = num1 - num2;
		
		System.out.println("A subtração entre esses números é de " + subtracao);
	}
	
	public void multiplicacao(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
		
		int multiplicacao = num1 * num2;
		
		System.out.println("A multiplicação entre esses números é de " + multiplicacao);
	}
	
	public void divisao(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
		
		int divisao = num1 / num2;
		
		System.out.println("A divisão entre esses números é de " + divisao);
	}
}
