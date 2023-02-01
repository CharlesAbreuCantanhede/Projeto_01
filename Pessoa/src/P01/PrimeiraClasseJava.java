package P01;

public class PrimeiraClasseJava {
	
	/*Variável Global é acessível a todos e o seu valor é compartilhado*/
	
	static int maiorIdadeGlobal = 30;
   
	/*Variável local porque pertence somente a esse método */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Variável local porque pertence somente a esse método*/
		int maiorIdade = 18;
		System.out.println("Valor varíavel local = " + maiorIdade );
		System.out.println("Valor varíavel local  Global = " + maiorIdadeGlobal );
		  metodo2();

	}
	
	public static void metodo2() {
	 @SuppressWarnings("unused")
	int mediaAno = 50;
		System.out.println("Valor da varíavel Global= " + maiorIdadeGlobal);
	}

}
