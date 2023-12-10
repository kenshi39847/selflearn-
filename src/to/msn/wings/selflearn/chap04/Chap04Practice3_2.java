/* [2] 以下のコードをwhile命令を使って書き換えてみましょう。 */
/*
int i;
int sum = 0;
for (i = 1; i <= 100; i++) {
	 sum += i;
	 if (sum > 1000) {
	   break;
	 }
}
System.out.println("合計が1000を超えるのは、1～" + i + "を加算したときです。");
*/

package to.msn.wings.selflearn.chap04;

public class Chap04Practice3_2 {

	public static void main(String[] args) {
		var i = 1;
		var sum = 0;
		while (i <= 100) {
			sum += i;
			if (sum > 1000) {
				break;
			}
			i++;
		}
		System.out.println("合計が1000を超えるのは、1～" + i + "を加算したときです。");

	}

}
