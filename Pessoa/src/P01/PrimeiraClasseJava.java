package P01;

import javax.swing.JOptionPane;

;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carrosNumero = Double.parseDouble(carros);
		
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosNumero / pessoasNumero);
		
		double resto = carrosNumero % pessoasNumero;
		
		JOptionPane.showConfirmDialog(null, "Divisão para pessoas deu " + divisao + " Carro e sobrou " + resto + " fico ");
	}
}
