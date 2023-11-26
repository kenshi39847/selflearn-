package to.msn.wings.selflearn.chap03;

import java.math.BigDecimal;
import java.util.Arrays;

public class RelationalOperators {

	public static void main(String[] args) {
		/*
		  ==演算子はオペランドの同一性を比較する。
		  下記は一見して同じ文字列を表すが、別々に作成された異なるオブジェクトなため、同一ではないとなる。
		*/
		var builder1 = new StringBuilder("あいう");
	    var builder2 = new StringBuilder("あいう");
	    System.out.println(builder1 == builder2);  //結果:false
	    
	    /*
		  ただし、Javaでは文字列リテラルによって生成されたStringオブジェクトは同値である限り同一であるという性質のため、
		  ==演算子で同値比較しているように見える。
		*/
	    var str1 = "あいう";
	    var str2 = "あいう";
	    System.out.println(str1 == str2);  //結果:true
	    System.out.println(str1 == "あ" + "いう");  //結果:true
	    
	    System.out.println(0.2 * 3 == 0.6);  //結果:false
	    
	    var bd1 = new BigDecimal("0.2");
	    var bd2 = new BigDecimal("3");
	    var bd3 = new BigDecimal("0.6");
	    System.out.println(bd1.multiply(bd2).compareTo(bd3));  //結果:0
	    
	    final double EPSILON = 0.00001;
	    var x = 0.2 * 3;
	    var y = 0.6;
	    System.out.println(Math.abs(x - y) < EPSILON);  //結果:true
	    
	    /*
	    var data1 = new String[] { "あ", "い", "う" };
	    var data2 = new String[] { "あ", "い", "う" };
	    System.out.println(data1 == data2);  //結果:false
	    System.out.println(data1.equals(data2));  //結果:false
	    */
	    
	    /*
	    var data1 = new int[][] {
	        { 1, 2, 3 },
	        { 4, 5, 6 },
	        { 7, 8, 9 },
	      };
	      var data2 = new int[][] {
	        { 1, 2, 3 },
	        { 4, 5, 6 },
	        { 7, 8, 9 },
	      };
	      System.out.println(Arrays.equals(data1, data2));  //結果:false
	      System.out.println(Arrays.deepEquals(data1, data2));  //結果:true
	      */
	      
	      var data1 = new int[] {1, 3};
	      var data2 = new int[] {1, 2, 3};
	      var data3 = new int[] {1, 2, 3};
	      var data4 = new int[] {1, 3, 1};
	      System.out.println(Arrays.compare(data1, data2));  //結果:1
	      System.out.println(Arrays.compare(data3, data4));  //結果:-1
	      System.out.println(Arrays.compare(data2, data3));  //結果:0
	      
	      Integer i1 = 108;
	      Integer i2 = 108;
	      System.out.println(i1 == i2);  //結果:true

	      Integer j1 = 256;
	      Integer j2 = 256;
	      System.out.println(j1 == j2);  //結果:false
	      
	      var age = 30;
	      System.out.println(age >= 20 ? "おとな" : "こども");  //結果:おとな
	}

}

/*
  関係演算子（比較演算子）を利用する上で「同一性」、「同値性」を区別する。
  同一性:オブジェクト参照同士が同じオブジェクトを参照していること
  同値性:オブジェクトが同じ値を持っていること
*/

/*
  System.out.println(0.2 * 3 == 0.6);  //結果:false
  浮動小数点数は内部的には2進数で扱われるため、上記のような比較はfalseとなる。
  浮動小数点数の比較では2つの方法がある
  1.BigDecimalクラスによる比較
    まずはBigDecimalクラスを利用するのが基本である。比較にはそのcompareToメソッドを利用する。
    compareToメソッドは、オブジェクトが表す数値よりも引数の値が大きい場合は「1」、小さい場合は「-1」、等しい場合は「0」と返される。
  2.丸め単位を利用した比較
  定数EPSILONは誤差の許容範囲を表す。「計算機イプシロン（丸め単位）」ともいう。
  あとは、浮動小数点数同士の差を求め、その値がイプシロン未満であれば、保障した桁数までは等しいということになる。
  Math.absは絶対値を求める命令である。
*/

/*
  配列の比較には==演算子はもちろん、equalsメソッドも利用できない。
  配列を比較するにはArraysクラスのdeepEqualsメソッドを利用する。
*/

/*
  配列の大小を比較するためのcompareメソッドもある。
  compareメソッドは配列の先頭要素から順に比較し、より大きい/小さい要素が見つかったところで、配列全体として大小を確定する。
  配列1>配列2の場合は「正数」、配列1=配列2の場合は「0」、配列1<配列2の場合は「負数」である。
*/

/*
  オートボクシングに際して一部の基本型の値がメモ化（キャッシュ）される。具体的には以下の値がメモ化の対象になる。
  1.true/false
  2.byte値
  3.\u0000～\u007Fのchar値
  4.-128～127範囲のshort/int
*/

/*
  オートボクシングされた基本型の値（ラッパーオブジェクト）はequalsメソッドで比較する。
*/

/*
  条件演算子
  条件式 ? 式1 : 式2
  以下のコードは変数ageが20以上であれば「おとな」、そうでなければ「こども」を表示する。
  var age = 30;
  System.out.println(age >= 20 ? "おとな" : "こども");  //結果:おとな
*/
