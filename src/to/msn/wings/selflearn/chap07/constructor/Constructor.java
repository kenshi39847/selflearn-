package to.msn.wings.selflearn.chap07.constructor;

public class Constructor {

	public static void main(String[] args) {
		/*
		var p = new Person("山田太郎", 30);
	    System.out.println(p.show());
	    */
		
		/*
		var p = new Person();
		p.show();
		*/

	}

}

/*
インスタンス化のタイミングで呼び出される特別なメソッドを「コンストラクター」という。
コンストラクターの定義
[修飾子] クラス名([引数の型 引数,...]) [throws句] {
  ...コンストラクターの内容...
}
ほとんどはメソッド定義の構文に準じるが、以下の点が異なる。
1.指定できる修飾子はアクセス修飾子（public, protected, private）だけ
2.戻り値はもたない（return命令も利用できない）
3.名前はクラスメイト一致すること（自由に命名できない）
*/

/*
コンストラクター定義を省略した場合、Javaが引数のない空のコンストラクターを暗黙的に生成する。
このようなコンストラクターのことを「デフォルトコンストラクター」という。

public class MyClass {
}

public class MyClass {
  public MyClass() {
  }
}
上記の2つのコードは意味的には等価である。しかし、コンパイラーによる自動生成に頼ったコードは好ましくない。
例えば、あとから引数付きのコンストラクターを追加した場合、デフォルトコンストラクターに頼ったコードはエラーとなってしまう。
このような問題を回避するために、空であっても、明示的にコンストラクターを定義しておくのがよい。

○正しく動作
public class MyClass {
}
...中略...
var mp = new MyClass();  
○エラー（コンストラクターMyClass()は未定義です）
public class MyClass {
  public MyClass(int i) { ... }
}
...中略...
var mp = new MyClass();
*/

/*
メソッドと同じく、コンストラクターもまた複数のシグニチャを持てる。これをコンストラクターの「オーバーロード」という。
※名前、引数の型/並びからなるメソッドの識別情報のことを「シグニチャ」という。
以下はStringVuilderクラスにおけるコンストラクターの主なシグニチャである。
例）
StringBuilder(),StringBuilder(String str),StringBuilder(int capacity)

コンストラクターの呼び出し（thisキーワード）
this(引数, ...)
構文そのものは難しくないが、thisの呼び出しはコンストラクターの先頭で記述する。
*/

/*
class {...}の直下に書かれた名無しのブロック({...})は、インスタンス化のタイミングでコンストラクターよりも先に実行される。
このような名無しのブロックを「初期化ブロック」という。
基本的に複数のコンストラクターに共通するコードを切り出すのが初期化ブロックの役割である。
*/
