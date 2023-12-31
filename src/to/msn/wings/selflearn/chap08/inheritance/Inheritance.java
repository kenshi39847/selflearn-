package to.msn.wings.selflearn.chap08.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		/*継承の基本
		var bp = new BusinessPerson();
	    bp.name = "山田太郎";
	    bp.age = 30;
	    System.out.println(bp.show());
	    System.out.println(bp.work());
	    */
		
		/*フィールドの隠蔽
		var bp = new BusinessPerson();
	    System.out.println(bp.birth);
	    bp.show();

	    Person p = new BusinessPerson();
	    System.out.println(p.birth);
	    */

		/*オーバーライド
		var bp = new BusinessPerson();
	    bp.name = "山田太郎";
	    bp.age = 30;
	    System.out.println(bp.show());
	    System.out.println(bp.work());
	    */
		
		/*super
		var ebp = new EliteBusinessPerson();
	    ebp.name = "山田太郎";
	    ebp.age = 30;
	    System.out.println(ebp.work());
		*/
		
		/*派生クラスのコンストラクラー
		var c = new MyChild();
		*/
		
		Person p1 = new Person();
		System.out.println(p1.getClass());
		Person p2 = new BusinessPerson();
		System.out.println(p2.getClass());
	}	

}

/*
元になるクラスのメンバーを引き継ぎながら、新たな機能を加えたり、元の機能を上書きしたりする仕組みのことを「継承」という。
このとき、継承元となるクラスのことを「基底クラス（=スーパークラス、親クラス）」、
継承してできたクラスを「派生クラス（=サブクラス、子クラス）」という。

継承の一般的な構文は、一般的なクラス宣言に加えて、「extends」キーワードで継承元のクラス（基底クラス）を指定する。
○クラスの継承
[修飾子] class 派生クラス名 extends 基底クラス名 {
  ...派生クラスの定義...
}
extends句を省略した場合、暗黙的にObjectクラスを継承したと見なされる。
*/

/*
継承ではメンバーを変更する場合、メンバーによって可否が変化する。具体的には、
・隠蔽・・・フィールド、入れ子のクラス/インターフェース
・オーバーライド・・・メソッド
の2つがある。

基底クラスの同名フィールドを派生クラスで定義した場合、基底クラスのフィールドは派生クラスの同名のフィールドによって見えなくなる。
これをフィールドの「隠蔽」という。
データ型が異なっていても、名前が同じでさえあればフィールドは隠蔽される。
ただし、基底クラスのフィールドも見えなくなっているだけで、存在自体がなくなったわけではない。
予約変数superを用いることで隠蔽されたフィールドにアクセスすることも可能である。

○superキーワード（フィールド）
super.フィールド名
*/

/*
基底クラスで定義されたメソッドを派生クラスで上書きするという仕組みを「オーバーライド」という。
メソッドがオーバーライドであるための条件は以下のとおりである。
○オーバーライドの条件
|項目          |条件                                                         |
|メソッド名    |完全に一致していること                                       |
|仮引数        |データ型/個数が一致していること（名前は不一致でもかまわない）|
|戻り値        |型が一致しているか、派生型であること                         |
|アクセス修飾子|一致しているか、基底型のそれよりも緩いこと                   |
|throw句       |一致しているか、派生型であること                             |
*/

/*
オーバーライドでは基底クラスの機能を完全に書き換えることができる。しかし、基底クラスでの処理を引き継ぎつつ、
派生クラスでは差分の処理だけを追加したいということもあるため、予約変数「super」を用いることでこれを解決できる。
○superキーワード（メソッド）
super.メソッド名(引数, ...) 
*/

/*
クラスが継承された場合のコンストラクラーの挙動は、メソッドとは異なる。
なぜなら、コンストラクラーはメソッドのように派生クラスには引き継がれないからである。
*/

/*
継承/オーバーライドを禁止するのは、「final修飾子」を利用する。
final修飾子を付与することは、継承/オーバーライドの範囲を明確にするだけではなく、
コードの可読性の改善、コンパイラーによる最適化がより適切になる等の効果もある。
*/

/*
参照型の変換については基本型と同じく型変換は可能で、基本型よりもシンプルである。
派生クラスから基底クラスへの変換を「アップキャスト」という。
アップキャストにおいて、派生クラスでは基本クラスのすべてのメンバーを保障する。
よって派生クラスのインスタンスは基底クラスのインスタンスとして利用でき、
派生クラスから基底クラスへの型変換では特別な宣言を要せず暗黙的に実施できる。
例）
Person bp = new BusinessPerson();
派生クラスBusinessPersonは、基底クラスPersonとしてもふるまえるので、BusinessPersonオブジェクトをPerson型の変数に代入できる。

一方、基底クラスから派生クラスへの変換を「ダウンキャスト」という。
派生クラスは、基底クラスのメンバーに加えて独自のメンバーを追加している可能性があるので、
ダウンキャストが常に可能とは限らない。つまり、基底クラスが常に派生クラスとしてふるまえるわけではない。
よって、ダウンキャストではキャスト構文を用いて明示的に型を変換しなければならない。
例）
Person p = new BusinessPerson();
BusinessPerson bp = (BusinessPerson)p;
*/

/*
ダウンキャスト時にはあらかじめオブジェクトの型をチェックするべきで、これを行うのが「instanceof演算子」である。
instanceof演算子は、変数に格納されたオブジェクトの型が、指定の型に変換できる場合にtrueを返す。
○instanceof演算子
変数 instanceof 型
例）
Person p = new BusinessPerson();
BusinessPerson bp = (BusinessPerson)p;
if (p instanceof Student) {
  Student st = (Student)p;
  ...正しくキャストできた場合の処理...
}

オブジェクトの型を取得するgetClassメソッドもある。
*/
