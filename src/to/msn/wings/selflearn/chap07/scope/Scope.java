package to.msn.wings.selflearn.chap07.scope;

public class Scope {

	public static void main(String[] args) {
		/*
		var s = new ScopeBasic();
		System.out.println(s.show());
		System.out.println(s.date);
		*/
		
		/*
		var s = new ScopeStrict();
	    s.show();
	    */
		
		/*
		{
		    var data = "ブロックスコープ";
		}
		    var data = "ローカルスコープ";
		    System.out.println(data);
		*/
		
		/*
		{
		    var data = "ブロックスコープ";
		    System.out.println(data);
		}

		{
		    var data = "ブロックスコープ2";
		    System.out.println(data);
		}
		*/
		
		var p = new Person("山田太郎", 30);
	    System.out.println(p.show());

	}

}

/*
コードの中での変数の有効範囲のことを「スコープ」という。
変数のスコープは、変数を宣言した場所（ブロック）によって決まる。
まず、最も有効範囲が広いのが、クラス全体からアクセスできるフィールドで、class{...}の直下で宣言する。
一方、メソッドの定義ブロックで宣言された変数は「ローカル変数」とよばれ、メソッドの中でしかアクセスできない。
最も有効範囲が狭い変数は、メソッド配下のブロックで宣言された変数で、具体的には、
if、while/forなどで制御ブロックの配下で宣言された変数と言い換えてもよい。
このような変数を便宜的に「ブロック変数」といい、ブロック配下でのみアクセスできる。
*/

/*
変数の有効範囲を正確に表現するならば「宣言された位置からブロックの終端までが有効範囲」となる。
public class ScopeStrict {
  String str1 = "いろはにほへと";
  String str2 = str1;
}
上記のコードは正しいコードであるが、以下のコード（2,3行目を逆にしたもの）は不可である。
public class ScopeStrict {
  String str2 = str1;
  String str1 = "いろはにほへと";
}
str1を参照している時点で、str1はまだ宣言されていないからであり、これが変数が「宣言された位置から有効」という意味である。
ただし、メソッド/コンストラクターからの参照は例外で、フィールドの宣言開始位置に関わらず、どこからでも参照できる。
*/

/*
ローカルスコープよりもさらに小さなスコープ単位が、「ブロックスコープ」で、
if、while/for、tryなどの制御ブロックで宣言された変数は、そのブロックの配下でしかアクセスできない。
ただし、ブロックスコープの変数は、ローカル変数の一種で、上位ローカル変数と同名のブロックスコープ変数を宣言することはできない。
*/

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
