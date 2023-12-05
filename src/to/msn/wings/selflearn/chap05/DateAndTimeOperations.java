package to.msn.wings.selflearn.chap05;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;


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
		
		/*
		System.out.println(LocalDate.parse(
		        "2019-01-10", DateTimeFormatter.ISO_DATE));  //結果：2019-01-10
		System.out.println(LocalDate.parse(
		        "2019-123", DateTimeFormatter.ISO_ORDINAL_DATE));  //結果：2019-05-03
		System.out.println(LocalDate.parse(
		        "2019-W40-5", DateTimeFormatter.ISO_WEEK_DATE));  //結果：2019-10-04
		System.out.println(ZonedDateTime.parse(
		        "2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]",
		        DateTimeFormatter.ISO_DATE_TIME));  //結果：2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]
		*/
		
		/*
		var dt1 = LocalDateTime.of(2018, 12, 31, 10, 20, 30);
	    var dt2 = LocalDateTime.of(2019, 1, 10, 10, 20, 30);

	    System.out.println(dt1.equals(dt2));  //結果：false
	    System.out.println(dt1.isBefore(dt2));  //結果：true
	    System.out.println(dt1.isAfter(dt2));  //結果：false
	    */
		
		/*
		var dt = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 123);
	    System.out.println(dt.getYear() + "年" +
	      dt.getMonthValue() + "月" +
	      dt.getDayOfMonth() + "日 " +
	      dt.getDayOfWeek() + " " +
	      dt.getHour() + "時" +
	      dt.getMinute() + "分"
	      + dt.getSecond() + "秒"
	      + dt.getNano() + "ナノ秒");  //結果：2019年1月10日 THURSDAY 10時20分30秒123ナノ秒
	    System.out.println("月名は" + dt.getMonth() +
	      " 今年" + dt.getDayOfYear() + "日目");  //結果：月名はJANUARY 今年10日目
	    */
		
		/*
		var dt = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 123);
	    var week = new String[] {
	        "日曜日", "月曜日", "火曜日", "水曜日",
	        "木曜日", "金曜日", "土曜日"};

	    System.out.println(dt.get(ChronoField.YEAR) + "年" +
	        dt.get(ChronoField.MONTH_OF_YEAR) + "月" +
	        dt.get(ChronoField.DAY_OF_MONTH) + "日" +
	        week[dt.get(ChronoField.DAY_OF_WEEK) -1] + " "+
	        dt.get(ChronoField.HOUR_OF_DAY) + "時" +
	        dt.get(ChronoField.MINUTE_OF_HOUR) + "分" +
	        dt.get(ChronoField.SECOND_OF_MINUTE) + "秒" +
	        dt.get(ChronoField.NANO_OF_SECOND) + "ナノ秒");  //結果：2019年1月10日水曜日 10時20分30秒123ナノ秒
	    */
	    
		/*
	    var dt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30);
	    var dt2 = ZonedDateTime.of(2019, 1, 10, 10, 20, 30, 0, ZoneId.of("Asia/Tokyo"));

	    System.out.println(dt1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));  //結果：2019年1月10日木曜日
	    System.out.println(dt2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));  //結果：2019年1月10日 10:20:30 JST
	    System.out.println(dt1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));  //結果：2019/01/10
	    System.out.println(dt2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));  //結果：2019/01/10 10:20
	    */
		
		/*
		var dt1 = LocalDateTime.of(2019, 1, 1, 10, 20, 30);
	    var dt2 = ZonedDateTime.of(2019, 1, 1, 10, 20, 30, 0, ZoneId.of("Asia/Tokyo"));
	    System.out.println(dt1.format(DateTimeFormatter.ofPattern("y.MM.dd H:m:s")));  //結果：2019.01.01 10:20:30
	    System.out.println(dt2.format(DateTimeFormatter.ofPattern("Y年L月d日（E）a K時m分s秒 (z)")));  //結果：2019年1月1日（火）午前 10時20分30秒 (JST)
	    */
		
		/*
		var locale = Locale.JAPAN;
	    // var locale = Locale.US;
	    var zone = ZoneId.of("Asia/Tokyo");
	    // var zone = ZoneId.of("America/Chicago");
	    var dt = ZonedDateTime.of(LocalDateTime.now(), zone);

	    System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(
	      FormatStyle.FULL).withLocale(locale)));  //結果：2023年12月5日火曜日 12時24分05秒 日本標準時
	    System.out.println(dt.format(DateTimeFormatter.ofPattern(
	      "Y年L月d日（E）a K時m分s秒 (z)", locale)));  //結果：2023年12月5日（火）午後 0時24分5秒 (JST)
	    */
	    
	    var dt1 = LocalDateTime.of(2018, 12, 31, 0, 0, 0);
	    var dt2 = LocalDateTime.of(2020, 3, 3, 10, 20, 30);

	    var period = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
	    System.out.println("日付の差：" +
	      period.getYears() + "年" + period.getMonths() + "ヶ月" +
	      period.getDays() + "日間");  //結果：日付の差：1年2ヶ月3日間

	    var duration = Duration.between(dt1, dt2);
	    System.out.println("時間の差：" + duration.toHours() + "時間");  //結果：時間の差：10282時間
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

/*
  日付/時刻同士（dt1/dt2）を比較するには、「equals/isBefore/isAfterメソッド」を利用する。
  isBeforeはdt1<dt2であるか、isAfterはdt1>dt2であるかを判定する。
  
  equals/isBefere/isAfterメソッド
  public boolean equals(object other)
  public boolean isBefore(T other)
  public boolean isAfter(T other)
  other:比較する日時オブジェクト
  T:日時オブジェクトの型
*/

/*
  任意の日付/時刻要素を取得するための「getメソッド」を利用する。
*/

/*
  日付/時刻を整形するには、「formatメソッド」を利用する。
  
  formatメソッド
  public String format(DateTimeDormatter formatter)
  formatter:整形に利用するフォーマッター
*/

/*
  フォーマッター生成するためのメソッド（DateTimeDormatterクラスのメソッド）
  メソッド                                                                |概要
  DateTimeDormatter ofLocalizeDate(FormatStyle date)                      |ロケール固有の日付フォーマット
  DateTimeDormatter ofLocalizeTime(FormatStyle time)                      |ロケール固有の時刻フォーマット
  DateTimeDormatter ofLocalizeDateTime(FormatStyle dateTime)              |ロケール固有の日時フォーマット
  DateTimeDormatter ofLocalizeDateTime(FormatStyle date, FormatStyle time)|ロケール固有の日付と時刻スタイルを持つフォーマット
*/

/*
  整形のためのスタイル（FormatStyleクラスのメンバー）
  フィールド|概要
  FULL      |Thursday, November 15, 2018
  LONG      |November 15, 2018
  MEDIUM    |Nov 15, 2018
  SHORT     |11/15/18
*/

/*
  「ofPatternメソッド」で自作することもできる。
  
  ofPatternメソッド
  public static DateTimeFormatter ofPattern(String pattern [,Locale locale])
  pattern:パターン文字列
  locale:ロケール
*/

/*
  Period/Durationクラスの「between静的メソッド」を利用する。
  Periodは日付間隔を、Durationは時間間隔をそれぞれ表すためのクラスである。
  
  betweenメソッド
  public static Period between(LocalDate start, LocalDate end)
  public static Duration between(Temporal start, Temporal end)
  start:開始日時
  end:終了日時
*/

/*
  間隔を取得するためのメソッド
  クラス  |メソッド        |概要
  Period  |int getYears()  |年数
          |int getMonths() |月数
          |int getDays()   |日数
  Duration|long toDays()   |日数
          |long toHours()  |時間数
          |long toMinutes()|分数
          |long toSeconds()|秒数
          |long toMillis() |ミリ秒数
          |long toNanos()  |ナノ秒数
*/
