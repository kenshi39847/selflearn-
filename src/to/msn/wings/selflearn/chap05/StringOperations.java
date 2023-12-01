package to.msn.wings.selflearn.chap05;

public class StringOperations {

	public static void main(String[] args) {
		var str1 = "WINGSプロジェクト";
	    System.out.println(str1.length());  //結果：11

	    var str = "𠮟る";
	    System.out.println(str.codePointCount(0, str.length()));  //結果：2
	}

}

/*
  文字列の長さ（文字数）を取得するには「lengthメソッド」を利用する。
  lengthメソッドは日本語（マルチバイト文字）も1文字としてカウントする。
*/

/*
  var str2 = "𠮟る";
  System.out.println(str2.length());  //結果：3
  上記は「叱」が「サロゲートペア」であることから生じる問題である。
  一般的にUnicodeは1文字を2バイトで表現するが、Unicodeで扱うべき文字が増えるに従って、2バイトで表現できる文字数では不足する
  状況が出てきた。そこで、一部の文字を4バイトで表現することで扱える文字数を拡張することになった。これを「サロゲートペア」という。
  サロゲートペアを含んだ文字列を正しくカウントするには「PointContメソッド」を利用する。
*/

/*
  codePointCountメソッド
  public int codePointCount(int 長さを求める開始位置, int 佐賀差を求める終了位置)
*/
