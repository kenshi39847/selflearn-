package to.msn.wings.selflearn.chap08.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		var bp = new BusinessPerson();
	    bp.name = "山田太郎";
	    bp.age = 30;
	    System.out.println(bp.show());
	    System.out.println(bp.work());

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
