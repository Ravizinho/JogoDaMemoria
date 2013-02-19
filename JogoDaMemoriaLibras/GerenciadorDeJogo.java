package JogoDaMemoriaLibras;

import java.util.Random;

public class GerenciadorDeJogo {

	private Tabuleiro tabuleiro = new Tabuleiro();

	public void iniciarJogo() {
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				
				//pega a carta com o codigo
				Carta carta = cartaRandom();
				//mostra a posicao do tabuleiro e o codigo da carta
				System.out.println("i: "+i+" j: "+j+" = " +carta.getCodigo());
				//seta a carta na posicao do tabuleiro
				tabuleiro.setTabuleiro(i, j, carta);
				//pega o a carta na posicao passada
				//System.out.println(tabuleiro.getCartaTabuleiro(i, j).getCodigo());
			}
		}
	}

	public Carta cartaRandom() {
		int random = numeroAleatorio();
		return new Carta(10, false, random);
	}

	private int numeroAleatorio() {
		Random randomico = new Random();
		int random = randomico.nextInt(6);
		if (verificarNumero(random)) {
			return random;
		} else {
			
			return numeroAleatorio();
			
		}
	}
	private boolean verificarNumero(int random) {
		int mod = 0;
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				try {
					if (tabuleiro.getCartaTabuleiro(i, j).getCodigo() == random) {
						mod++;
					}
				} catch (Exception e) {
				}
			}
		}

		if (mod <=1 ) {
			return true;
		} else {
			return false;
		}
	}

	public Carta[][] getTabuleiro() {
		return tabuleiro.getTabuleiro();
	}

	public Carta getCartaTabuleiro(int posisao1, int posisao2){
		return tabuleiro.getCartaTabuleiro(posisao1, posisao2);
	}
	
}

