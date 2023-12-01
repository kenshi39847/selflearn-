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
	    
	    //文字列から数値への変換
	    System.out.println(Integer.parseInt("108"));  //結果：108
	    System.out.println(Double.parseDouble("1.2345"));  //結果：1.2345
	    System.out.println(Integer.parseInt("FF", 16));  //結果：255
	    System.out.println(Double.parseDouble("0.653e2"));  //結果：65.3
	    
	    //数値から文字列への変換
	    System.out.println(String.valueOf(108));  //結果：108
	    System.out.println(Integer.toString(108));  //結果：108
	    System.out.println(Double.toString(1.2345));  //結果：1.2345
	    System.out.println(Integer.toString(255, 16));  //結果：ff
	    System.out.println(Integer.toHexString(255));  //結果：ff
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
  しかし、オートボクシングには安易に頼らないようにする。
*/

/*
  型キャストでは文字列（String）から数値に変換することはできない。
  そのため、ラッパークラスの「parseXxxxxメソッド」を利用する。
  また、整数型のparasXxxxxメソッドは、第2引数に基数を指定することで、2～36進数表現への変換も可能である。
  同様に、数値を文字列に変換するときは、Stringクラスの「valueOfメソッド」、またはラッパークラスの「toStringメソッド」を利用する。
*/
