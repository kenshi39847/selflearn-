package to.msn.wings.selflearn.chap03;

public class AssignmentOperator {

	public static void main(String[] args) {
		/*
		  基本型の値は変数にもそのまま格納されるので変数xの値を変数yに引き渡す場合もその値はコピーされる。
		*/
		var x = 1;
	    var y = x;
	    x += 10;
	    System.out.println(x);  //結果:11
	    System.out.println(y);  //結果:1
	    
	    /*
		  参照型は下記のようなコードの場合、
		  StringBuilderオブジェクトを変数builder1に代入し、その中身をさらに変数builder2に代入している。
		  しかし、参照型では値そのものではなく値を格納しているメモリ上のアドレスが変数に格納される。
		  よって、変数builder1に格納されているアドレスを、変数builder2にコピーしているにすぎない。
		  結果として、変数builder1、変数builder2は同じオブジェクトを指していることになる。
		*/
	    var builder1 = new StringBuilder("あいう");
	    var builder2 = builder1;
	    builder1.append("えお");
	    System.out.println(builder1.toString());  //結果:あいうえお
	    System.out.println(builder2.toString());  //結果:あいうえお
	    
	    final int[] VALUES = { 10, 20 ,30 };
	    //VALUES = new int[] { 15, 25, 35 };  //結果:エラー
	    VALUES[0] = 100;  //結果:動作する

	}

}

/*
  次の2つのコードは意味的には等価である。
  i += j;
  i = i + j;
*/

/*
  finalで修飾された変数は厳密には変更できない変数ではなく「再代入できない変数」である。
  つまり、定数であっても値を変更できてしまう場合があるということである。
  final int[] VALUES = { 10, 20 ,30 };
  VALUES = new int[] { 15, 25, 35 };  //結果:エラー
  VALUES[0] = 100;  //結果:動作する
  なお、参照型でも、例えばString型は値を変更できない型（不変型）なので上記のような問題は起きない。
*/