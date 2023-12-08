package to.msn.wings.selflearn.chap04;

public class Chap04Practice1_1 {

	public static void main(String[] args) {
	/* [1] 条件分岐構文を使って、90点以上であれば「優」、70点以上であれば「良」、50点以上であれば「可」、
	   それ以下の場合は「不可」と表示するコードを作成してください。また、点数が75点であった場合の結果を表示させてください。  */
	  var i = 75;
	  if(i >= 90) {
		System.out.println("優");
	  } else if(i >= 70) {
		System.out.println("良");
	  } else if(i >= 50) {
		System.out.println("可");
	  } else
		System.out.println("不可");
	}
	
}
