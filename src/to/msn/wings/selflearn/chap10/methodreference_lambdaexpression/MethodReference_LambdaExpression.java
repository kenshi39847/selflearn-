package to.msn.wings.selflearn.chap10.methodreference_lambdaexpression;

public class MethodReference_LambdaExpression {

	public static void main(String[] args) {
		var data = new String[] {"春はあけぼの", "夏は夜", "秋は夕暮れ"};
	    var u = new MethodRefUse();
	    // ④
	    u.walkArray(data, MethodRefUse::addQuote);
	    
	    // ラムダ式を表す
	    var ml = new MethodLambda();
	    ml.walkArray(data, (String value) -> {
	      System.out.printf("[%s]\n", value);
	    });

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
メソッドを受け渡し出来るといっても、なんでも渡せるわけではなく、引数の個数/型、戻り値の型が決まっている必要がある。
これを規定しているものが「関数型インターフェイス」であり、配下の抽象メソッドが1つであるインターフェイスのことである。
抽象メソッドのため、defaultメソッド、Objectクラスのオーバーライドは抽象メソッドとは見なされない。
2.受け渡しすべきメソッド本体を準備する
インターフェイスそのものは型を宣言するだけの存在なので、インターフェイスを実装する必要がなく、メソッド名も違っていてかまわない。
メソッドの型はあくまで引数の個数/型、戻り値の型で識別される。
3.引数経由でメソッド参照を受け取る準備
引数としてメソッド参照を受け取るには、引数型として関数型インターフェイスを指定するだけである。
引数経由で受け取ったメソッド参照は「引数名.メソッド名(...)」の形式で呼び出せる。
4.メソッドにメソッド参照を引き渡す
○メソッド参照の構文
|対象                |構文                        |
|クラスメソッド      |クラス名::メソッド名        |
|インスタンスメソッド|オブジェクト変数::メソッド名|
|コンストラクター    |クラス名::new               |
*/

/*
「ラムダ式」とは、メソッド定義を式（リテラル）として表すための仕組みで、式なので、メソッド呼び出しの文の中に
直接記述でき、コードもすっきり表せる。
○ラムダ式
(引数型 仮引数) -> {
  ...メソッドの本体...
}
*/

/*
コレクションフレームワークでは、引数としてラムダ式を指定できるメソッドが用意されている。
○replaceAllメソッド（指定されたルールで値を置き換える）
public void replaceAll(UnaryOperator<E> operator)
E:リストの要素型
operator:置き換えルール
○replaceAllメソッド（指定されたルールで値を置き換える）
public void replaceAll(BiFunction<? super K,? super V,? extends V> function)
K:キーのデータ型
V:値のデータ型
function:置き換えルール
○removeIfメソッド（条件に合致した要素をリストから除去する）
public boolean removeIf(Predicate<? super E> filter)
E:リストの要素型
filter:検索条件
○mergeメソッド（重複したキーの値を加工する）
public V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remap)
K:キーのデータ型
V:値のデータ型
key:キー
value:値
remap:値を加工するための関数
*/
