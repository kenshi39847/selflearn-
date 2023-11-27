package to.msn.wings.selflearn.chap04;

public class ConditionalBranch {

	public static void main(String[] args) {
		var i = 10;
	    if (i == 10) {
	      System.out.println("変数iは10です。");
	    } else {
	      System.out.println("変数iは10ではありません。");
	    }  //結果：変数iは10です。

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
