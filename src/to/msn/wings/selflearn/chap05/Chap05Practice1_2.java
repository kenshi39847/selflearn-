/* [2] splitメソッドを利用して、「鈴木\t太郎\t男\t50歳\t広島県」のような文字列をタブ文で分割し、
   その結果を&でつないで出力してみましょう。 */
package to.msn.wings.selflearn.chap05;

public class Chap05Practice1_2 {

	public static void main(String[] args) {
		var str = "鈴木\t太郎\t男\t50歳\t広島県";
		var result = str.split("\t");
		System.out.println(String.join("&", result));

	}

}
