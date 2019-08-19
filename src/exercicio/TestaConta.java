package exercicio;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		conta.setNumeroConta(entrada.nextInt());
		
		System.out.println("Enter account holder: ");
		conta.setTitular(entrada.next());
		
		System.out.println("is there na inicial deposite (y/n) ");
		String d = entrada.next();
		char x = d.charAt(0);
		
		while(x == 'y' ) {
			System.out.println("Enter initial deposit value: ");
			int value = entrada.nextInt();
			conta.depositar(value);
			
			System.out.println("Account data: ");
			System.out.println(conta.toString());
			
			System.out.println("Enter a deposit value: ");
			value = entrada.nextInt();
			conta.depositar(value);
			
			System.out.println("Update account data: ");
			System.out.println(conta.toString());
			
			System.out.println("Enter a withdraw value: ");
			value = entrada.nextInt();
			conta.sacar(value);
			
			System.out.println("Update account data: ");
			System.out.println(conta.toString());
			
			break;
		}
		
		System.out.println("End process");
		entrada.close();
	}
}
