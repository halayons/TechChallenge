package com.alayon.challenge;

import java.util.ArrayList;
import java.util.List;

public class ChallengeTwo {
	public static List<Integer> squares(List<Integer> list) {
		List<Integer> negativ=new ArrayList();
		while(list.get(0)<0) { //se separan los numeros negativos en una nueva lista y se calcula el cuadrado de cada uno
			negativ.add(list.get(0)*list.get(0));
			list.remove(0);
		}
		for(int i=0;i<list.size();i++) {//se calcula el cuadrado para los numeros que qudaron en la lista original
			if((list.get(i)*list.get(i))>99) {//descartando los mayores a 99
				list.remove(i);
				i--;
				}else {list.set(i, (list.get(i)*list.get(i)));}
			}
		int position=list.size()-1;
		
		for(int element:negativ) {//se agregan insertan los elementos en la posicion correspondiente, en la lista ordenada
			if(element<=99) {
				position=insertElement(list,element,position);
			}
			
		}
		return list;
	}
	public static int insertElement(List<Integer>list,int element,int position) {//funcion para insertar elementos de manera ordenada
		if(element<list.get(0)) {
			list.add(0, element);
		}else {
		
		for(int i=position;i>=0;i--) {
			if(element>=list.get(i)) {
				list.add(i+1,element);
				position=i+1;
				break;
			}
			
		}
		}
		return position;
	}

}
