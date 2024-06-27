package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		int numero = entrada.nextInt();
		System.out.print("Insira o nome do titular da conta: ");
		entrada.nextLine();
		String titular = entrada.nextLine();
		System.out.print("Você deseja depositar algum valor inicial s/n?");
		char resposta = entrada.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Insira o valor de depósito inicial: R$");
			double depositoInicial = entrada.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira o valor do depósito: ");
		double valorDeposito = entrada.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Atualização da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira o valor do saque: ");
		double valorSaque = entrada.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Atualização da conta: ");
		System.out.println(conta);
		
		
		
		
		
		
		
		entrada.close();

	}

}
