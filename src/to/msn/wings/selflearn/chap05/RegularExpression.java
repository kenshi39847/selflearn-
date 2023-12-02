package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		var tel = new String[] { "080-0000-0000", "084-000-0000", "184-0000" };
	    var rx = "\\d{2,4}-\\d{2,4}-\\d{4}";
	    for (var t : tel) {
	      System.out.println(Pattern.matches(rx, t) ? t : "アンマッチ");
	      // System.out.println(t.matches(rx) ? t : "アンマッチ");
	    }

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

/*
  正規表現パターンが文字列にマッチしているかを判定するには、「Patternクラス(Java.util.regexパッケージ)のmatches静的メソッド」を利用する。
  パターンが文字列全体に一致（=完全一致）する場合だけtrueを返します。
*/

/*
  matchesメソッド
  public static boolean matches(String regex, CharSequence input)
  regex:正規表現
  input:検索する文字列
*/
