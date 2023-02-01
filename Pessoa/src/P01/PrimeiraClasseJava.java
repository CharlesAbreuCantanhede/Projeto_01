package P01;

import java.util.Scanner;

public class PrimeiraClasseJava {

	@SuppressWarnings({ "unused", "unlikely-arg-type" })
	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			// Cria um objeto Account e o atribui a myAccount
			PrimeiraClasseJava myAccount = new PrimeiraClasseJava();

			// exibe o valor inicial do nome (null)
			System.out.printf("Initial name is: %s%n%n", myAccount.getClass());

			// solicita e lê o nome
			System.out.println("Please enter the name:");
			String theName = input.nextLine();// lê uma linha de texto
			myAccount.equals(theName);// insere theName em myAccount
			System.out.println(); // gera saida de uma linha em branco
			
			//exibe o nome armazenado no objeto myAccount 
			System.out.printf("Name in object myAccount is:%n%sn", myAccount.getClass());
		}

	}//fim da classe AccountTest
}
