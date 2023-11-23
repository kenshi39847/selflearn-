package to.msn.wings.selflearn.chap01;  //パッケージ宣言

import java.time.LocalDateTime;  //import宣言

public class Hello {  //クラス宣言（開始）

	public static void main(String[] args) {  //メソッド宣言（開始）
		LocalDateTime time = LocalDateTime.now();  //命令文
		System.out.println(time);  //命令文
	}  //メソッド宣言（終了）

}  //クラス宣言（終了）

/*
  アプリの中で特定の機能を担うかたまりを「クラス」という。
  例えば文字列であれば、Stringというクラスによって表現、平方根や絶対値などの数学機能はMathというクラスでまとめられる。 
 */

/*
  class{...}配下に含まれる要素のことを「メンバー」という。メンバーの中にはフィールド、メソッド、コンストラクターなど、様々な要素がある。
  クラスの機能を表すためのメンバーを「メソッド」という。アプリで実行すべき処理を表す。 
  一般的にメソッドは自由に命名できるが、「main」はできない。理由はアプリを起動したときにまずmainメソッドを探して実行するからである。
  mainメソッドのことを「エントリーポイント」という。
*/

/*
  {...}で囲まれた部分を「ブロック」という。ブロックが表すものは、その時々で変化する。
  例えば、上記ではメソッドの外側を表すので、メソッドで実行すべき命令（群）を列挙していく。
  他にも、ブロックは入れ子にすることもできる。下記のような意味のないコードでも構文としては正しい。
  public static void main(String[] args) {
    {{{{{}}}}}  
  }
*/

/*
  個々の指示を表すものを「命令文（単に文ともいう）」という。
*/

/*
  クラスを分類するための入れ物を「パッケージ」という。
*/

/*
  クラスは、正確には「パッケージ名+クラス名」で識別する。
  例えば、to.msn.wings.selflearn.chap01パッケージに属するHelloクラスであれば、「to.msn.wings.selflearn.chap01.Hello」と表現できる。
  このような表現の仕方を「完全修飾名（FQCN:Fully Qualified Class Name）」という。
  しかし、プログラムを記述する際に完全修飾名で表すのは冗長なので、「import命令」を使う。
  例えば、「import java.time.LocalDateTime; 」で「このコードではjava.timeパッケージのLocalDateTimeクラスを利用する」とあらかじめ宣言しておく。
  これによって「java.time.」を省略した「LocalDateTime」という表記が許され、これを「名前の解決」という。
*/