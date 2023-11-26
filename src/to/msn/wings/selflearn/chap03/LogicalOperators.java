package to.msn.wings.selflearn.chap03;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		String str = null;
	    if (str != null && str.startsWith("http://")) {
	    // if(str.startsWith("http://")) {
	      System.out.println("「http://～」で始まります。");
	    }
	    */
	}
}

/*
  論理演算子による評価結果
  左式 |右式 |&&   |||   |^    |
  true |true |true |true |false|
  true |false|false|true |true |
  false|true |false|true |true |
  false|false|false|false|false|
*/

/*
  論理積/論理和演算では、ある条件のもとでは、左式だけが評価されて右式が評価されない場合があり、
  このような演算のことを「ショートカット演算（短絡演算）」という。
  例えば、論理積演算子では左式がfalseである場合、右式がtrue/falseに関わらず条件式全体はfalseとなる。
  論理和演算子でも同様、左式がtrueの場合、右式に関わらず条件式全体はtrueとなる。
*/
