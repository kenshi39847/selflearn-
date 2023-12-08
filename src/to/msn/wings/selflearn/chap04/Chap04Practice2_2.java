package to.msn.wings.selflearn.chap04;

public class Chap04Practice2_2 {

	public static void main(String[] args) {
	/* [2] for命令を利用して次の表を作成してみましょう。*/
	// 1 2 3 4 5 6 7 8 9 
	// 2 4 6 8 10 12 14 16 18 
	// 3 6 9 12 15 18 21 24 27 
	// 4 8 12 16 20 24 28 32 36
	// 5 10 15 20 25 30 35 40 45
	// 6 12 18 24 30 36 42 48 54
	// 7 14 21 28 35 42 49 56 63
	// 8 16 24 32 40 48 56 64 72
	// 9 18 27 36 45 54 63 72 81
	
	  for (var i = 1; i < 10; i++) {
	      for (var j = 1; j < 10; j++) {
	    	  var result = i * j;
	    	  System.out.print(result + " ");
	      }
	      System.out.println();
	  }
	}

}
