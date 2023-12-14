/* [2] 今日を基点に20日後の日付を求めてみましょう。 */
package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Chap05Practice3_2 {

	public static void main(String[] args) {
		var dt = LocalDateTime.now();
		System.out.println(dt.plus(20, ChronoUnit.DAYS));
		
		/*別解
		var period = Period.ofDays(20);
		System.out.println(dt.plus(period));
		*/

	}

}
