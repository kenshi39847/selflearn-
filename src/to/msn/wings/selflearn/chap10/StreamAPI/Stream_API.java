package to.msn.wings.selflearn.chap10.StreamAPI;

import java.util.stream.Stream;

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
	  
	  var stream1 = Stream.of("いちじく", "にんじん", "さんしょ");
	    var stream2 = Stream.of("しいたけ", "ごぼう", "むくろじゅ");
	    Stream.concat(stream1, stream2)
	  .forEach(System.out::println);
	  
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