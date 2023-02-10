package P01;

import javax.swing.JOptionPane;

;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
	
		
		String carros = JOptionPane.showInputDialog(" Informe a quantidade de carros? ");
		
		String pessoas = JOptionPane.showInputDialog(" Informe a quantidade de pessoas? ");;
		
		
		double carrosNumero = Double.parseDouble(carros);
		
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosNumero / pessoasNumero);
		
		double resto = carrosNumero % pessoasNumero ;
		
	int resposta =	JOptionPane.showConfirmDialog(null, " Deseja ver o  resultado da divisão?");
		
	if(resposta == 0 ) {
		JOptionPane.showMessageDialog(null, " Dívisão para pessoas deu " + divisao);
	}else {
		JOptionPane.showInputDialog("Não quiser ver resultado !");
	}
	
	resposta = JOptionPane.showConfirmDialog(null, " Deseja ver a o RESTO da divisão ");
	
	 if(resposta == 0) {
		 JOptionPane.showConfirmDialog(null, "Resto da devisão é " + resto);
	 }else {
		 JOptionPane.showConfirmDialog(null, " Não quiser ver resultado! ");
	 }
		
	}
}
