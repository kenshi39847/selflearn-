/* [2] 正規表現を利用して、文字列「お問い合わせはsupport@example.comまで」のメールアドレス部分を、
       <a href="mailto:メールアドレス">メールアドレス</a>
       で置き換えてみましょう。なお、メールアドレスは正規表現で、
       「[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(?:\\.[a-z0-9-]+)*」と表すものとする。 */
package to.msn.wings.selflearn.chap05;

public class Chap05Practice2_2 {

	public static void main(String[] args) {
		var str = "お問い合わせはsupport@example.comまで" ;
		System.out.println(str.replaceAll("[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(?:\\.[a-z0-9-]+)*", "<a href=\"mailto:$0\">$0</a>"));

	}

}
