package br.com.domino.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aleatorio {

	public int[] geraNumerosAleatorios() {

		int[] array = new int[28];
		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i < 28; i++) {
		    numeros.add(i);
		}
		 Collections.shuffle(numeros);
		for (int i = 0; i < 28; i++) {
		   System.out.println(array[i] = numeros.get(i));
		}
		return array;
	}
		
}
