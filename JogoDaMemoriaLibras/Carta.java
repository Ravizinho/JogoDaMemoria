package JogoDaMemoriaLibras;


public class Carta {

	private int imagens;
	private boolean virada;
	private int codigo;
	private int x,y;
	
	public Carta(){
		this(0,false,0);
	}
	
	public Carta(int imagens, boolean virada, int id){
		this.imagens = imagens;
		this.virada = virada;
		this.codigo = id;
	}

	public int getImagens() {
		return imagens;
	}

	public void setImagens(int imagens) {
		this.imagens = imagens;
	}

	public boolean getVirada() {
		return virada;
	}

	public void setVirada(boolean virada) {
		this.virada = virada;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int id) {
		this.codigo = id;
	}
	public void setPosicao(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}
