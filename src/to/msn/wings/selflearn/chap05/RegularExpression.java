package to.msn.wings.selflearn.chap05;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		var tel = new String[] { "080-0000-0000", "084-000-0000", "184-0000" };
	    var rx = "\\d{2,4}-\\d{2,4}-\\d{4}";
	    for (var t : tel) {
	      System.out.println(Pattern.matches(rx, t) ? t : "アンマッチ");
	      // System.out.println(t.matches(rx) ? t : "アンマッチ");
	    }
	    */
		
		/*
	    var str = "会社の電話は0123-99-0000です。自宅は000-123-4567だよ。";
	    var ptn = Pattern.compile("(\\d{2,4})-(\\d{2,4})-(\\d{4})");
	    var match = ptn.matcher(str);
	    while (match.find()) {
	      System.out.println("開始位置：" + match.start());
	      System.out.println("終了位置：" + match.end());
	      System.out.println("マッチング文字列：" + match.group());
	      System.out.println("市外局番：" + match.group(1));
	      System.out.println("市内局番：" + match.group(2));
	      System.out.println("加入者番号：" + match.group(3));
	      System.out.println("-----");
	    }
	    */
		
		/*  大文字/小文字を区別しない
		var str = "仕事用はwings@example.comです。プライベート用はYAMA@example.comです。";
	    var ptn = Pattern.compile("[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(\\.[a-z0-9-]+)*", Pattern.CASE_INSENSITIVE);
	    var match = ptn.matcher(str);
	    while (match.find()) {
	      System.out.println(match.group());
	    }
	    //結果：wings@example.com
	    //      YAMA@example.com
	     */
		
		/*  マルチライン（複数行）モードを有効化する（マルチラインモードとは「^」「$」を変更するためのモード）。
		var str = "10人のインディアン。\n1年生になったら";
	    // var ptn = Pattern.compile("^\\d*");
	    var ptn = Pattern.compile("^\\d*", Pattern.MULTILINE);
	    var match = ptn.matcher(str);
	    while (match.find()) {
	      System.out.println(match.group());
	    }
	    //結果：10
        //      1
	    */
		
		/*  DOTALLモードを有効化する（DOTALLモードとは「.」の挙動を変更するためのモード）。
		var str = "初めまして。\nよろしくお願いします。";
        // var ptn = Pattern.compile("^.+");
        var ptn = Pattern.compile("^.+", Pattern.DOTALL);
        var match = ptn.matcher(str);
        while (match.find()) {
          System.out.println(match.group());
        }
        //結果：初めまして。
        //      よろしくお願いします。
	    */
	    

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

/*
  単にマッチしたかどうかを判定するだけでなく、
  マッチした文字列をもとの文字列から抜き出したい場合は「Pattern/Matcherクラス」を利用する。
*/

/*
  compileメソッド
  public static Pattern compile(String regex [,int flags])
  regex:正規表現
  flags:マッチフラグ
*/

/*
  matcherメソッド
  ppublic Matcher matcher(CharSequence input)
  input:検索文字列
*/

/*
  Matcherクラスの主なメソッド（引数groupはグループのインデックス）
  メソッド                 |概要
  boolean find([int start])|次のマッチを検索（引数startは検索開始位置）
  boolean lookingAt()      |文字列先頭からマッチするか
  boolean matches()        |文字列全体にマッチするか
  int start([int group])   |開始位置を取得
  int end([int group])     |終了位置を取得
  String group([int group])|int番目にマッチした部分文字列を取得
*/

/*
  正規表現の中で()でくくられた部分（サブマッチパターン）にマッチした部分文字列のことを
  「サブマッチ文字列（グループ、キャプチャグループ）」という。
*/

/*
  Patternクラスをインスタンス化する際には、第2引数に検索オプション（マッチフラグ）を渡すことができる。
*/

/*
  主なマッチフラグ（Patternクラスのメンバー）
  設定値          |概要
  CASE_INSENSITIVE|大文字小文字を区別しない
  MULTILINE       |複数行モードを有効化
  DOTALL          |「.」が行末記号を含む任意の文字にマッチ
  UNICODE_CASE    |Unicodeに準拠した大文字と小文字を区別しないマッチングを有効化
  UNIX_LINES      |「\n」だけを行末記号として扱う
  LITERAL         |パターンをリテラル文字として解析（「\d」などの意味を無効化）
  COMMENTS        |空白とコメントを有効化
*/
