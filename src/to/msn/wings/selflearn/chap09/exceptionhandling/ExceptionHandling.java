package to.msn.wings.selflearn.chap09.exceptionhandling;

public class ExceptionHandling {
	private static double getTrapezoidArea(double upper, double lower, double height) {
	    assert upper > 0 && lower > 0 && height > 0;
	    return (upper + lower) * height / 2;
	}

	public static void main(String[] args) {
		/*
		try {
		    var in = new FileInputStream("C:/data/nothing.gif");
		    var data = -1;
		    while ((data = in.read()) != -1) {
		        System.out.printf("%02X ", data);
		    }
		} catch (FileNotFoundException e) {
		    System.out.println("ファイルが見つかりませんでした。");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		*/
		
		/*
		FileInputStream in = null;
	    try {
	      in = new FileInputStream("C:/data/nothing.gif");
	      var data = -1;
	      while ((data = in.read()) != -1) {
	        System.out.printf("%02X ", data);
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("ファイルが見つかりませんでした。");
	    } catch (IOException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        if (in != null) {
	          in.close();
	        }
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	    */
		
		/*
		try (var in = new FileInputStream("C:/data/nothing.gif")) {
		    var data = -1;
		    while ((data = in.read()) != -1) {
		        System.out.printf("%02X ", data);
		    }
		    } catch (FileNotFoundException e) {
		      System.out.println("ファイルが見つかりませんでした。");
		    } catch (IOException e) {
		      e.printStackTrace();
		}
		*/
		
		/* assert命令
		System.out.println(ExceptionHandling.getTrapezoidArea(-2, 4, 0));
		*/

	}

}

/*
アプリを実行したときに発生する異常な状態、エラーのことを「例外」という。
また、発生した例外に対処するための処理のことを「例外処理」という。
Javaでは例外を検知し、対処するための標準的な仕組みとして、例外処理を提供している。それが「try...catch命令」である。
○try...catch命令
try {
  ...例外を発生する可能性のあるコード...
} catch(例外型1, 変数1) {
  ...例外型1が発生したときの処理...
}
......
} catch(例外型N, 変数N) {
  ...例外型Nが発生したときの処理...
}

tryブロックがアプリ本来の処理で、ここで例外が発生すると、その種類（型）に応じてcatchブロックが呼び出される。
例外が発生することを例外がスローされる、また、発生した例外を受け取ることを例外をキャッチすると表現する。

例外クラスで利用できる主なメソッドは以下の通りである。
○例外クラスの主なメソッド
|メソッド                           |概要                                      |
|String getMessage()                |エラーメッセージを取得                    |
|String getLocallizedMessage()      |ローカライズ対応したエラーメッセージを取得|
|Throwable getCause()               |エラー原因を取得                          |
|StackTraceElement[] getStackTrace()|スタックトレースを取得                    |
|void printStackTrace               |スタックトレースを出力                    |
「スタックトレース」とは例外が発生するまでに経てきたメソッドの経歴である。
エントリーポイントであるmainメソッドを基点に呼び出し順に記録される。
*/

/*
try...catch命令には、必要に応じて、例外の有無に関わらず最終的に実行される「finallyブロック」を追加することができる。
一般的には、tryブロックの中で利用したリソースの後始末のためなどに利用する。
*/

/*
try...finally構文よりもリソース破棄に特化しており、シンプルに表現できる「try-with-resource構文」がある。
ただし、いくつかの注意点もある。
1.AutoCloseableインターフェースを実装していること
2.リソース解放の順序が変わる
3.リソースのスコープが異なる
*/

/*
例外/エラーは階層ツリーに沿って、さらに大きく3種類に分類できる。
1.Errorクラス
致命的なエラーを表す。配下の例外はエラー例外とも呼ばれ、代表的なものにIOError（重大な入出力エラー）、
VirtualMachineError（仮想マシンレベルでの障害）がある。いずれもアプリでは処理できないレベルのエラーで、一般的には
例外処理として扱うべきではない。
2.Exception配下のエラー
アプリに起因する問題を表す。RuntimeException配下の例外とそれ以外の例外に分類できる。
RuntimeExceptionとその配下の例外は実行時のエラーであり、IllegalArgumentException（不正の引数）、
NullPointterException（オブジェクトがnull）など、基本的には正しいアプリでは発生しないはずのバグである。
3.Exceptionクラスの配下で、RuntimeException配下以外に位置する例外（狭義の例外）
代表的なものにFileNotFoundException（ファイルが存在しない）、SQLException（データベースアクセス時の問題）などがある。

以上を前提に例外を処理する際の注意点を以下にまとめる。
1.Exceptionで補足しない
ファイルが存在しない場合の例外を補足するならば、上位のIOExceptionよりもより具体的なFileNotFoundException例外を利用すべきである。
2.マルチキャッチを活用する
マルチキャッチ構文では、対処の例外型を「|」で列挙するだけである。
catch (IOException | URISyntaxException e)
3.catchブロックの記述順
複数のcathcブロックがある場合には、記述が先にあるものが優先される。
*/

/*
「throw命令」を利用することで、アプリ開発者が自ら例外をスローすることもできる。
○throw命令
throw 例外オブジェクト
throw命令には、任意の例外オブジェクトを渡せる。例外オブジェクトであることの要件はThrowableクラスを継承していることだけである。
ただし、アプリから明示的にスローするのはExceptionの派生クラスになるはず（そうすべき）である。
例外をスローする場合には以下のような点に注意する。
1.Exceptionをスローしない
2.検査例外/非検査例外を適切に選択する
3.できるだけ標準例外を利用する
4.privateメソッドではassert命令で代用
○assert命令
assert 条件式 [:エラーメッセージ]
assert命令は、与えられた条件式がfalseの場合にAssertionError例外を投げる。AssertionErrorはErrorクラス配下に属し、
致命的なエラーの意味である。assert命令はjavaコマンドで-eaオプションを明示した場合にだけ動作する。
*/
