package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.util.Locale;

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
	    
		/*
	    var str = "  Wings Project  ";
	    System.out.println(str.strip());  //結果：Wings Project
	    System.out.println(str.stripLeading());  //結果：Wings Project  
	    System.out.println(str.stripTrailing());  //結果：  Wings Project
	    */
		
		/*
		var str = "にわにはにわにわとりがいる";
	    System.out.println(str.indexOf("にわ"));  //結果：0
	    System.out.println(str.indexOf("にも"));  //結果：-1
	    System.out.println(str.lastIndexOf("にわ"));  //結果：6
	    System.out.println(str.indexOf("にわ", 3));  //結果：4
	    System.out.println(str.lastIndexOf("にわ", 3));  //結果：0
	    */
		
		/*
	    var str = "WINGSプロジェクト";
	    System.out.println(str.contains("プロ"));  //結果：true
	    System.out.println(str.startsWith("WINGS"));  //結果：true
	    System.out.println(str.startsWith("WINGS", 3));  //結果false
	    System.out.println(str.endsWith("WINGS"));  //結果：false
	    System.out.println(str.indexOf("プロ") > 0);  //結果：true(部分一致)
	    System.out.println(str.indexOf("WINGS") == 0);  //結果：true(前方一致)
	    */
	    
	    var str = "WINGSプロジェクト";
	    System.out.println(str.substring(5, 7));  //結果：プロ
	    // System.out.println(str.substring(5, 2));  //結果：エラー（begin > end なため）
	    // System.out.println(str.substring(-5));  //結果：エラー（beginが負数のため）
	    // System.out.println(str.substring(15));  //結果：エラー（文字列の末尾を超えるため）
	    
	    var mail = "yamada@example.com";
	    System.out.println(mail.substring(mail.lastIndexOf("@") + 1));  //結果：example.com
	    System.out.println(mail.charAt(0));  //結果：y
	    
	    var str1 = "うめ,もも,さくら";
	    var result1 = str1.split(",");
	    System.out.println(String.join("＆", result1));  //結果：うめ＆もも＆さくら

	    var str2 = "うめ,もも,さくらとあんず";
	    var result2 = str2.split("[,と]");
	    System.out.println(String.join("＆", result2));  //結果：うめ＆もも＆さくら＆あんず

	    var str3 = "うめ,もも,さくら";
	    var result3 = str3.split("");
	    System.out.println(String.join("＆", result3));  //結果：う＆め＆,＆も＆も＆,＆さ＆く＆ら

	    var str4 = "うめ,もも,さくら,あんず";
	    var result4 = str4.split(",", 3);
	    System.out.println(String.join("＆", result4));  //結果：うめ＆もも＆さくら,あんず

	    System.out.println(String.join(",", "うめ", "もも", "さくら"));  //結果：うめ,もも,さくら
	    
	    
	    
	    //シンプルなパターン
	    System.out.println(String.format(
	    	 "%sは%s、%d歳です。", "サクラ", "女の子", 1));  //結果：サクラは女の子、1歳です。
	    System.out.println(String.format(
	    	 "名前は%1$s、%3$d歳です。%1$sは、元気です。", "サクラ", "女の子", 1));  //結果：名前はサクラ、1歳です。サクラは、元気です。

	    //引数align（文字列の最小幅）を指定したパターン
	    System.out.println(String.format("%.2sです。", "サクラ"));  //結果：サクです。
	    System.out.println(String.format("%5sです。", "サクラ"));  //結果：  サクラです。
	    System.out.println(String.format("%-5sです。", "サクラ"));  //結果：サクラ  です。

	    //整数の場合
	    System.out.println(String.format("10進数 %08d", 12345));  //結果：10進数 00012345
	    System.out.println(String.format("16進数 %#x", 10));  //結果：16進数 0xa

	    //不動小数点の場合
	    System.out.println(String.format("小数点数 %.2f", 123.456));  //結果：小数点数 123.46
	    System.out.println(String.format("指数／小文字 %.2e", 123.456));  //結果：指数／小文字 1.23e+02
	    System.out.println(String.format("指数／大文字 %.2E", 123.456));  //結果：指数／大文字 1.23E+02

	    //日付/時刻の場合
	    var d = LocalDateTime.now();
	    System.out.println(String.format("%tF", d));  //結果：2023-12-02
	    System.out.println(String.format("%tr", d));  //結果：10:00:48 午前
	    System.out.println(String.format("%1$tY年 %1$tm月 %1$td日", d));  //結果：2023年 12月 02日

	    //ロケール（引数loc）を指定した場合
	    System.out.println(String.format(Locale.GERMAN, "%f", 1234.567));  //結果：1234,567000
	    System.out.println(String.format(Locale.GERMAN, "%tr", d));  //結果：10:00:48 VORM.

	    //printfメソッド
	    System.out.printf("%.2sです。\n", "サクラ");  //結果：サクです。

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

/*
  ある文字列の中で、特定の部分文字列が登場する文字列を取得するには「indexOf/lastIndexOfメソッド」を利用する。
  検索を前方から開始する場合は「indexOfメソッド」、検索を後方から開始する場合は「lastIndexOfメソッド」を利用する。
*/

/*
  indexOf/lastIndexOfメソッド
  public int indexOf(String str [,int index])
  public int lastIndexOf(String str [,int index])
  str:検索する部分文字列
  index:検索開始位置（先頭は0）
*/

/*
  文字列に指定された文字列が含まれるか判定するには「containsメソッド」を利用する。
  また、単に文字列が含まれるかだけではなく、ある文字列が先頭/末尾位置に位置するか（=文字列がある文字列で始まる/終わるか）を
  判定するならば、startsWith/endsWithメソッドも利用できる。
*/

/*
  contains/startsWith/endsWithメソッド
  public boolean contains(String s)
  public boolean startsWith(String prefix [,int offset])
  public boolean endsWith(String suffix)
  s:検索する文字列
  prefix:接頭辞
  offset:検索開始位置
  suffix:接尾辞
*/

/*
  元の文字列から部分的な文字列を取得するには「substringメソッド」を利用する。
*/

/*
  public String substring(int begin [,int end])
  begin:検索開始位置（先頭は0）
  end:検索終了位置
*/

/*
  文字列を特定の区切り文字で分割するには「splitメソッド」を利用する。
*/

/*
  splitメソッド
  public String[] split(String sep [,int count])
  sep:区切り文字
  count:最大の分割数
*/

/*
  文字列配列を特定の区切り文字で連結するには「joinメソッド」を利用する。
*/

/*
  joinメソッド
  public static String join(CharSequence sep, Iterable elems)
  public static String join(CharSequence sep, CharSequence... elems)
  sep:区切り文字（空の場合は文字列をそのまま連結）
  elems:連結する文字列
*/

/*
  指定された書式文字列に基づいて文字列を整形するには「formatメソッド」を利用する。
*/

/*
  formatメソッド
  public static String format([Locale loc,] String format, Object... args)
  loc:整形に利用するスクロール
  format:書式文字列
  args:書式に割り当てる値
*/

/*
  引数format（書式文字列）には「書式指定子」とよばれるプレイスホルダーを埋め込むことができる。
  「プレイスホルダー」とは引数args...で指定された文字列を埋め込む場所である。
*/

/*
  書式指定子
  %[index$][flag][align][.prec]conversion
  index:引数argsの何番目の値を埋め込むか（先頭は0番目）
  flag:出力形式
  align:出力する最小の文字数
  prec:桁数（意味はconversionによって異なる）
  conversion:（引数argsの型）
*/

/*
  引数conversionの主な値
  分類        |変換文字|概要
  一般        |b,B     |ブール地
              |h,H     |ハッシュコードを16進数に変換
              |s,S     |文字列
  文字        |c,C     |Unicode文字
  整数        |d       |10進整数
              |o       |8進整数
              |x,X     |16進整数
  不動小数点  |e,E     |浮動小数点数形式の10進数
              |f       |10進小数点数
  日付/時刻   |t,T     |日付/時刻変換文字の接頭辞
  パーセント  |%       |リテラル'%'(u0025)
  行区切り文字|n       |プラットフォーム固有の行区切り文字
*/
