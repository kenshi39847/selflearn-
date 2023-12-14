/* [1] 正規表現検索を利用して、文字列「住所は〒160-0000 新宿区南町0-0-0です。\nあなたの住所は〒210-9999 川崎市北町1-1-1ですね。」
       から郵便番号だけを取り出してみましょう。 */
package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class Chap05Practice2_1 {

	public static void main(String[] args) {
		var str = "住所は〒160-0000 新宿区南町0-0-0です。\nあなたの住所は〒210-9999 川崎市北町1-1-1ですね。";
		var ptn = Pattern.compile("(\\d{3}-\\d{4})");
		var match = ptn.matcher(str);
		while(match.find()) {
			System.out.println(match.group());
		}

	}

}
