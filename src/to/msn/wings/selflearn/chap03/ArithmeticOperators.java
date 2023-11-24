package to.msn.wings.selflearn.chap03;

import java.time.LocalDateTime;

public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println(1 + 2);
	    System.out.println("a" + 5);
	    System.out.println(5 + "b");
	    System.out.println("1" + "2");
	    System.out.println("a" + LocalDateTime.now());
	    // System.out.println(1 + LocalDateTime.now()); //エラー

	}

}

/*
  与えられた変数やリテラルに対して、あらかじめ決められた処理を行うための記号を「演算子（オペレーター）」という。
  演算子によって処理される変数/リテラルのことを被演算子（オペランド）という。
  Javaの演算子には「算術演算子」、「代入演算子」、「関係演算子」、「論理演算子」、「ビット演算子」がある。
*/

/*
  「算術演算子（代数演算子）」は四則演算をはじめ、日常的な数字で利用する演算子を提供する。
*/