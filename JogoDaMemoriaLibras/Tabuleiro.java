package JogoDaMemoriaLibras;

public class Tabuleiro {

	private Carta tabuleiro[][];
	
	
	public Tabuleiro(){
		this.tabuleiro = new Carta[3][4];
	}
	public Carta[][] getTabuleiro(){
		return this.tabuleiro;
	}
	public void setTabuleiro(int posicao1, int posicao2, Carta carta){
		tabuleiro[posicao1][posicao2] = carta;
	}
	
	public Carta getCartaTabuleiro(int posisao1, int posisao2){
		return tabuleiro[posisao1][posisao2];
		
	}
	
	/*
	 private Carta tabuleiro [][];
	
	
	public Tabuleiro(){
		this.tabuleiro = new Carta[3][4];
	}
	public Carta[][] getTabuleiro(){
		return this.tabuleiro;
	}
	public void setTabuleiro(Carta[][] tabuleiro){
		this.tabuleiro = tabuleiro;
	}
	
	public Carta getCartaTabuleiro(int posisao1, int posisao2){
		Carta carta = tabuleiro[posisao1][posisao2];
		return carta;
	}
	 */
		
}
