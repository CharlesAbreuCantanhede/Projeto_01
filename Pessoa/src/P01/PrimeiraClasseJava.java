package P01;

public class PrimeiraClasseJava {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int nota1 = 10;
		
		int nota2 = 60;
		
		int nota3 = 70;
		
		int nota4 = 80;
		
		int media = 0;
		
		media = (nota1 + nota2 + nota3) / 3;
		
		
		if(media >= 70) {
			System.out.println("Aluno aprovado " + media );
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação " + media );
		} else {
			System.out.println("Aluno reprovado " + media);
		}
	}
}
