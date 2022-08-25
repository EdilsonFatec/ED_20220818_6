package view;
import javax.swing.JOptionPane;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int qtde;
		double soma=0;

		Controller somat = new Controller();
		do {
			qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde = "));
		}
		while (qtde < 1 || qtde > 10);

		soma =  somat.Somatorio(qtde);
	    
		System.out.println("A soma é "+soma);
	}

}