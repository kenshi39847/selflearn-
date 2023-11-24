package to.msn.wings.selflearn.chap03;

public class ArithmeticOperators {

	public static void main(String[] args) {
		//System.out.println(1 + 2);
	    //System.out.println("a" + 5);
	    //System.out.println(5 + "b");
	    //System.out.println("1" + "2");
	    //System.out.println("a" + LocalDateTime.now());
	    // System.out.println(1 + LocalDateTime.now()); //エラー
	    
		/*
		var start = System.currentTimeMillis();
	    var result = "";
	    for (var i = 0; i < 100000; i++) {
	      result += "いろは";
	    }
	    System.out.println(result.length());
	    var end = System.currentTimeMillis();
	    System.out.println((end - start)  + "ミリ秒");
        */
		
		var start = System.currentTimeMillis();
	    var builder = new StringBuilder();
	    for (var i = 0; i < 100000; i++) {
	      builder.append("いろは");
	    }
	    var result = builder.toString();
	    System.out.println(result.length());
	    var end = System.currentTimeMillis();
	    System.out.println((end - start)  + "ミリ秒");
	    
	    var i = 3;
	    var j = ++i;
	    System.out.println(i);  //結果:4
	    System.out.println(j);  //結果:4
	    
	    var m = 3;
	    var n = m++;
	    System.out.println(m);  //結果:4
	    System.out.println(n);  //結果:3
	}

}

/*
  与えられた変数やリテラルに対して、あらかじめ決められた処理を行うための記号を「演算子（オペレーター）」という。
  演算子によって処理される変数/リテラルのことを被演算子（オペランド）という。
  Javaの演算子には「算術演算子」、「代入演算子」、「関係演算子」、「論理演算子」、「ビット演算子」がある。


/*
  「算術演算子（代数演算子）」は四則演算をはじめ、日常的な数字で利用する演算子を提供する。
*/

/*
  +演算子による文字列連結は一般的には非効率（実行速度敵に）なので、StringBuilderクラスのappendメソッドを使う。
  StringBuilderクラスはあらかじめ一定のサイズを確保した可変長の文字列を表します。
  文字列を連結する際にあらかじめ覚悟した領域の範囲内で文字列長を自由に変更できるので、
  インスタンスの生成/破棄が頻繁に発生することはない。
  var builder = new StringBuilder();
	    for (var i = 0; i < 100000; i++) {
	      builder.append("いろは");
	    }
  var result = builder.toString();
*/

/*
  ++/--は与えられたオペランドに対して1を加算/減算するための演算子で、インクリメント演算子/デクリメント演算子ともいう。
  ++/--演算子をオペランドの前方に置くことを前置演算、後方に置くことを後置演算という。
  リテラル操作はできない。
*/

