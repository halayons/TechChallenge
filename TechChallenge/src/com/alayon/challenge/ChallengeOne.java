package com.alayon.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChallengeOne {
	public static List<String> switchList(List<Integer> list) {
		List<String>finalList=new ArrayList();
		int temp=list.get(0);
		for(int i=0;i<list.size()/2;i++) {
			list.set(i, list.get(list.size()-1-i));
			list.set(list.size()-1-i, temp);
			temp=list.get(i+1);
		}
		for(int element:list) {
			String s=String.valueOf(element);			
			List<String> result = Arrays.asList(s.split("9"));			
			String numberString = result.stream().map(String::valueOf)
				    .collect(Collectors.joining(""));
			if(!numberString.isEmpty()) {
			finalList.add(numberString);}
						
		}
		return finalList;
	}
	
}
