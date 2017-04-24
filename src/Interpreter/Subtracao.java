package Interpreter;

public class Subtracao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Subtracao(Expressao direita, Expressao esquerda) {
		this.direita = direita;
		this.esquerda = esquerda;

	}

	@Override
	public int avalia() {

		int valorDireita = direita.avalia();
		int valorEsquerda = esquerda.avalia();

		return valorEsquerda - valorDireita;
	}

}
