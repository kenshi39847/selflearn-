package to.msn.wings.selflearn.chap09.objectclass;

public class ObjectClass {

	public static void main(String[] args) {
		//オブジェクトの文字列表現を取得する
		var p = new Person("太郎", "山田");
		System.out.println(p);

	}

}

/*
オブジェクトの文字列表現を取得するためには「toStringメソッド」を利用する。
toStringメソッドは、可能であるならばすべてのクラスに実装すべきである。適切な文字列表現（toStringメソッド）を用意することで、
ロギング/単体テストなどの局面でも、
System.out.println(obj);
とするだけで、オブジェクトの概要を確認できるというメリットがある。
*/
