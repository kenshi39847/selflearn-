package to.msn.wings.selflearn.chap09.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

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
