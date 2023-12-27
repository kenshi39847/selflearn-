package to.msn.wings.selflearn.chap08.polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		//Shape型の変数に対してTriangel/Rectriangle型オブジェクトを代入
		Shape tri = new Triangle(10, 50);
		Shape rec = new Rectangle(10, 50);
		//getAreaメソッドを呼び出し
		System.out.println(tri.getArea());
		System.out.println(rec.getArea());

	}

}

/*
「ポリモーフィズム」は多様性と訳されるが、要は同じ名前のメソッドで異なる挙動を実現することを言う。
基底/派生クラスいずれかのメソッドが呼び出されるのを決めるのは、変数の型ではなく、オブジェクトの型である（この性質をポリモーフィズムという）。
ポリモーフィズムを利用することで、異なる機能を同じ名前で呼び出せるので保守に優れる、開発者が理解しやすいというメリットがある。
*/

/*
それ自体は中身（機能）をもたない空のメソッドのことを「抽象メソッド」という。また、この抽象メソッドを含んだクラスのことを
「抽象クラス」という。抽象クラスを継承したクラスはすべての抽象メソッドをオーバーライドしなければならない。
public abstract class Shape {
  ...中略...
  public abstract double getArea();
}

○抽象メソッド（abstract修飾子）
[アクセス修飾子] abstract 戻り値の型 メソッド名(引数の型, 引数名, ...);

同じく、抽象メソッドを含んだクラスには、明示的にabstract修飾子を付加しなければならない。
○抽象クラス（abstract修飾子）
[アクセス修飾子] abstract class クラス名 {
  ...クラスの定義...
}
*/
