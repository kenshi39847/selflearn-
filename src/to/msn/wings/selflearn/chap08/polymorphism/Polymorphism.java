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
