package P01;

public class PrimeiraClasseJava {
	
	/*Variável Global é acessível a todos*/
	
	static int maiorIdadeGlobal = 30;
   
	/*Variável local porque pertence somente a esse método */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Variável local porque pertence somente a esse método*/
		int maiorIdade = 18;
		System.out.println("Valor varíavel local = " + maiorIdade );
		
		  metodo2();

	}
	
	public static void metodo2() {
		System.out.println("Valor da varíavel Global= " + maiorIdadeGlobal);
	}

}
