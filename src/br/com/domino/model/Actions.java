package br.com.domino.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Actions {

	public List<Integer> geraNumerosAleatorios() {

		List<Integer> numeros = new ArrayList<Integer>();

		numeros.add(0);
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);
		numeros.add(14);
		numeros.add(15);
		numeros.add(17);
		numeros.add(22);
		numeros.add(23);
		numeros.add(24);
		numeros.add(25);
		numeros.add(26);
		numeros.add(33);
		numeros.add(34);
		numeros.add(35);
		numeros.add(36);
		numeros.add(44);
		numeros.add(45);
		numeros.add(46);
		numeros.add(55);
		numeros.add(56);
		numeros.add(66);

		Collections.shuffle(numeros);
		return numeros;
	}

	//verifica qual dos arrays(homem ou maquina), possui a maior pedra para inciicar a partida.
	public boolean maiorPedra(ArrayList<Integer> arrayH, ArrayList<Integer> arrayM) {
		int maxH = arrayH.get(0);
		int maxM = arrayH.get(0);

		for (int i = 0; i < arrayH.size(); i++) {
			if (arrayH.get(i) > maxH) {
				maxH = arrayH.get(i);
			}
		}
		for (int i = 0; i < arrayM.size(); i++) {
			if (arrayM.get(i) > maxM) {
				maxM = arrayM.get(i);
			}
		}
		//se a maior pedra for do homen retorma true, caso contrario retorma false.
		if (maxH > maxM) {
			return true;
		} else {
			return false;
		}

	}
}
