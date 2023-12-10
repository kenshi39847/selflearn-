package to.msn.wings.selflearn.chap07;

public class Field {
	
	public static void main(String[] args) {
		//p1と定義したもの（nameとage）をPersonに入れ込む、また、「.」を使用することで、p1のname、p1のageとすることができる
		//new演算子によってインスタンス化されたオブジェクトは、それぞれ独立した実態を持つ
		var p1 = new Person();
	    p1.name = "山田太郎";
	    p1.age = 30;

	    var p2 = new Person();
	    p2.name = "鈴木花子";
	    p2.age = 25;

	    System.out.printf("%s（%d歳）\n", p1.name, p1.age);
	    System.out.printf("%s（%d歳）\n", p2.name, p2.age);	

	}

}

/*
class{...}の直下で定義された変数を「フィールド」という。メンバー変数とも呼ばれ、クラスで管理すべき情報を表す。
フィールド構文は変数の構文とほぼ同じだが、
・先頭に修飾子を付与できる
・varキーワードは利用できない
などの点が異なる。

フィールドの定義
[修飾子] データ型 フィールド名 [=値]
例）Personクラスの配下でString型のname、int型のgaeフィールドを定義
public class Person {
  public String name;
  public Int age;
}
*/

/*
フィールドで利用できる主な修飾子
|修飾子   |概要                                                                |
|public   |すべてのクラスからアクセス可能                                      |
|protected|現在のクラスと派生クラス、同じパッケージのクラスからのみアクセス可能|
|private  |現在のクラスからのみアクセス可能                                    |
|static   |クラスフィールドを宣言                                              |
|final    |再代入を禁止                                                        |
|transient|シリアライズの対象から除外                                          |
|volatile |値のキャッシュを抑制                                                |

アクセス修飾子を省略した場合、パッケージプライベート（同じパッケージのクラスから）のみアクセス可能となる。
*/

/*
メソッドの中で宣言された変数（ローカル変数）とフィールドで異なる点は、
・先頭に修飾子を付与できる
・varキーワードは利用できない
それ以外にもう一つあり、
・ローカル変数は既定値を持たないのに対して、フィールドにはある
という点で、既定値はフィールドのデータ型によって決まる。

フィールドの既定値
|データ型           |既定値|
|boolean            |false |
|byte,short,int,long|0     |
|float,double       |0.0   |
|char               |\u0000|
|参照型             |null  |
*/
