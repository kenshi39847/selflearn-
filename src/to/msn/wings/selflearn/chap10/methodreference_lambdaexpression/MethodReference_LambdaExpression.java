package to.msn.wings.selflearn.chap10.methodreference_lambdaexpression;

public class MethodReference_LambdaExpression {

	public static void main(String[] args) {
		var data = new String[] {"春はあけぼの", "夏は夜", "秋は夕暮れ"};
	    var u = new MethodRefUse();
	    // ④
	    u.walkArray(data, MethodRefUse::addQuote);

	}

}

/*
「ラムダ式」はJava8以降に導入された概念で、利用することで従来のコードがシンプルに表現できる。
メソッドは他の数値型や文字列型と同じく別のメソッドの引数として渡すことができる。
そして、メソッドを受け渡しするための構文がメソッド参照であり、ラムダ式となる。
メソッド参照は、例えば、与えられた文字列配列から個々の要素を取り出して前後にブラケットを加えたものを出力するコードがあるとする。
そのとき、文字列を加工する処理だけを外から引き渡せるようになればより汎用性が増す。そこで利用するのが「メソッド参照」である。
メソッド参照に関してのポイントは以下の4つである。
1.メソッドの型を表すのは関数型インターフェイス
2.受け渡しすべきメソッド本体を準備する
3.引数経由でメソッド参照を受け取る準備
4.メソッドにメソッド参照を引き渡す
*/
