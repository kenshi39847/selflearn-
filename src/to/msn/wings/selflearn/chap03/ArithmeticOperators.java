package to.msn.wings.selflearn.chap03;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println(1 + 2);  //結果:3
	    System.out.println("a" + 5);  //結果:a5
	    System.out.println(5 + "b");  //結果:5b
	    System.out.println("1" + "2");  //結果:12
	    System.out.println("a" + LocalDateTime.now());  //結果:a2023-11-25T10:08:12.762633800
	    //System.out.println(1 + LocalDateTime.now());  //結果:エラー
	    
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
	    
	    System.out.println(3 / 4);  //結果:0
	    
	    //System.out.println(5 / 0);  //結果:エラー（定数0による除算のため）
	    //System.out.println(5 % 0);  //結果:エラー（定数0による除算のため）
	    System.out.println(5d / 0);  //結果:Infinity（無限大）
	    System.out.println(5d % 0);  //結果:NaN（非数:Not a Number）
	    
	    System.out.println(Math.floor((0.7 + 0.1) * 10));  //結果:7.0
	    
	    var bd1 = new BigDecimal("0.7");
	    var bd2 = new BigDecimal("0.1");
	    var bd3 = new BigDecimal("10");
	    System.out.println(bd1.add(bd2).multiply(bd3));  //結果:8.0
	}

}

/*
  与えられた変数やリテラルに対して、あらかじめ決められた処理を行うための記号を「演算子（オペレーター）」という。
  演算子によって処理される変数/リテラルのことを「被演算子（オペランド）」という。
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

/*
  算術演算子では、演算の結果はオペランドのデータによって変化する。
  例えば、オペランドが整数型の場合は演算結果も整数型となり、浮動小数点型の場合は演算結果も浮動小数点型となる。
*/

/*
  ゼロ除算での挙動
  オペランドが整数の場合はコンパイルエラーとなり、オペランドが浮動小数点数の場合はInfinity,NaNという特殊の値になる。
*/

/*
  System.out.println(Math.floor((0.7 + 0.1) * 10));  //結果:7.0
  上記の場合、(0.7 + 0.1) * 10 = 8なので、小数点以下を切り捨てても8となるはずが結果は7となる。
  これは不動小数点型が内部的には2進数で演算されるために発生する誤差である。
  10進数では0.1と単純に表せるものを、2進数では0.0001100110011...という「無限循環小数」となるため、
  (0.7 + 0.1) * 10も内部的には7.99999999...となるため、「BigDecimalクラス」を利用する。
  import java.math.BigDecimal;
  (中略)
  var bd1 = new BigDecimal("0.7");
  var bd2 = new BigDecimal("0.1");
  var bd3 = new BigDecimal("10");
  System.out.println(bd1.add(bd2).multiply(bd3));  //結果:8.0
*/
