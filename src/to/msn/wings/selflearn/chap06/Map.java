package to.msn.wings.selflearn.chap06;

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
      
      //キー/値を列挙するには、keySet/valuesメソッドでキー/値のセットを取り出す必要がある。
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
	                                                                          
	  //もしくはentrySetメソッドでマップエントリー（Map.Entry）のセットで取得する。
	  map.replace("Rose", "薔薇");
	  map.replace("Sunflower", "ひまわり", "向日葵");
	  for (var entry : map.entrySet()) {
	    System.out.println(entry.getKey() + ":" + entry.getValue());  
	  }                                                               //結果：Morning Glory:あさがお
	                                                                          Rose:薔薇
	                                                                          Sunflower:向日葵
	  */
		

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
