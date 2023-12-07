package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsFramework {
    
	public static void main(String[] args) {
		
		/*
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
		*/
		
		/*
		var data = new String[] { "バラ", "ひまわり", "あさがお"};
	    var list = Arrays.asList(data);
	    list.set(0, "チューリップ");  //asListメソッドで変換したリストはあくまでリストの皮をかぶった配列であるので、リストへの変更はそのまま元の配列に影響を及ぼす
	    System.out.println(list);                    //結果：[チューリップ, ひまわり, あさがお]
	    System.out.println(Arrays.toString(data));  //結果：[チューリップ, ひまわり, あさがお]
	    //list.add("さくら");  //結果：エラー  //リストへの追加/削除はUnsupportedOperationException例外となる
	    //list.remove(0);      //結果：エラー    （配列のサイズは変更できない）
	    */
		
		/*
		var data = new String[] { "バラ", "ひまわり", "あさがお"};
	    var list = new ArrayList<String>();
	    Collections.addAll(list, data);
	    list.set(0, "チューリップ");
	    list.add("さくら");
	    list.remove(1);
	    System.out.println(list);                    //結果：[チューリップ, あさがお, さくら]
	    System.out.println(Arrays.toString(data));  //結果：[バラ, ひまわり, あさがお]
	    */
		
		var data = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "あさがお"));
	    var strs = new String[data.size()];
	    data.toArray(strs);
	    data.set(0, "チューリップ");
	    System.out.println(Arrays.toString(strs));  //結果：[バラ, ひまわり, あさがお]
	    System.out.println(data);                    //結果：[チューリップ, ひまわり, あさがお]

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

/*
  オブジェクトの集合体を扱う場合、まずは配列よりもコレクションを利用すべきだが、
  実際の開発では利用しているライブラリが配列を利用しているなどで、配列を利用せざるを得ない状況がある。
  1.配列→リスト
  「Arrays.asListメソッド」を利用する。
  
  asListメソッド
  public static <T> List <T> asList(T... a)
  a:変換元の配列（可変長引数）
  
  2.配列→リスト（コピー版）
  もしも、変換後のリストに対して、要素を追加/削除したいならば、配列をコピーし新規にリストを作成し、
  これには「Collections.addAll静的メソッド」を利用する。
  
  addAllメソッド
  public static <T> boolean addAll(Collection<? super T> c, T... elements)
  c:コピー先のコレクション
  elements:コピーする値
  
  3.コレクション→配列
  コレクション実装クラスの「toArrayメソッド」を利用する。
  
  toArrayメソッド
  public <T> T[] toArray([T[] a])
  a:変換先の配列
  
  toArrayメソッドは以下のルールで動作する。
  ・指定の配列（引数a）にすべての要素が収まるならばそのまますべての要素を設定
  ・すべての要素が収まらない場合は引数aと同じ型の配列を生成してからすべての要素を設定
  ・コレクションの要素を配列の要素型に変換できない場合はArrayStoreException例外を発生
*/
