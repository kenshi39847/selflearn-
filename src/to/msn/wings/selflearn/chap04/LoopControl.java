package to.msn.wings.selflearn.chap04;

public class LoopControl {

	public static void main(String[] args) {
		/*
		int i;
	    int sum = 0;

	    for (i = 1; i <= 100; i++) {
	      sum += i;
	      if (sum > 1000) {
	        break;
	      }
	    }

	    System.out.println("合計が1000を超えるのは、1～" + i + "を加算したときです。");  //結果：合計が1000を超えるのは、1～45を加算したときです。
	    */
		
		/*
	    var sum = 0;

	    for (var i = 0; i <= 100; i++) {
	      if (i % 2 != 0) {
	        continue;
	      }
	      sum += i;
	    }

	    System.out.println("合計値は" + sum + "です。");  //結果：合計値は2550です。
	    */
		
		/*
		for (var i = 1; i < 10; i++) {
		    for (var j = 1; j < 10; j++) {
		    var result = i * j;
		      if (result > 50) {
		        break;
		      }
		      System.out.printf(" %2d", result);
		    }
		    System.out.println();
		}
		*/
		/*
		  1  2  3  4  5  6  7  8  9
          2  4  6  8 10 12 14 16 18
          3  6  9 12 15 18 21 24 27
          4  8 12 16 20 24 28 32 36
          5 10 15 20 25 30 35 40 45
          6 12 18 24 30 36 42 48
          7 14 21 28 35 42 49
          8 16 24 32 40 48
          9 18 27 36 45
		*/
		
		limit:
		    for (var i = 1; i < 10; i++) {
		      for (var j = 1; j < 10; j++) {
		        var result = i * j;
		        if (result > 50) {
		          break limit;
		        }
		        System.out.printf(" %2d", result);
		      }
		      System.out.println();
		    }
		/*
		  1  2  3  4  5  6  7  8  9
          2  4  6  8 10 12 14 16 18
          3  6  9 12 15 18 21 24 27
          4  8 12 16 20 24 28 32 36
          5 10 15 20 25 30 35 40 45
          6 12 18 24 30 36 42 48
		*/

	}

}

/*
  「break命令」は現在のループを強制的に中断する命令で、switch命令ではswitchブロックを抜けるための命令であったが、
  一般的にはwhile/do...while、for/拡張forなどのブロックの中で利用する。
  break命令はifのような条件分岐命令と合わせて利用するのが一般的である。
*/

/*
  ループそのものを完全に抜けてしまうbreak命令に対して、
  現在の周回だけをスキップし、ループそのものは継続して実行する命令を「continue命令」である。
*/

/*
  ネストされたループの中で、無条件にbreak/continue命令を使用した場合、内側のループだけを脱出/ループする。
*/

/*
  break/continue命令（ラベル構文）
  break ラベル名
  continue ラベル名
*/
