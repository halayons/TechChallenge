package com.alayon.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeThree {
	public static int minimumChange(List<Integer> list) {
		int min = 0;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();//se crea una matriz para aplicar el 
		int max = list.stream().reduce(0, Integer::sum);//algoritmo del problema de la suma de subconjuntos con programacion dinamica
		for (int i = 0; i <= list.size(); i++) {
			matrix.add(new ArrayList<Integer>());
			matrix.get(i).add(1);
		}

		for (int i = 1; i <= max + 1; i++) {

			matrix.get(0).add(0);

			for (int j = 1; j <= list.size(); j++) {

				if (matrix.get(j - 1).get(i) == 1) {
					matrix.get(j).add(1);
				} else if (i < list.get(j - 1)) {
					matrix.get(j).add(matrix.get(j - 1).get(i));
				} else {
					matrix.get(j).add(matrix.get(j - 1).get(i - list.get(j - 1)));
				}
			}

			if ((matrix.get(list.size()).get(i) == 0)) {

				break;
			}
			min = matrix.get(list.size()).size();
		}

		for (List<Integer> element : matrix) {
			System.out.println(element);
		}

		return min;
	}
}
