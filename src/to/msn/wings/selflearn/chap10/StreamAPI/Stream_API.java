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
	  
	  /*
	  IntStream.of(-2, -5, 0, 3, -1, 2)
      .dropWhile(i -> i < 0)
      .forEach(System.out::println);
	  */
	  
	  /*
	  IntStream.of(-2, -5, 0, 3, -1, 2)
      .takeWhile(i -> i < 0)
      .forEach(System.out::println);
	  */
	  
	  /*
	  Stream.of("さかな", "あか", "こだま", "きんもくせい")
      .peek(System.out::println)
      .sorted()
      .forEach(System.out::println);
	  */
	  
	  /*
	  Stream.of("あか", "さかな", "あか", "こだま", "こだま")
      .distinct()
      .forEach(System.out::println);
	  */
	  
	  /*
	  Stream.of("バラ", "あさがお", "チューリップ", "さくら")
//    .parallel()
//    .forEachOrdered(v -> System.out.println(v));
	  .forEach(v -> System.out.println(v));
	  */
	  
	  /*
	  var str = Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら", "もも")
		        .filter(s -> s.startsWith("さ"))
		        .findFirst();
		      System.out.println(str.orElse("－"));

//		        .parallel()
//		        .filter(s -> s.startsWith("さ"))
//		        .findAny();
//		      System.out.println(str.orElse("－"));
	  */
	  
	  /*
	  System.out.println(
		        IntStream.of(1, 10, 5, -5, 12)
		          .allMatch(v -> v >= 0)
		          // .anyMatch(v -> v >= 0)
	  );
	  */
	  
	  /*
	  var list = Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら")
	      .filter(s -> s.startsWith("さ"))
	      .toArray();
	  System.out.println(list[0]);
	  */
	  
	  /*
	  var list = Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら")
	        .filter(s -> s.startsWith("さ"))
	        .collect(Collectors.toList());
	  System.out.println(list);
	  */
	  
	  /*
	  var str = Stream.of("めばる", "さんま", "ひらめ", "いわし", "ほっけ")
		        .min(Comparator.naturalOrder());
		      System.out.println(str.orElse(""));
	  */
	  
	  /*
	  System.out.println(
		        Stream.of("バラ", "あさがお", "チューリップ", "さくら")
		          .filter(s -> s.length() > 3)
		          .count()
		    );
	  */
	  
	  /*
	  var list = new int[] { 5, 1, 10, -3 };
	    System.out.println(IntStream.of(list).sum());
	    System.out.println(IntStream.of(list).average().orElse(0));
	  */
	  
	  /*
	  System.out.println(
		      Stream.of("バラ", "あさがお", "チューリップ", "さくら")
		        .sorted()
		        .reduce((result, str) -> {
		          return result + "," + str;
		        })
		        .orElse("")
		    );
	  */
	  
	  /*
	  System.out.println(
		      Stream.of("バラ", "あさがお", "チューリップ", "さくら")
		        .sorted()
		        // .parallel()
		        .reduce("ひまわり", (result, str) -> {
		          return result + "," + str;
		        })
		    );
	  */
	  
	  /*
	  System.out.println(
		      Stream.of("153", "211", "112", "350", "418", "208")
		        .parallel()
		        .reduce(0,
		          (result, value) -> {
		            return result + Integer.parseInt(value);
		          },
		          (result1, result2) -> {
		            return result1 + result2;
		          }
		      )
		    );
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
○先頭から条件を満たす間の値を除去する
「dropWhiteメソッド」を利用することで、条件式に合致している間、値をスキップする。
○先頭から条件を満たす間の値だけを取り出す
「takeWhiteメソッド」を利用し、先頭から条件を満たす間の値だけを処理する。
○ストリームの途中状態を確認する
「peekメソッド」を利用することで、ストリーム処理の途中で任意の処理を差し込むことができる。
○値の重複を除去する
「discountメソッド」を利用することで、ストリームに含まれる値の重複を除去できる。
*/

/*
「ストリームの終端処理」は、ストリーム処理によって加工/フィルターされた値を最終的に出力/集計する役割を担っている。
ストリームは終端処理の呼び出しをトリガーに最終的にまとめて処理されるため、終端処理は省略できない。
また、終端処理を終えたストリームを再利用することはできない。
再びストリーム処理を実施する際はストリームそのものをデータソースから再生成する。
○それぞれの要素を順に処理する
「forEachメソッド」を利用する。
○最初の値を取得する
「findFirstメソッド」を利用する。
○値が特定の条件を満たすかを判定する
|メソッド                                          |概要                              |
|boolean  anyMatch(Predicate<? super T> predicate) |条件式がtrueとなる要素が存在するか|
|boolean  allMatch(Predicate<? super T> predicate) |条件式がすべてtrueとなるか        |
|boolean  noneMatch(Predicate<? super T> predicate)|条件式がすべてtrueにならないか    |
○配列/コレクションに変換する
「toArrayメソッド」でストリーム処理の結果を文字列配列として取得する。
「iteratorメソッド」でイテレーターを取得する。
「collectメソッド」でコレクションに変換できる。
○最大値/最小値を求める
「min/maxメソッド」を利用する。引数には、比較ルール（Comparator型）を指定する。
戻り値はOptional型なので、値取り出しにはorElseメソッドを利用する。 
○要素の個数を求める
「countメソッド」を利用する。
○合計値/平均値を求める
「sum/averageメソッド」を利用する。
○ストリームの値を一つにまとめる
1.引数が1つの場合
「reduceメソッド」を利用する。
reduceメソッドは引数として、
・演算結果を格納するための変数
・個々の要素を受け取るための変数
を受け取る。
2.引数が2個の場合
以下の点に注意する。
・結果は非nullであることか明らかなので、非Optionalである。つまりOrElse経由ではなくても値は取得できる。
・並列ストリームでは、分散された分だけ、初期値がラムダ式に適用されるため。結果が変化する。
3.引数が3個の場合
Streamの要素型と、最終的な結果型が異なる場合などに用いる。
また、引数として
・演算結果を格納するための変数
・個々の要素を受け取るための変数
を受け取る点は同じだが、result/valueが異なる型でもかまわない点が異なる。
*/
