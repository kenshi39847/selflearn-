package to.msn.wings.selflearn.chap04;

import java.util.ArrayList;

public class Chap04Practice {

	public static void main(String[] args) {
		/*
		int value = 3;

	    if (value > 0){
	      System.out.println("値は正です"); 
	    }else if (value < 0){
	      System.out.println("値は負です"); 
	    }else {
	      System.out.println("値は0です"); 
	    }
	    */
		
		ArrayList<Integer> scores = new ArrayList<Integer>();

	    scores.add(1);
	    scores.add(5);
	    scores.add(10);
	    scores.add(15);

	    for(int score : scores) {
	      System.out.println(score);  
	    }

	}

}
