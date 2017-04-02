package br.com.domino.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Actions {

	public List<Pecas> embaralhaPedrasDomino() {

		List<Pecas> pecas = new ArrayList<Pecas>();

		Pecas p0 = new Pecas(0, 0);
		Pecas p1 = new Pecas(0, 1);
		Pecas p2 = new Pecas(0, 2);
		Pecas p3 = new Pecas(0, 3);
		Pecas p4 = new Pecas(0, 4);
		Pecas p5 = new Pecas(0, 5);
		Pecas p6 = new Pecas(0, 6);
		Pecas p11 = new Pecas(1, 1);
		Pecas p12 = new Pecas(1, 2);
		Pecas p13 = new Pecas(1, 3);
		Pecas p14 = new Pecas(1, 4);
		Pecas p15 = new Pecas(1, 5);
		Pecas p17 = new Pecas(1, 7);
		Pecas p22 = new Pecas(2, 2);
		Pecas p23 = new Pecas(2, 3);
		Pecas p24 = new Pecas(2, 4);
		Pecas p25 = new Pecas(2, 5);
		Pecas p26 = new Pecas(2, 6);
		Pecas p33 = new Pecas(3, 3);
		Pecas p34 = new Pecas(3, 4);
		Pecas p35 = new Pecas(3, 5);
		Pecas p36 = new Pecas(3, 6);
		Pecas p44 = new Pecas(4, 4);
		Pecas p45 = new Pecas(4, 5);
		Pecas p46 = new Pecas(4, 6);
		Pecas p55 = new Pecas(5, 5);
		Pecas p56 = new Pecas(5, 6);
		Pecas p66 = new Pecas(6, 6);

		pecas.add(p0);
		pecas.add(p1);
		pecas.add(p2);
		pecas.add(p3);
		pecas.add(p4);
		pecas.add(p5);
		pecas.add(p6);
		pecas.add(p11);
		pecas.add(p12);
		pecas.add(p13);
		pecas.add(p14);
		pecas.add(p15);
		pecas.add(p17);
		pecas.add(p22);
		pecas.add(p23);
		pecas.add(p24);
		pecas.add(p25);
		pecas.add(p26);
		pecas.add(p33);
		pecas.add(p34);
		pecas.add(p35);
		pecas.add(p36);
		pecas.add(p44);
		pecas.add(p45);
		pecas.add(p46);
		pecas.add(p55);
		pecas.add(p56);
		pecas.add(p66);

		Collections.shuffle(pecas);
		return pecas;
	}

	ArrayList<Pecas> humano, maquina;

	public boolean jogaprimeiro(ArrayList<Pecas> humano, ArrayList<Pecas> maquina) {

		int somaladosmaquina;
		int somaladoshumano = 0;
		int maiorHumano = 0;
		int maiorMaquina = 0;
		this.humano = humano;
		this.maquina = maquina;

		// busca Maior Humano

		for (Pecas x : humano) {
			somaladoshumano = x.getLadoDireito() + x.getLadoEsquerdo();
			if (somaladoshumano > maiorHumano) {
				maiorHumano = somaladoshumano;
				somaladoshumano = 0;
			}
		}

		// busca Maior Maquina
		for (Pecas x : maquina) {
			somaladosmaquina = x.getLadoDireito() + x.getLadoEsquerdo();
			if (somaladosmaquina > maiorHumano) {
				maiorMaquina = somaladosmaquina;
				somaladosmaquina = 0;
			}
		}

		// retorna verdadeiro se maior for humano falso se maquina for maior
		if (maiorHumano > maiorMaquina) {

			return true;
		} else {
			return false;
		}

	}
}
