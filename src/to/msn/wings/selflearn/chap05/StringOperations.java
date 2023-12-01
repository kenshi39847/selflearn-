package to.msn.wings.selflearn.chap05;

public class StringOperations {

	public static void main(String[] args) {
		/*
		var str1 = "WINGSプロジェクト";
	    System.out.println(str1.length());  //結果：11

	    var str = "𠮟る";
	    System.out.println(str.codePointCount(0, str.length()));  //結果：2
	    */
		
		/*
	    var str = "def";
	    System.out.println(str.compareTo("abc"));  //結果：3
	    System.out.println(str.compareTo("def"));  //結果：0
	    System.out.println(str.compareTo("xyz"));  //結果：-20
	    System.out.println(str.compareToIgnoreCase("DEF"));  //結果：0
	    */
	    
		/*
	    var str = "Wings";
	    System.out.println(str.equals("WINGS"));  //結果：false
	    System.out.println(str.equalsIgnoreCase("WINGS"));  //結果：true
	    */
		
		/*
		var str1 = "";
	    var str2 = "いろはにほへと";
	    System.out.println(str1.isEmpty());  //結果：true
	    System.out.println(str2.isEmpty());  //結果：false
	    */
	    
		/*
	    var str1 = "";
	    var str2 = " 　  ";
	    System.out.println(str1.isEmpty());  //結果：true
	    System.out.println(str1.isBlank());  //結果：true
	    System.out.println(str2.isEmpty());  //結果：false
	    System.out.println(str2.isBlank());  //結果：true
	    */
	    
	    var str = "  Wings Project  ";
	    System.out.println(str.strip());  //結果：Wings Project
	    System.out.println(str.stripLeading());  //結果：Wings Project  
	    System.out.println(str.stripTrailing());  //結果：  Wings Project
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
  public int codePointCount(int begin, int end)
  begin:長さを求める開始位置
  end:長さを求める終了位置
*/

/*
  equalsメソッドはあくまで等しいかどうか比較するだけなので、辞書的な大小を比較するときは「compareToメソッド」を利用する。
  compareToメソッドは大文字/小文字を区別するが、
  区別しないで比較するときは「compareToIgnoreCaseメソッド」または「equalsIgnoreCaseメソッド」を利用する。
*/

/*
  compareTo/compareToIgnoreCaseメソッド
  public int compareTo(String str)
  public int compareToIgnoreCase(String str)
  str:比較する文字列
*/

/*
  文字列が空であるか判定するには「isEmptyメソッド」を利用する。
  さらに、空文字列もしくは空白だけかを判定する「isBlankメソッド」もある。
*/

/*
  文字列から前後の空白を除去するには、「stripメソッド」を利用する。
  また、文字列前方の空白だけを除去する「stripLeadingメソッド」、後方の空白だけを除去する「stripTrailingメソッド」を利用する。
*/
