package controller;

public class Controller {

	public Controller() {
		super();
	}
	public double Somatorio(int qtde) {
		double soma=0;
		double variavel;
// Ponto de parada definido como qtde = 1
		if  (qtde==1) {
			return 1;
		}
		else {
		variavel = qtde;
		soma = (1.0 / Fatorial(qtde)) + Somatorio(qtde - 1);
		}
	 return soma;
	}
	public double Fatorial(int qtde) {
		double soma=0;
// Ponto de parada definido como qtde = 1
		if  (qtde==1) {
			return 1;
		}
		else {
		soma = soma + (qtde * Fatorial(qtde - 1));
		}
	 return soma;
	}
}