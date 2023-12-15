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
基底クラスの同名フィールドを派生クラスで定義した場合、基底クラスのフィールドは派生クラスの同名のフィールドによって見えなくなる。
これをフィールドの「隠蔽」という。
データ型が異なっていても、名前が同じでさえあればフィールドは隠蔽される。
ただし、基底クラスのフィールドも見えなくなっているだけで、存在自体がなくなったわけではない。
予約変数superを用いることで隠蔽されたフィールドにアクセスすることも可能である。

○superキーワード（フィールド）
super.フィールド名
*/
