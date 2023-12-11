package to.msn.wings.selflearn.chap07.scope;

public class Scope {

	public static void main(String[] args) {
		var s = new ScopeBasic();
		System.out.println(s.show());
		System.out.println(s.date);

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
