package to.msn.wings.selflearn.chap04;

public class ConditionalBranch {

	public static void main(String[] args) {
		/*
		var i = 10;
	    if (i == 10) {
	      System.out.println("変数iは10です。");
	    } else {
	      System.out.println("変数iは10ではありません。");
	    }  //結果：変数iは10です。
	    */
	    
		/*
	    var i = 100;
	    if (i > 50) {
	      System.out.println("変数iは50より大きいです。");
	    } else if (i > 30) {
	      System.out.println("変数iは30より大きく、50以下です。");
	    } else {
	      System.out.println("変数iは30以下です。");
	    }  //結果：変数iは50より大きいです。
	    */
		
		var i = 1;
	    var j = 0;
	    if (i == 1) {
	      if (j == 1) {
	        System.out.println("変数i、jは1です。");
	      } else {
	        System.out.println("変数iは1ですが、jは1ではありません。");
	      }
	    } else {
	      System.out.println("変数iは1ではありません。");
	    }  //結果：変数iは1ですが、jは1ではありません。

	}

}

/*
  一般的にプログラムの構造は大きく3つに分類される。
  ・順次：記述された順に処理を実行
  ・選択：条件によって処理を分岐
  ・反復：特定の処理を繰り返し実行
  順次/選択/反復を組み合わせながらプログラムを開発していく手法を構造化プログラミングという。
*/

/*
  if命令
  if(条件式) {
    ...条件式がtrueのとき実行する処理...
  } else {
    ...条件式がfalseのとき実行する処理...
  }
*/

/*
  条件式を指定する場合の注意点
  1.比較演算子は=ではなく==であることに注意
  2.boolean型の変数を==で比較しない
  3.条件式からはなるべく否定を取り除く
*/

/*
  if...else if命令
  if(条件式1) {
    ...条件式1がtrueのとき実行する処理...
  } else if(条件式2) {
    ...条件式2がtrueのとき実行する処理...
  }
  ...
  } else {
    ...条件式1,2...がいずれもfalseのときに実行する処理
  } 
*/

/*
  if...else if命令では複数の条件に合致しても、実行されるブロックは最初に合致した1つだけが表示される。
*/

/*
  制御命令同士を入れ子に記述することをネストするという。
*/
