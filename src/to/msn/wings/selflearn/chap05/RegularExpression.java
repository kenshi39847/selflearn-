package to.msn.wings.selflearn.chap05;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

/*
  あいまいな文字列パターンを表現するための記法を「正規表現」という。
  また、正規表現によって表された文字列パターンのことを「正規表現パターン」という。
  与えられた正規表現パターンがある文字列の中に含まれる場合、文字列が正規表現パターンに「マッチする」という。
*/

/*
  正規表現パターンの基本
  XYZ    |[XYZ]という文字列
  [XYZ]  |X,Y,Zいずれかの1文字
  [^XYZ] |X,Y,Z以外のいずれかの1文字
  [X-Z]  |X～Zの範囲の中の1文字
  [X|Y|Z]|X,Y,Zのいずれか
*/
