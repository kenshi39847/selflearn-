package to.msn.wings.selflearn.chap07;

public class Class {

	public static void main(String[] args) {
		

	}

}

/*
class命令
[修飾子] class クラス名 {
  ...クラス本体...
}
例）
public class Person {
}
*/

/*
クラスに対して適切な名前を付けるということは、コードの可読性/保守性という観点からも重要なポイントである。
以下はクラスを命名するうえで留意しておきたいポイントである。
・Pascal記法で統一
「Pascal記法」とは、すべての単語の頭文字を大文字で表す記法である（Upper CamelCase(UCC)記法ともいう）。
例）
LocalDateTime,InputStream,FileReader
・目的に応じて接頭辞/接尾辞を付ける
例）
AbstractXxxxx,XxxxxException,XxxxxFormatter
・扱う対象/機能を端的に表す単語を選ぶ
(1)名前は英単語、かつ、フルスペルで表記
(2)下位クラスはより具体的に
(3)連番、コードなどの接頭辞は極力避ける
*/

/*
クラスやそのメンバーの性質を決めるキーワードのことを「修飾子」という。
例えば、publicはクラス/メンバーがどこからでもアクセスできることを意味する修飾子である。
指定できる修飾子は、クラス、フィールド/メソッドなど、付与する対象によって異なる。

class命令で利用できる主な修飾子
|修飾子  |概要                                    |
|public  |すべてのクラスからアクセス可能          |
|final   |継承を許可しない                        |
|abstract|抽象クラス                              |
|strictfp|浮動小数点数を環境に依存しない方法で演算|

○public修飾子
クラス/メンバーがどこからでもアクセスできることを意味する修飾子で「アクセス修飾子」とも呼ばれる。
アクセス修飾子には他にもprotected、private等があるが、クラスを指定できるのはpublicだけである。
アクセス修飾子が指定されなかった場合、同じパッケージからのアクセスだけを許可する（これを「パッケージプライベート」という）。
*/