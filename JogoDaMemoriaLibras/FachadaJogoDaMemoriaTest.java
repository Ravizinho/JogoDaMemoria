package JogoDaMemoriaLibras;

public class FachadaJogoDaMemoriaTest {
	static FachadaJogoDaMemoria fachada = FachadaJogoDaMemoria.getInstance();

	public static void main(String[] args) {
		testInicializarJogoCampoVazio();
		
	}
	//@Test
	public static void testGravarJogador() {
		//assertFalse(fachada.existeJogador());
		System.out.println(fachada.existeJogador());
		fachada.salvarJogador("nome");
		//assertTrue(fachada.existeJogador());
		System.out.println(fachada.existeJogador());
	}
	
	//@Test
	public static void testInicializarJogoCampoVazio(){
		
		fachada.salvarJogador("nome");
		//assertTrue(fachada.existeJogador());
		System.out.println("jogador criado: "+fachada.existeJogador());
		fachada.iniciarJogo();
		System.out.println("jogo iniciado");
		//For que vai percorrer todo o tabuleiro
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				//pega a carta do tabuleiro na posicao passada
				Carta carta = fachada.getCartaTabuleiro(i,j);
				//mostra o valor do codigo da carta
				System.out.println(carta.getCodigo());
				//esta verificao deve estar com erro
				/*if(fachada.getCartaTabuleiro(i,j) == null){
					System.out.println("Campo: " + i  + " " + j);
					//fail("Campo: " + i  + " " + j + "vazio");
				}*/
			}
		}
		
	}
	//@Test
	public static void testInicializarJogoCartaRepetida(){
		fachada.salvarJogador("berg");
		fachada.existeJogador();
		//fachada.iniciarJogo();
		
		int[] list = new int[6];
		int cont = 0;
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				int codigo = fachada.getCartaTabuleiro(i,j).getCodigo();
				list[codigo] = list[codigo] + 1;
			}
		}
		for(int i = 0 ; i < list.length ; i++){
			if(list[i] > 2){
				//fail("ha cartas repetidas");
			}
		}
		
	}
	
	
	
}
