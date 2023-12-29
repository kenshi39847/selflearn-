/* [1] Mathクラス、Arrayクラスを利用して、以下のコードを書いてみましょう。
       1.6の3乗を求める
       2.-15の絶対値を求める
       3.110,14,28,32といった値を持つ配列を定義し、これをソートする */
package to.msn.wings.selflearn.chap05;

import java.util.Arrays;

public class Chap05Practice4_4 {

	public static void main(String[] args) {
		
		//1.
		System.out.println(Math.pow(6, 3));
		//2.
		System.out.println(Math.abs(-100));
		//3.
		var array = new int[] {110, 14, 28, 32};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
