package to.msn.wings.selflearn.chap09.nestedclasses;

public class NestedClasses {

	public static void main(String[] args) {
		var c = new MyClass();
	    c.run();
	    // var h = new MyClass.MyHelper();

	}

}

/*
クラスは、class{...}の配下に入れ子で定義することもでき、これを入れ子のクラス（Nested Class）という。
ネストの階層に制限はないが、あまり深いネスト構造はコードの見通しを悪くするのでおすすめしない。
一般的には、一段以上のネストを利用する機会はほとんどない。
例えば、特定のクラス（MyClass）にクラス（MyHelper）が強く依存しており、しかもMyHelperがMyClassからしか呼ばれないという
状況を想定すると、双方の関連を手っ取り早表現するには単一の.javaファイルにまとめることが良い。
非publicなクラスであれば、1つの.javaファイルに複数のクラスをまとめることは構文上問題ないが、アクセス制御という観点からは不完全である。
なぜなら、1つのファイルにまとめたとしてもMyHelperはあくまでもパッケージプライベートであって、同じパッケージクラスからは
自由にアクセスできてしまうからである。
もしもMyHelperをMyClassでしか利用しないならば、MyClassプライベートとするのが望ましい。
そのような場合に利用するのが「staticメンバークラス」である。
構文のルールは以下のようになっている。
1.classブロックの配下で定義する
2.利用できる修飾子が異なる
3.入れ子のクラスの名前は「エンクロージングクラス.入れ子クラス」
*/
