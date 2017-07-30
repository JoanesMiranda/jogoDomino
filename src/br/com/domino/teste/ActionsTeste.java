package br.com.domino.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.domino.model.Actions;
import br.com.domino.model.Pecas;

public class ActionsTeste {

	Actions action;
	Pecas pecas;
	Pecas pecaTeste;
	ArrayList<Pecas> arrayH;
	ArrayList<Pecas> arrayM; 
	ArrayList<Pecas> tabuleiro; 
	
	@Before
	public void setUp() throws Exception {
		
		action = Actions.getInstance();
		
		pecas = new Pecas(4,3);
		pecaTeste = new Pecas(4,2);
		
		arrayH = new ArrayList<Pecas>();
		arrayH.add(pecas);
		
		arrayM = new ArrayList<Pecas>();
		//arrayM.add(pecas);
		
		tabuleiro = new ArrayList<Pecas>();
		tabuleiro.add(pecas);		
		
	}

	/* teste 7
	 Se o array humano estiver vazio return 1
	 */
	@Test
	public void testVerificaVencedorHumano() {
		assertEquals(1, action.VerificaVencedor(arrayH, arrayM));
	}
	
	/* teste 8
	 	Se o array Maquina estiver vazio return 0
	 */
	@Test
	public void testVerificaVencedorMaquina() {
		assertEquals(0, action.VerificaVencedor(arrayH, arrayM));
	}
	
	/* teste 9
	  se o lado esquerdo  ==  ao lado esquerdo return 1
	  se o lado direito == ao lado esquerdo return 2 
	*/
	@Test
	public void testVerificaLadosPedraEsquerda() {
		assertEquals(1, action.verificaLadosPedraEsquerda(tabuleiro, pecaTeste));
	}
	
}
