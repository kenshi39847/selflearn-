package to.msn.wings.selflearn.chap04;

public class LoopControl {

	public static void main(String[] args) {
		int i;
	    int sum = 0;

	    for (i = 1; i <= 100; i++) {
	      sum += i;
	      if (sum > 1000) {
	        break;
	      }
	    }

	    System.out.println("合計が1000を超えるのは、1～" + i + "を加算したときです。");

	}

}

/*
  「break命令」は現在のループを強制的に中断する命令で、switch命令ではswitchブロックを抜けるための命令であったが、
  一般的にはwhile/do...while、for/拡張forなどのブロックの中で利用する。
  break命令はifのような条件分岐命令と合わせて利用するのが一般的である。
*/
