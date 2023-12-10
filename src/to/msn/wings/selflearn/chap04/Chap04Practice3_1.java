/* [1] コマンドライン引数から受け取った値を順に取り出し、一律、1.5倍したものを出力するコードを完成させてください。*/

package to.msn.wings.selflearn.chap04;

public class Chap04Practice3_1 {

	public static void main(String[] args) {
		for (var value : args) {
			var i = Integer.parseInt(value);
			System.out.println(i * 1.5);
		}

	}

}
