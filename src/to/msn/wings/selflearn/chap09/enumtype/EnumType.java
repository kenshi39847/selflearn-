package to.msn.wings.selflearn.chap09.enumtype;

public class EnumType {

	
	public static void main(String[] args) {
		/*
		for (var se : Season.values()) {
		    System.out.println(se.ordinal() + ":" + se.toString());
		}
		var s = Season.valueOf("SPRING");
	    System.out.println(s instanceof Season);
	    */
	 
		for (var se: Season.values()) {
		      se.show();
		}
	}
	
}

/*
値そのものには意味がなく、シンボル（名前）としてのみ意味を持つ定数の集合を表すために、final staticを利用するのは誤りである。
なぜなら、想定しない値も受け取ってしまう可能性があるからである。
このような問題を解決するために、「列挙型」がある。列挙型を利用するためには「enum命令」を用いる。
○enum命令
[修飾子] enum 名前 {
  列挙定数,
  ...
}
上記を利用して四季を表すためのコードを表すと、以下のようなコードとなる。
public enum Season {
  SPRING,
  SUMMER,
  AUTUMN,
  WINTER,
}

○列挙型で利用できる主な修飾子
|修飾子  |概要                                    |
|public  |すべてのクラスからアクセス可能          |
|strictfp|浮動小数点数を環境に依存しない方法で演算|

○列挙型へのアクセス
列挙型.列挙定数
*/

/*
enumブロックで定義された列挙型ですが、実は、Enumクラスを暗黙的に継承したクラスである。
○Enumクラスの主なメンバー（Eは個々の列挙型、※は静的メソッド）
|メソッド              |概要                             |
|String name()         |列挙定数の名前を取得             |
|int ordinal()         |列挙定数の序数を取得（0スタート）|
|String toString()     |列挙定数の名前を取得             |
|※E[] values()          |すべての列挙定数を取得           |
|※E valueOf(String name)|名前から列挙定数を取得           |
列挙型で定義されたすべての列挙定数を取得するには、valuesメソッドを利用する。
文字列表現から列挙型を取得したいならば、valueOf静的メソッドを利用する。
*/

/*
列挙型の実体はクラスで、一般的なクラスと同じくメソッド、フィールド、コンストラクターなどのメンバーを定義できるが、相違点もある。
*/

/*
複数のフラグ（オンオフ）をビットの並びとして表現する手法をビットフィールドという。
*/
