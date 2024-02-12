package to.msn.wings.selflearn.chap10.StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;

public class Stream_API {

	public static void main(String[] args) {
		var list = new ArrayList<String>(Arrays.asList("ant", "elephant", "hamster"));
	}
	
	list.
	stream().
	filter(s -> s.length() > 3).
	map(String::toUpperCase).
	forEach(System.out::println);

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