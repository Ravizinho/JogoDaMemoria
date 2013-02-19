package JogoDaMemoriaLibras;

public class Jogador {

	private String nome;
	private int numeroDeJogadas;
	
	/**
	 * Construtor default
	 */
	public Jogador(){	}
	/**
	 * Construtor que tem como par�metros um nome e um n�mero de jogadas
	 * @param nome
	 * @param numJogadas
	 */
	public Jogador(String nome){
		this.nome = nome;
		this.numeroDeJogadas = 0;
	}
	/**
	 * M�todo que altera o nome do jogador e recebe como par�metro um novo nome
	 * @param novoNome
	 */
	public void setJogador(String novoNome){
		this.nome = novoNome;
	}
	/**
	 * m�todo que retorna o nome do jogador
	 * @return retorna um nome do tipo String
	 */
	public String getNome(){
		return this.nome;
	}
	/**
	 * m�todo que reseta o numero de jogadas de um jogador
	 */
	public void resetaNumeroDeJogadas(){
		this.numeroDeJogadas = 0;
	}
	/**
	 * m�todo que retorna o n�mero de jogadas
	 * @return numeroDeJogadas
	 */
	public int getNumeroDeJogadas(){
		return this.numeroDeJogadas;
	}
	/**
	 * m�todo que armazena o n�mero de jogadas, recebe como par�metro o n�mero de jogadas
	 * @param numeroDeJogadas
	 */
	public void setArmazenaNumeroDeJogadas(int numeroDeJogadas){
		this.numeroDeJogadas += numeroDeJogadas;
	}
	
	
}
