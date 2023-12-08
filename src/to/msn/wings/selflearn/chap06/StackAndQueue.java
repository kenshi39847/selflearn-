package to.msn.wings.selflearn.chap06;

import java.util.ArrayDeque;

public class StackAndQueue {

  public static void main(String[] args) {
	//スタック（末尾から要素を追加し、取り出す）
	var data = new ArrayDeque<Integer>();
	  data.addLast(10);
	  data.addLast(15);
	  data.addLast(30);

	  System.out.println(data);                 //結果：[10, 15, 30]
	  System.out.println(data.removeLast());    //結果：30
	  System.out.println(data);                 //結果：[10, 15]
	  
      //キュー（末尾から要素を追加し、先頭から取り出す）
	  var data2 = new ArrayDeque<Integer>();
	  data2.addLast(10);
	  data2.addLast(15);
	  data2.addLast(30);

	  System.out.println(data2);                //結果：[10, 15, 30]
	  System.out.println(data2.removeFirst());  //結果：10
	  System.out.println(data2);                //結果：[15, 30]

  }

}

/*
  リスト両端からの値の出し入れに特化したデータ構造が「スタック」と「キュー」である。
  「スタック（Stack）」とは、後入れ先だし（LIFO:Last In First Out）、または先入れ後出し（FILO:First In Last Out）とも呼ばれるデータ構造のことである。
  「キュー（Queue）」は先入れ先出し（FIFO:First In first Out）と呼ばれるデータ構造のことである。待ち行列とも呼ばれる。
  Javaではこれらのデータ構造を実現するために「デック（Deque）」というインターフェースを提供している。
  「デック（Deque）」は両端キューと呼ばれ、リストの先頭/末尾双方から要素を追加/削除できる構造である。
  スタック/キューの主なクラスにはArrayDeque、LinkedList、Stackがある。
*/

/*
  ArrayDequeの内部的な実装は循環配列である。
  循環配列とは、基本的には配列だが、先頭から順に要素を格納するのではなく、配列内の任意の範囲に要素を格納している。
*/
