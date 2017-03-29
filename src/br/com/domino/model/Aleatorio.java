package br.com.domino.model;

import java.util.Random;

public class Aleatorio {

	public int[] geraNumerosAleatorios() {

		Random gerador = new Random();
		int numero;
		int[] array = new int[28];

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
