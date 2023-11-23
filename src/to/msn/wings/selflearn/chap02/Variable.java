package to.msn.wings.selflearn.chap02;

public class Variable {

	public static void main(String[] args) {
		final double TAX = 1.08;
		int price = 1000;
		double sum = price * TAX;
		System.out.println(sum);	}
}

/*
  変数の宣言
  データ型 変数名 [= 初期値] [,...]
  データ型とは、変数に格納できる値の種類を表す情報である。
  int data;
  上記は「int（整数）値を入れるための、dataという名前の変数を準備する」という意味である。
  また、変数を宣言する際にまとめて初期値を設定することができる。
  int data1 = 108;
  String message = "こんにちは、世界";
*/

/*
  「識別子」とは名前のことで、変数やクラス、メソッドなどのプログラムに登場するすべての要素には何らかの名前を持っている。
*/

/*
  「識別子」のルール
  1.すべてUnicode文字を利用できる
  2.1文字目は数字以外であること
  3.アルファベットの大文字・小文字は区別される
  4.予約語でないこと
  5.文字数の制限はない
*/

/*
  定数の宣言
  final データ型 定数名 = 値
*/
