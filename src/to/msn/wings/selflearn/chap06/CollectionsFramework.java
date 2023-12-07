package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;

public class CollectionsFramework {

	public static void main(String[] args) {
		
		var data = new ArrayList<String>() {  //・・・匿名クラス
		  {                                   //・・・初期化ブロック
		    add("バラ");
		    add("ひまわり");
		    add("あさがお");
		  }
		};
		for (var s : data) {
		  System.out.println(s);
		}

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

/*
  コレクションのインスタンス化
  インターフェース型<要素型> = new 実装クラス型<>(引数, ...)
  
  コレクションは、一般的に上記の構文でインスタンス化する。
  例えば、ArrayListクラスをインスタンス化するには、以下のようなコードになる。
  List<String> data = new ArrayList<>();
*/

/*
  コレクション配下の要素を順番に処理するには、拡張for命令を利用する。
  この拡張for命令は内部的にはイテレーターを利用したwhile命令のシンタックスシュガー（より簡単化された構文）です。
  「イテレーター」とは、コレクションの要素を順番に取り出すための仕組みである。
  
  コレクションからはiteratorメソッドを利用することで、それぞれの実装に応じたIteratorオブジェクト（イテレーター）を取得できる。
  以下のコードはイテレーターを使ったものである。
  var itr = data.iterator();
  while (itr.hasNext()) {
    System.out.println(itr.next());
  }
  
  拡張forの方がコードをシンプルに表現できることから、一般的にはイテレーターを直接利用することはほとんどない。
  しかし、イテレーターを利用しなければならない場面もある。
  1.ループの中で要素を削除したい
  var data = new ArrayList<String>() {
    {
      add("バラ");
      add("ひまわり");
      add("あさがお");
    }
  };
  var ite = data.iterator();
  while (ite.hasNext()) {
    System.out.println(ite.next());
    ite.remove();
  }
  System.out.println(data);
  
  2.リストを逆順に読み込む
  var data = new ArrayList<String>() {
    {
      add("バラ");
      add("ひまわり");
      add("あさがお");
    }
  };
  var ite = data.listIterator(data.size());
  while (ite.hasPrevious()) {
    System.out.println(ite.previous());
  }
*/
