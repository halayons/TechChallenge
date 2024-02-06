package com.alayon.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alayon.challenge.*;

public class Test {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>(Arrays.asList(-90,-4,-3,0,1,2, 3, 4,10,11));
		List<Integer>list1=new ArrayList<>(Arrays.asList(50,9,2,1, 2,97, 3, 4,10,11));
		List<Integer>list2=new ArrayList<>(Arrays.asList(1, 5, 1, 1, 1, 10, 15, 20, 100));
		
		//System.out.println(ChallengeOne.switchList(list1));
		//System.out.println(ChallengeTwo.squares(list));
		System.out.println(ChallengeThree.minimumChange(list2));
		// TODO Auto-generated method stub

	}

}
