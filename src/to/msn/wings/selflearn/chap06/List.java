package to.msn.wings.selflearn.chap06;

import java.util.Arrays;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
	  /*
	  var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30, 60));
	  var list2 = new ArrayList<Integer>(Arrays.asList(1, 5, 3, 6));
	  var list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

	  for (var i : list) {
	    System.out.println(i / 5);
	  }                                           //結果：2
	                                                      3
	                                                      6
	                                                      12

	  System.out.println(list.size());            //結果：4
	  System.out.println(list.get(0));            //結果：10
	  System.out.println(list.contains(30));      //結果：true
	  System.out.println(list.indexOf(30));       //結果：2
	  System.out.println(list.lastIndexOf(30));   //結果：2
	  System.out.println(list.isEmpty());         //結果：false
	  System.out.println(list.remove(0));         //結果：10
	  System.out.println(list);                   //結果：[15, 30, 60]

	  list.addAll(list2);
	  System.out.println(list);                   //結果：[15, 30, 60, 1, 5, 3, 6]

	  list.removeAll(list3);
	  System.out.println(list);                   //結果：[15, 30, 60, 5, 6]

	  list.set(0, 100);
	  var data = list.toArray();
	  System.out.println(Arrays.toString(data));  //結果：[100, 30, 60, 5, 6]
	  */
		
	  var list = new LinkedList<String>(Arrays.asList("うさぎ", "たつ", "へび"));
	  System.out.println(list);                //結果：[うさぎ, たつ, へび]

	  list.addFirst("とら");
	  list.addLast("うま");
	  System.out.println(list);                //結果：[とら, うさぎ, たつ, へび, うま]
	  System.out.println(list.getFirst());     //結果：とら
	  System.out.println(list.getLast());      //結果：うま
	  System.out.println(list.removeFirst());  //結果：とら
	  System.out.println(list.removeLast());   //結果：うま
	  System.out.println(list);                //結果：[うさぎ, たつ, へび]

	}

}

/*
  配列のように配下の要素が順序付けられたコレクションを「リスト」という。
  リストの主な実装にはArrayList、LinkedList、Vector等がある。
*/

/*
  ArrayListは、内部的には配列を利用したデータ構造である。ただし、配列とは異なり後からでもサイズを変更できる（=要素の追加/削除が可能）。
  その性質上、インデックス値による値の読み書き（ランダムアクセス）性能には優れる。
*/

/*
  LinkedListは、要素同士を双方向のリンクで参照する二重リンクリストの実装である。
  その性質上、要素の挿入/削除は高速である。ArrayListとは異なり、挿入/削除にあたって要素の移動が不要で、前後リンクの付け替えだけで済むからである。
  ただし、一般的には挿入/削除に先立って要素位置の検索が加わるはずなので、オーバーヘッドも考慮しなければならない。
*/
