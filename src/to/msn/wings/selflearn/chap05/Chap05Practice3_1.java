/* [1] 現在の日時を取得し、そこから「月」と「分」だけ表示してみましょう。 */
package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;

public class Chap05Practice3_1 {

	public static void main(String[] args) {
		var dt = LocalDateTime.now();
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getMinute());

	}

}
