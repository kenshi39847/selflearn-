/* [1] リストを新規に作成して、その内容を更新した後、一覧表示する例を完成させてください。 */
package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;

public class Chap06Practice2 {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30));
		var list2 = new ArrayList<Integer>(Arrays.asList(60, 90));
		list.remove(0);
		list.set(1, 20);
		list.addAll(2, list2);
		for(var i : list) {
			System.out.println(i);
		}

	}

}
