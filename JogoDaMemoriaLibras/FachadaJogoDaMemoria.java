package JogoDaMemoriaLibras;

import java.util.List;

public class FachadaJogoDaMemoria {
	
	private static FachadaJogoDaMemoria fachada;
	private GerenciadorDeJogador gerenciaJogador;
	private GerenciadorDeJogo gerenciaJogo;
	
	private FachadaJogoDaMemoria(){
		this.gerenciaJogador = new GerenciadorDeJogador();
		this.gerenciaJogo = new GerenciadorDeJogo();
	}
	
	public static FachadaJogoDaMemoria getInstance(){
		if(fachada == null){
			fachada = new FachadaJogoDaMemoria();
		}
		return fachada;
	}
	public void salvarJogador(String nome){
		this.gerenciaJogador.salvarJogador(nome);
	}
	public boolean existeJogador(){
		return gerenciaJogador.existeJogador();
	}
	public void iniciarJogo(){
		this.gerenciaJogo.iniciarJogo();
	}
	public Carta[][] getTabuleiro(){
		return this.gerenciaJogo.getTabuleiro();
	}
	
	public Carta getCartaTabuleiro(int posisao1, int posisao2){
		return this.gerenciaJogo.getCartaTabuleiro(posisao1, posisao2);	
	}
	
	// Verificar se a carta está virada.
	public boolean estadoDaCarta(Carta carta){
		if(carta.getVirada()){
			return true;
		}else{
			return false;
		}
		
	}
	
	// Virar a carta.
	/*
	 * e passado um lista para o metodo contendo 2 cartas
	 */
	public List<Carta> viraCarta(List<Carta> listaCartas){
		//pega a carta da posicao 1
		Carta carta1 = listaCartas.get(0);
		//pega a carta da posicao 2
		Carta carta2 = listaCartas.get(1);
		//se as cartas tiverem o codigo igual entra no if
		if(carta1.getCodigo() == carta2.getCodigo()){
			//vira as duas cartas
			carta1.setVirada(true);
			carta2.setVirada(true);
			// cooca novamente na lista
			listaCartas.set(0, carta1);
			listaCartas.set(1, carta2);
		}else{
			//caso nao sega igual
			// desvira as duas cartas
			carta1.setVirada(false);
			carta2.setVirada(false);
			// coloca novamente na lista
			listaCartas.set(0, carta1);
			listaCartas.set(1, carta2);
		}
		//retorna a lista
		return listaCartas;
	}
	
	// Ranking
	
	
	
	
	
	
}
