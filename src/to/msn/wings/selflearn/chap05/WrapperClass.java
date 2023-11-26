package to.msn.wings.selflearn.chap05;

public class WrapperClass {

	public static void main(String[] args) {
	    //Longはlongの誤り
		Long result = 0L;
		
		//1～10000の総和を求める
	    for (var i = 1; i < 10000; i++) {
	      //アンボクシング（加算）+ボクシング（代入）の発生
	      result += i;
	    }
	    System.out.println(result);
	}

}

/*
  単なる値にすぎない基本型のデータを包んで（=ラップして）、
  オブジェクトとしての機能を付与するためのクラスを「ラッパークラス」という。
  ただし、ラッパークラスは基本型に比べてメモリの消費量は大きく、処理効率も劣る。
  一般的にラッパークラスを利用するのはコレクションに対して数値をセットするなど、
  限られた場合だけで、まずは基本型を優先して利用する。
*/

/*
  ラッパークラス|対応関係にある基本型
  Boolean       |boolean
  Byte          |byte
  Character     |char
  Double        |double
  Float         |float
  Interger      |int
  Long          |long
  Short         |short
*/

/*
  基本型からラッパーオブジェクトへの変換を暗黙的に実施するための仕組みを「ボクシング（boxing）」といい、
  ラッパーオブジェクトから基本型への暗黙的な変換のことを「アンボクシング（unboxing）」という。
  ボクシング/アンボクシングをあわせて「オートボクシング」という。
*/
