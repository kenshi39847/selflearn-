package to.msn.wings.selflearn.chap06;

import java.util.LinkedHashMap;

public class Map {

	public static void main(String[] args) {
	  /*
	  var map = new HashMap<String, String>();
      map.put("Rose", "バラ");
	  map.put("Sunflower", "ひまわり");
	  map.put("Morning Glory", "あさがお");
	  System.out.println(map.containsKey("Rose"));                    //結果：true
	  System.out.println(map.containsValue("バラ"));                  //結果：true
	  System.out.println(map.isEmpty());                              //結果：false
      
      //キー/値を列挙するには、keySet/valuesメソッドでキー/値のセットを取り出す必要がある
	  for (var key : map.keySet()) {
		System.out.println(key);                                      
	  }                                                               //結果：Morning Glory
		                                                                      Rose
		                                                                      Sunflower
	  for (var value : map.values()) {
	    System.out.println(value);
	  }                                                               //結果：あさがお
	                                                                          バラ
	                                                                          ひまわり
	                                                                          
	  //もしくはentrySetメソッドでマップエントリー（Map.Entry）のセットで取得する
	  map.replace("Rose", "薔薇");
	  map.replace("Sunflower", "ひまわり", "向日葵");
	  for (var entry : map.entrySet()) {
	    System.out.println(entry.getKey() + ":" + entry.getValue());  
	  }                                                               //結果：Morning Glory:あさがお
	                                                                          Rose:薔薇
	                                                                          Sunflower:向日葵
	  */
	  
	  /*
	  var map = new TreeMap<String, String>();
	  map.put("Rose", "バラ");
      map.put("Sunflower", "ひまわり");
      map.put("Morning Glory", "あさがお");
	  for (var key : map.keySet()) {
	    System.out.println(key);
	  }                                                               //結果：Morning Glory
	                                                                          Rose
	                                                                          Sunflower
	  */

	  /*
	  //TreeMapではラムダ式に渡されたx、yを比較してx<yの場合は負数、x=yの場合は0、x>yの場合は正数を返す
	  //この例では戻り値として文字列長の差を求めることで、文字列長によって順序を決定する。
	  var data = new TreeMap<String, String>(
	    (x, y) -> x.length() - y.length()
	  );

//    var data = new TreeMap<String, String>(new Comparator<String>(){
//	    @Override
//	    public int compare(String x, String y) {
//	      return x.length() - y.length();
//	    }
//	  });
  
	  data.put("Rose", "バラ");
	  data.put("Sunflower", "ひまわり");;
	  data.put("Morning Glory", "あさがお");
	  System.out.println(data);                                       //結果：{Rose=バラ, Sunflower=ひまわり, Morning Glory=あさがお}
	  */

      /*
	  //配列をソート
	  var data = new String[] { "バラ", "ひまわり", "チューリップ", "さくら" };
	  Arrays.sort(data, (x, y) -> x.length() - y.length());
	  System.out.println(Arrays.toString(data));                     //結果：[バラ, さくら, ひまわり, チューリップ]

	  //リストをソート
	  var list = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "チューリップ", "さくら"));
	  list.sort((x, y) -> x.length() - y.length());
	  System.out.println(list);                                       //結果：[バラ, さくら, ひまわり, チューリップ]
	  */
		
	  /*
	  var data = new TreeMap<String, String>() {
	    {
	      put("peak", "高くなる");
	      put("peach", "もも");
	      put("peace", "1切れ");
	      put("piece", "平和");
	    }
	  };

	  var key = "pear";

	  if (data.containsKey(key)) {
	    System.out.println(key + "は" + data.get(key) + "です。");
	  } else {
	    System.out.print("検索中の単語は");
	    System.out.print(data.lowerKey(key) + "または");
	    System.out.print(data.higherKey(key));
	    System.out.println("ですか？");
	  }                                                               //結果：検索中の単語はpeakまたはpieceですか？
      */
		
	  var data = new LinkedHashMap<String, String>(10, 0.7f, true) {
	    {
	      put("aaa", "あいうえお");
	      put("bbb", "かきくけこ");
	      put("ccc", "さしすせそ");
	      put("ddd", "たちつてと");
	    }
	  };
	  System.out.println(data.get("ccc"));
	  System.out.println(data.get("aaa"));
	  System.out.println(data.get("bbb"));
	  System.out.println(data.get("ddd"));

	  System.out.println(data);
	}                           
	  
}

/*
  「マップ」は一意のキーと値のペアで管理されているデータ構造のことで、
  言語によってはディクショナリ、ハッシュ、連想配列と呼ぶ場合もある。
  リスト/セットと異なり、個々の要素に対してキーという意味のある情報でアクセス出来る点が特徴である。
  マップの主な実装にはHashMap、IdentityHashMap、WeakHashMap、LinkedHashMap、TreeMap、Hashtableがある。
*/

/*
  HashMapは最も基本的なマップの実装で最も利用する。キーの順序は保障されない。
  HashMapは内部的にはハッシュ表（ハッシュテーブル）と呼ばれる配列を持つ。
  要素を保存する際にキーからハッシュ値を求めることで、ハッシュ表のどこに値（オブジェクト）を保持するかを決定する。
  ハッシュ表は一般的には任意のサイズのハッシュ表を用意しておいて、ハッシュ値と表サイズのビット積によって格納先を決定する。
  また、そもそもハッシュ値は重複する可能性もあるので、リンクリスト、二本木などで管理する。
  
  HashMap利用の注意点
  1.hashCodeメソッドは適切に実行する
  「hashCodeメソッド」はオブジェクトのハッシュ値を求めるためのメソッドであり、以下の指針に沿う。
  ・同じ値のオブジェクトは同じハッシュ値を返すこと
  ・重複が発生しにくいよう、適切に分布していること
  ハッシュ表では値の重複が発生すると、リンク/ツリーをたどらなければならない分だけキー効率の効率が低下する。
  
  2.ハッシュ表のサイズを適切に設定する
  ハッシュ表のサイズも格納すべき要素数に対して十分に大きくしてあるべきである。
  小さなハッシュ表では格納先が重複する可能性が高まる。また、要素数が一定サイズを超えた場合にはハッシュ表の再割り当ても発生する。
  配列の再割り当てはオーバーヘッドの大きな処理なので、あらかじめ追加すべき要素数が想定できない場合には、
  インスタンス化に際して、初期値を宣言しておく。
  
  HashMapコンストラクター
  public HashMap([int initial [, float load]])
  initial:初期容量（規定は16）→インスタンス化に際して確保される初期容量
  load:不可係数（規定は0.75f）→ハッシュ表の再割り当てを行うための閾値を決める値
  例：
  var date = new HashMap<String, String>(30, 0.8F);
  
  例えば、HashMapでは初期容量の規定が16、不可係数が0.75fなので、要素数が16*0.75=12を超えたところで、再割り当てが発生する。
*/

/*
  HashMapクラスが順序を保証しないマップの実装であるのに対して、
  「TreeMap」はキーの順序を管理できるマップである。
  キーを「Red-Blackツリー（赤黒木）」で管理しキーの大小（辞書順、数値の大小等）で管理できる。
  ツリーの節点を「ノード」と呼び、1つのノードが持つ子ノードは最大でも2個である。
  ノード同士の大小関係が常に左の子ノード<現在のノード<右の子ノードとなるように配置される。
  それ以上の上位（親）ノードを持たないノードをルートノードという。
  
  TreeMapクラスは規定でキーとなる型の自然順序（文字列なら辞書順、数値ならば大小順）に従って要素の並びを決定する。
  もしも、標準の並び順を変更したい場合にはインスタンス化に際してラムダ式を渡すようにする。
*/

/*
  Arrayクラス、またはListインターフェースの「sortメソッド」は規定で配列/リストの内容を要素の規定のルールによってソートする。
  また、引数にラムダ式を指定することで、ソート規則を独自のものに置き換えることもできる。
  
  sortメソッド（Arraysクラス）
  public static <T> void sort(T[] a, Comparator<? super T> c)
  a:ソート対象の配列
  c:ソート規則
  
  sortメソッド（Listインターフェース）
  public void sort(Comparator<? super E> c)
  c:ソート規則
*/

/*
  「NavigableMapインターフェース」は指定されたキーそのものではなく、そのキーに最も近いキーを取得するためのメソッドを提供する。
  これを利用することで順番を持ったマップ内でのあいまい検索が可能になる。
*/

/*
  「LinkedHashMapクラス」はリンクリストでキーの順序を管理する。
  
  LinkedHashMapコンストラクター
  public LinkedHashMap([int initial [, float load [, boolean order]]])
  initial:初期容量
  load:負荷係数
  order:順序付けルール（true:アクセス順、false:挿入量（規定はfalse））
*/
