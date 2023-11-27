package to.msn.wings.selflearn.chap04;

public class IterativeProcessing {

	public static void main(String[] args) {
		/*
		var i = 1;
	    while (i < 6) {
	      System.out.println(i + "番目のループです。");
	      i++;
	    }
	    */
		/*結果：1番目のループです。
	            2番目のループです。
	            3番目のループです。
	            4番目のループです。
	            5番目のループです。
	    */
		
		/*
		var i = 1;
	    do {
	      System.out.println(i + "番目のループです。");
	      i++;
	    } while (i < 6);
	    */
		/*結果：1番目のループです。
	            2番目のループです。
	            3番目のループです。
	            4番目のループです。
	            5番目のループです。
	    */

	}

}

/*
  while命令
  while(条件式) {
    ...条件式がtrueである間、繰り返し実行する処理...
  }
*/

/*
  do...while命令
  do {
    ...条件式がtrueである間、繰り返し実行する処理...
  } while(条件式);
*/

/*
  終了条件がtrueにならないループのことを「無限ループ」という。
  無限ループは、コンピュータへの極端な不可の原因にもなり、フリーズの原因にもなる。
  繰り返し処理ではループが正しく終了するかきちんと確認する。
*/
