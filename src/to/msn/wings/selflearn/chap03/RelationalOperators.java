package to.msn.wings.selflearn.chap03;

public class RelationalOperators {

	public static void main(String[] args) {
		/*
		  ==演算子はオペランドの同一性を比較する。
		  下記は一見して同じ文字列を表すが、別々に作成された異なるオブジェクトなため、同一ではないとなる。
		*/
		var builder1 = new StringBuilder("あいう");
	    var builder2 = new StringBuilder("あいう");
	    System.out.println(builder1 == builder2);  //結果:false
	    
	    /*
		  ただし、Javaでは文字列リテラルによって生成されたStringオブジェクトは同値である限り同一であるという性質のため、
		  ==演算子で同値比較しているように見える。
		*/
	    var str1 = "あいう";
	    var str2 = "あいう";
	    System.out.println(str1 == str2);  //結果:true
	    System.out.println(str1 == "あ" + "いう");  //結果:true

	}

}

/*
  関係演算子（比較演算子）を利用する上で「同一性」、「同値性」を区別する。
  同一性:オブジェクト参照同士が同じオブジェクトを参照していること
  同値性:オブジェクトが同じ値を持っていること
*/
