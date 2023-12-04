package to.msn.wings.selflearn.chap05;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateAndTimeOperations {

	public static void main(String[] args) {
		/*
		System.out.println(LocalDateTime.now());  //結果：2023-12-04T16:17:04.657439900
	    System.out.println(OffsetDateTime.now());  //結果：2023-12-04T16:17:04.659439900+09:00
	    System.out.println(ZonedDateTime.now());  //結果：2023-12-04T16:17:04.660439500+09:00[Asia/Tokyo]
	    System.out.println(LocalDate.now());  //結果：2023-12-04
	    System.out.println(LocalTime.now());  //結果：16:17:04.660439500
	    */
		
		/*
		//LocalDateTimeの生成
		var ldt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 513);
	    var ldt2 = LocalDateTime.of(2019, Month.JANUARY, 10, 10, 20, 30);
	    //var ldt3 = LocalDateTime.of(2019, 1, 40, 10, 20, 30);
	    System.out.println(ldt1);  //結果：2019-01-10T10:20:30.000000513
	    System.out.println(ldt2);  //結果：2019-01-10T10:20:30
	    //System.out.println(ldt3);  //結果：エラー

	    //LocalDate/LocalTimeの生成
	    var ld = LocalDate.of(2019, 1, 10);
	    System.out.println(ld);  //結果：2019-01-10
	    var lt = LocalTime.of(10, 20, 30);
	    System.out.println(lt);  //結果：10:20:30
	    var ldt4 = LocalDateTime.of(ld, lt);
	    System.out.println(ldt4);  //結果：2019-01-10T10:20:30

	    //OffsetDateTimeの生成
	    var odt = OffsetDateTime.of(2019, 1, 10, 10, 20, 30, 999, ZoneOffset.ofHours(9));
	    System.out.println(odt);  //結果：2019-01-10T10:20:30.000000999+09:00
	    var ot = OffsetTime.of(10, 20, 30, 999, ZoneOffset.ofHours(9));
	    System.out.println(ot);  //結果：10:20:30.000000999+09:00

	    //ZonedDateTimeの生成
	    var zdt = ZonedDateTime.of(2019, 1, 10, 10, 20, 30, 999, ZoneId.of("Asia/Tokyo"));
	    System.out.println(zdt);  //結果：2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]
	    */
		
		System.out.println(LocalDate.parse(
		        "2019-01-10", DateTimeFormatter.ISO_DATE));  //結果：2019-01-10
		    System.out.println(LocalDate.parse(
		        "2019-123", DateTimeFormatter.ISO_ORDINAL_DATE));  //結果：2019-05-03
		    System.out.println(LocalDate.parse(
		        "2019-W40-5", DateTimeFormatter.ISO_WEEK_DATE));  //結果：2019-10-04
		    System.out.println(ZonedDateTime.parse(
		      "2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]",
		      DateTimeFormatter.ISO_DATE_TIME));  //結果：2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]

	}

}

/*
  Date-Time APIの主なクラス
  日時          |日付     |時刻       |時差|地域|概要
  LocalDateTime |LocalDate|LocalTime  | × | × |ローカル日時
  OffsetDateTime|    -    |OffsetTime | ○ | × |時差情報付きの日時
  ZonedDateTime |    -    |     -     | ○ | ○ |時差/地域固有の情報付きの日時
*/

/*
  Date-Time APIではオブジェクトを生成/初期化するための様々な方法がある。
  1.現在の日付/時刻から生成する
  「nowメソッド」を利用する。XxxxxDateでは日付だけを、XxxxxTimeでは時刻だけをそれぞれ返す。
  2.指定された年月日、時分秒から生成する
  「ofメソッド」を利用する。ただし、LocalXxxxx、OffsetXxxxx、ZonedDateTimeクラスでそれぞれ指定できる引数が異なる。
  3.日付/時刻文字から変換する
  「parseメソッド」を利用する。
  public static T parse(CharSequence text [, DateTimeFormatter formatter])
  T:日付/時刻のオブジェクト
  text:解析対象の日付/時刻文字列
  formatter:解析に利用するフォーマッター
*/
