package to.msn.wings.selflearn.chap07.scope;

public class Scope {

	public static void main(String[] args) {
		/*
		var s = new ScopeBasic();
		System.out.println(s.show());
		System.out.println(s.date);
		*/
		
		var s = new ScopeStrict();
	    s.show();

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