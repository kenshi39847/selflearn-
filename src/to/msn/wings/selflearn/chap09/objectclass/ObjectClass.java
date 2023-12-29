package to.msn.wings.selflearn.chap09.objectclass;

import java.util.Arrays;

public class ObjectClass {

	public static void main(String[] args) {
		/*
		//オブジェクトの文字列表現を取得する
		var p = new Person("太郎", "山田");
		System.out.println(p);
		*/
		
		/*
		var p = new Person("太郎", "山田");
	    var bp = new BusinessPerson("太郎", "山田", "営業");
	    System.out.println(p.equals(bp));
	    System.out.println(bp.equals(p));
	    */
		
		var data = new Person[] {
		      new Person("タロウ", "マツダ"),
		      new Person("リコ", "モリヤマ"),
		      new Person("コウスケ", "モリタ"),
		      new Person("マリコ", "モリヤ"),
		      new Person("ソウシ", "ムラカミ"),
		      new Person("エミ", "ヤマダ"),
		};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));

	}

}

/*
オブジェクトの文字列表現を取得するためには「toStringメソッド」を利用する。
toStringメソッドは、可能であるならばすべてのクラスに実装すべきである。適切な文字列表現（toStringメソッド）を用意することで、
ロギング/単体テストなどの局面でも、
System.out.println(obj);
とするだけで、オブジェクトの概要を確認できるというメリットがある。
*/

/*
オブジェクト同士が等しいかどうかを判定するには「equalsメソッド」を利用する。
Objectクラスが既定で用意しているequalsメソッドでは、同一性（=オブジェクト参照が同じオブジェクトを示していること）を
確認しているにすぎない。意味ある値としての等価を判定したい場合には、個別のクラスでequalsメソッドをオーバーライドする。
*/

/*
オブジェクトのハッシュ値（オブジェクトデータをもとに生成されたint値）を返すには「hashCodeメソッド」を利用する。
HashMap/HashSetなどのハッシュ表で値を正しく管理するための情報で同値のオブジェクトは同じハッシュ値を返すことが期待される。
equalsメソッドをオーバーライドした場合には、hashCodeメソッドもセットでオーバーライドすべきである。
*/

/*
オブジェクト同士を比較するためには「compareToメソッド」を利用する。
Arrays.sortメソッドによるオブジェクトのソートや、TreeMap/TreeSetによる順番付きキーの管理にも利用される。
Objectクラスではなく、Comparableインターフェイスに属するメソッドだが、値の大小意味を持ったクラスであれば実装するのが基本である。
*/
