/* [1] ジェネリクスとは何か説明してみましょう。また、コレクションでジェネリクスを利用するメリットを説明してください。 */
/* [2] 16, 24, 30, 39といった値を持つArrayListを一文で生成してみましょう。
 *     ただし、生成されるArrayListは変更可能であるとします。 */
package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;

public class Chap06Practice1 {

	public static void main(String[] args) {
		/* [1]
		  ジェネリクスとは、汎用的なクラスに対して特定の型を紐づけるための機能である。コレクションでジェネリクスを利用する
		  ことで、格納される値の型が正しいことをコンパイル時にチェックでき、値を取り出すときのキャストも不要になる。
		*/
		
		// [2]
		var list = new ArrayList<Integer>(Arrays.asList(16, 24, 30, 39));

	}

}
