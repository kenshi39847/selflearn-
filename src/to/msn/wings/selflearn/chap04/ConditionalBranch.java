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
		
		/*
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
	    */
	    
		
	    var i = 1;
	    if (i == 1)
	      System.out.println("変数iは1です。");
	    else
	      System.out.println("変数iは1ではありません。");  //結果：変数iは1です。
	    
		
	    var rank = "甲";

	    switch (rank) {
	      case "甲":
	        System.out.println("大変良いです。");
	        break;

	      case "乙":
	        System.out.println("良いです。");
	        break;

	      case "丙":
	        System.out.println("がんばりましょう。");
	        break;

	      default:
	        System.out.println("？？？");
	        break;
	    }  //結果：大変良いです。
	    
	    var drink = "ビール";
	    switch (drink) {
	      case "日本酒":
	      case "ビール":
	      case "ワイン":
	        System.out.println("醸造酒です。");
	        break;
	      case "ブランデー":
	      case "ウイスキー":
	        System.out.println("蒸留酒です。");
	        break;
	    }  //結果：醸造酒です。   

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

/*
  if、else if、elseブロック配下の文が1つである場合、ブロック（{...}）は省略できる。
  しかし、{...}を省略してもそれほどコードは短くなるわけではなく、むしろブロックの範囲が不明確になるため
  バグの温床になりやすいためおすすめしない。
*/

/*
  等価演算子による多岐分岐に特化した条件分岐命令を「switch命令」という。
  同じような式を繰り返し記述する必要がなくなるので、コードが読みやすくなる。
*/

/*
  switch命令
  switch(式) {
    case 値1:
      ...「式 = 値1」の場合に実行する処理...
      break;
    case 値2:
      ...「式 = 式2」の場合に実行する処理...
      break;
    ...
    default:
      ...すべての値に合致しない場合に実行する処理
      break;
  }
*/

/*
  switch命令では次のような流れで実行すべき処理を決定する。
  1.switchブロックの式を評価
  2.1の値に合致するcase句を実行
  3.対応するcase句が見つからない場合には、default句を実行
*/

/*
  case/defaultはブロックではなく「xxxxx :」の形式で表された「句（ラベル）」である。
  break命令のないcase/default句では、そのまま後続のcase/default句が実行されてしまう。
*/

/*
  break命令を意図的に略して、複数のcase/default句を続けて実行していくことを「フォールスルー」という。
  しかし、フォールスルーは一般的にコードを読みにくくする原因となるので、例外を除き避けるべきである。
  その例外とは、文を挟まずに複数のcase句を列記する場合である。
*/
