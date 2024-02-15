package to.msn.wings.selflearn.chap10.StreamAPI;

public class Stream_API {

  public static void main(String[] args) {
	/*
    var list = new ArrayList<String>(Arrays.asList("ant", "elephant", "hamster"));
    list.
      stream().
      filter(s -> s.length() > 3).
      map(String::toUpperCase).
      forEach(System.out::println);
    */
	  /*
	  var list = new ArrayList<String>(Arrays.asList("ant", "elephant", "hamster"));
	    list.stream().forEach(System.out::println);
	    // list.parallelStream().forEach(System.out::println);
	    System.out.println("---------------");

	    var data = new String[] { "バラ", "あさがお", "チューリップ" };
	    Arrays.stream(data).forEach(System.out::println);
	    System.out.println("---------------");

	    var map = new HashMap<String, String>(
	        Map.of("orange", "みかん", "apple", "りんご", "strawberry", "いちご"));
	    map.entrySet().stream().forEach(System.out::println);
	    */
	  
	  /*
	  var stream = Stream.of("first", "second", "third");
	  stream.forEach(System.out::println);
	  */
	  
	  /*
	  var stream = Stream.iterate(1, (num) -> {
	      return num * 2;
	  });
	  stream.limit(10).forEach(System.out::println);
	  */
	  
	  /*
	  var builder = Stream.builder()
		        .add("いちじく")
		        .add("にんじん")
		        .add("さんしょ");
	  builder.build().forEach(System.out::println);
	  */
	  
	  /*
	  var stream1 = Stream.of("いちじく", "にんじん", "さんしょ");
	    var stream2 = Stream.of("しいたけ", "ごぼう", "むくろじゅ");
	    Stream.concat(stream1, stream2)
	  .forEach(System.out::println);
	  */
	  
	  /*
	  Stream.of(
		      "https://www.shoeisha.co.jp/",
		      "SEshop",
		      "https://codezine.jp/",
		      "https://wings.msn.to/",
		      "WingsProject"
		    )
		      .filter(s -> s.startsWith("https://"))
		      .forEach(System.out::println);
	  */
	  
	  /*
	  Stream.of("バラ", "あさがお", "チューリップ", "さくら")
	    .map(s -> s.length())
	    .forEach(System.out::println);

//	    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
//	    .mapToInt(s -> s.length())
//	    .forEach(System.out::println);
	  */
	   
	  
	  /*
	  var list = new String[][] {
      { "あいう", "かきく", "さしす" },
      { "たちつ", "なにぬ" },
      { "はひふ", "まみむ" }
    };
    Arrays.stream(list)
      .flatMap(v -> Arrays.stream(v))
      .forEach(System.out::println);

//    Arrays.stream(list)
//    .flatMap(v -> Arrays.stream(v).map(str -> str.substring(0, 1)))
//    .forEach(System.out::println);
	  */
	 
	  /*
	  Stream.of("バラ", "あさがお", "チューリップ", "さくら")
	    .sorted()
	    .forEach(System.out::println);

//	    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
//	    .sorted((str1, str2) -> str1.length() - str2.length())
//	    .forEach(System.out::println);

//	    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
//	    .sorted(Comparator.reverseOrder())
//	    .forEach(System.out::println);
 
      */
	  
	  /*
	  IntStream.range(1, 20)
      .skip(4)
      .limit(10)
      .forEach(System.out::println);
      */
	  
	  

  }
}

/*
「Stream API」は繰り返し処理をサポートするライブラリである。
コレクション、配列、ファイルなどのデータの集合体（データソース）から、個々の要素を取り出して、
これを処理の流れ（Stream）に引き渡すための仕組みを提供する。

Stream APIによる処理は大まかに以下の3つである。
・データソースからのストリーム生成
・抽出/加工などの中間処理
・出力/集計などの終端処理
*/

/*
○コレクション/配列から生成する
streamメソッドを利用することでコレクション/配列からストリームを生成できる。

○引数/ラムダ式からストリームを生成する
Streamクラスでは、ストリーム生成のためのファクトリーメソッドを提供している。
1.ofメソッド
指定された可変長引数をストリームに変換する。
2.generateメソッド
指定されたラムダ式の戻り値に対してストリームを生成する。
3.iterateメソッド
指定された初期値とラムダ式からストリームを生成する。
4.builderメソッド
ストリームを組み立てるためのStream.Buildrオブジェクトを生成する。
5.concatメソッド
複数のストリームを結合して、1つのストリームにまとめるこができる。
*/

/*
「ストリームの中間処理」は、ストリームを流れてくる値を加工/フィルターする役割を担っている。
○指定された条件で値をフィルターする
「filterメソッド」を利用することで、与えられたラムダ式がtrueを返した要素だけを残すことができる。
○与えられた値を加工する
「mapメソッド」を利用することで、引数のラムダ式は引数としてストリームを流れる要素を受け取り、
演算（加工）した結果を返す。
○与えられた要素を加工する
「flatMap/flatMpaToXxxxxメソッド」を利用し、変換結果をStream型で返す。
個々の要素で返されたStreamは最終的に結合して返される。
○要素を並び替える
「sortedメソッド」を利用することで、要素の順序をソートできる。
○m～n番目の要素を取り出す
「skip/limitメソッド」を利用する。skipはm番目までの要素を、limitはn+1番目以降の要素をそれぞれ切り捨てる。
*/
