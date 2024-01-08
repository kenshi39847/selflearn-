package to.msn.wings.selflearn.chap09.enumtype;

public class EnumType {

	public static void main(String[] args) {
		

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
