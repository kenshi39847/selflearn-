package to.msn.wings.selflearn.chap07.method;

public class Method {

	public static void main(String[] args) {
		var p = new Person();
		p.name = "山田太郎";
		p.age = 30;
		System.out.println(p.show());

	}

}

/*
クラスの動作/処理、ふるまいを表すための要素を「メソッド」という。
主に、クラスで管理されているデータ（フィールド）の値を操作するための役割を担う。
これまでのコードではmainメソッドの配下で記述していたが、これはアプリのエントリーポイントとなる特殊なメソッドで、
アプリを起動する際に自動的に呼び出されていた。
これに対して、一般的なメソッドは、他のメソッドから呼び出されることで実行される。

メソッドの定義
[修飾子] 戻り値の型 メソッド名([引数の型 引数,...]) [throws句] {
  ...メソッドの本体...
}
*/

/*
メソッド名は識別子の命名ルールに従うのはこれまでと同じである。
加えて、構文規則ではないが、メソッドとしての役割を把握できるような命名を意識する。
具体的にはaddElementのように「動詞 + 名詞」の形式で命名することをおすすめする。
例）メソッド名でよく利用する動詞
add,get,insert,begin,end,start,stop,remove,delete,set,open,close
*/
