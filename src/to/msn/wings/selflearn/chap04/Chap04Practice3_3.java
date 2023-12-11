/* [3] for命令とcontinue命令を使って、100～200の範囲にある奇数値の合計を求めてみましょう。 */

package to.msn.wings.selflearn.chap04;

public class Chap04Practice3_3 {

	public static void main(String[] args) {
		var sum = 0;
		
		for(var i = 100; i <= 200; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("合計値は" + sum);

	}

}
