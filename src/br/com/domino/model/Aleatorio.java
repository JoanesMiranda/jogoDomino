package br.com.domino.model;

import java.util.Random;

public class Aleatorio {

	public Integer[] geraNumerosAleatorios() {

		Random gerador = new Random();
		Integer numero;
		Integer[] array = new Integer[28];

		for (int i = 0; i < array.length; i++) {

			numero = gerador.nextInt(27) + 1;
			for (int j = 0; j < array.length; j++) {
				if (numero == array[j] && j != i) {
					numero = gerador.nextInt(27) + 1;
				} else {
					array[i] = numero;
				}
			}
		}
		return array;
	}

}
