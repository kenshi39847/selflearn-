package to.msn.wings.selflearn.chap06;

public class CollectionsFramework {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

/*
  モノ（オブジェクト）の集合を表す仕組みを「コレクション」という。
  java.utilパッケージはコレクションを扱うための汎用的なクラス/インターフェースの集合で、これを総称して「コレクションフレームワーク」という。
  コレクションを利用するメリットには以下のようなものがある。
  ・既知のデータ構造/アルゴリズムをそのまま取り込めるため、開発生産性が優れる
  ・同様の理由からパフォーマンスも優れる
  ・共通的な操作をインターフェースとして定義しているので、データ構造/アルゴリズムによらず、同じように操作できる。

  Collectionのサブインターフェースとして、List、Set、Queue(Deque)があり、Collectionとは継承関係にないものであるMapが加わって、
  コレクションフレームワークの基本的な機能を構成している。
  コレクションフレームワークの実装クラスは一般的に「実装手段+インターフェース名」の形式で命名される。
  
  |インターフェース|実装クラス   |概要                                  |
  |List            |ArrayList    |可変長配列                            |
  |                |LinkedList   |リンク構造のリスト                    |
  |Set             |HashSet      |任意の順で格納された要素の集合        |
  |                |LinkedHashSet|追加順に格納された要素の集合          |
  |                |TreeSet      |キーにより並べ替えられる要素の集合    |
  |Map             |HashMap      |基本的なマップ                        |
  |                |TreeMap      |キューにより要素を並び替えられるマップ|
  |Queue(Deque)    |ArrayDeque   |両端キュー                            |
  |                |LinkedList   |ListインターフェースのLinkedListと同一|
*/
