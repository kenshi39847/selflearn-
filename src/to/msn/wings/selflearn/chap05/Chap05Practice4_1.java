/* [1] String/LocalDateTimeクラスを利用して、以下のようなコードを書いてみましょう。 
       1.文字列「となりのきゃくはよくきゃくくうきゃくだ」の最後に登場する「きゃく」の位置を検索する。
       2.文字列「～の気温は～℃です」という書式文字列に「千葉」「17.256」という数値を埋め込む。
       3.文字列「彼女の名前は花子です」に含まれる「彼女」を「妻」に置き換える。
       4.現在の日時を基点に5日と6時間後の日時を求める。
       5.2020/03/12から2020/11/05までの差を「～カ月～日間」の形式で出力する。
       */
package to.msn.wings.selflearn.chap05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Chap05Practice4_1 {

	public static void main(String[] args) {
		// 1.
		var str1 = "となりのきゃくはよくきゃくくうきゃくだ";
		System.out.println(str1.lastIndexOf("きゃく"));
		
		// 2.
		var locale = "千葉";
		var temp = 17.256;
		System.out.println(String.format("%sの気温は%2f℃です", locale, temp));
		
		// 3.
		var intro = "彼女の名前は花子です";
		System.out.println(intro.replace("彼女", "妻"));
		
		// 4.
		var dt = LocalDateTime.now();
		System.out.println(dt.plus(Duration.parse("P5DT6H")));
		
		// 5.
		var dt1 = LocalDate.of(2020, 3, 12);
		var dt2 = LocalDate.of(2020, 11, 5);
		var period = Period.between(dt1, dt2);
		System.out.println("日付の差：" + period.getMonths() + "カ月" + + period.getDays() + "日間");

	}

}
