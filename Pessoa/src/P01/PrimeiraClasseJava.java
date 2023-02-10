package P01;

import javax.swing.JOptionPane;

;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
	
	 String nota = JOptionPane.showInputDialog("Informe a nota 1 ");
     
     String nota2 = JOptionPane.showInputDialog("Informe a note 2 ");
	 
	 
	 double dNota1 = Double.parseDouble(nota);
		
	 double dNota2 = Double.parseDouble(nota2);
	 
	 double media = (dNota1 + dNota2 )/2;
	 
	 if (media >= 50) {
		
		 if(media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno está aprovado com média :" + media); 
		 }
	
	 }else {
		 JOptionPane.showMessageDialog(null, " Aluno está reprovado com média :" + media );
	 }
	 
	 
	}
}
