package to.msn.wings.selflearn.chap06;

import java.util.Arrays;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
    var hs = new HashSet<Integer>(Arrays.asList(1, 20, 30, 10, 30, 60, 15));
	var hs2 = new HashSet<Integer>(Arrays.asList(10 ,20 ,99));

	System.out.println(hs);                   //結果：[1, 20, 10, 60, 30, 15]
	System.out.println(hs.size());            //結果：6
	System.out.println(hs.isEmpty());         //結果：false
	System.out.println(hs.contains(1));       //結果：true
	System.out.println(hs.containsAll(hs2));  //結果：false
	System.out.println(hs.remove(1));         //結果：true
	System.out.println(hs);                   //結果：[20, 10, 60, 30, 15]

	hs.addAll(hs2);
	System.out.println(hs);                   //結果：[99, 20, 10, 60, 30, 15]

	hs.retainAll(hs2);
	System.out.println(hs);                   //結果：[99, 20, 10]

	var hs3 = new HashSet<Integer>(Arrays.asList(1, 10 , 20));
	hs.removeAll(hs3);
	System.out.println(hs);                   //結果：[99]

	}

}

/*
  「セット」はリストと違って要素の重複が許されない。
  ある要素（群）がセットに含まれているか、他のセット（コレクション）との包含関係に関心がある状況でよく利用する。
  セットの主な実装クラスには、HashSet、LinkedHashSet、TreeSetがある。
*/
