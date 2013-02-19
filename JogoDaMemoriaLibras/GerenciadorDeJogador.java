package JogoDaMemoriaLibras;

import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeJogador {

	private List<Jogador> jogadores;
	
	public GerenciadorDeJogador(){
		this.jogadores = new ArrayList<Jogador>();
	}
	
	public void salvarJogador(String nome){
		Jogador jogador = new Jogador(nome);
		this.jogadores.add(jogador);
	}
	public boolean existeJogador(){
		return !this.jogadores.isEmpty();
	}
	
}
