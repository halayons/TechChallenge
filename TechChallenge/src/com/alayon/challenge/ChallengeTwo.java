package com.alayon.challenge;

import java.util.ArrayList;
import java.util.List;

public class ChallengeTwo {
	public static List<Integer> squares(List<Integer> list) {
		List<Integer> negativ=new ArrayList();
		while(list.get(0)<0) {
			negativ.add(list.get(0)*list.get(0));
			list.remove(0);
		}
		for(int i=0;i<list.size();i++) {
			if((list.get(i)*list.get(i))>99) {
				list.remove(i);
				i--;
				}else {list.set(i, (list.get(i)*list.get(i)));}
			}
		int position=list.size()-1;
		
		for(int element:negativ) {
			if(element<=99) {
				position=insertElement(list,element,position);
			}
			
		}
		return list;
	}
	public static int insertElement(List<Integer>list,int element,int position) {
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
