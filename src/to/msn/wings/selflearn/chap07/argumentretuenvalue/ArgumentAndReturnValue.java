package to.msn.wings.selflearn.chap07.argumentretuenvalue;

public class ArgumentAndReturnValue {

	public static void main(String[] args) {
		var v = new ArgsParams();
		System.out.println(v.totalProducts(12, 15, -1));
		System.out.println(v.totalProducts(5, 7, 8, 2, 4, 3));

	}

}

/*
引数の個数があらかじめ決まっていない（=実行時に引数の個数が変化しうる）メソッドを「可変長引数のメソッド」という。
例えば、与えられた数値（群）の総積を求めるtotalProductのようなメソッドは、典型的な可変長引数のメソッドである。
例）
System.out.println(v.totalProducts(12, 15, -1));
System.out.println(v.totalProducts(5, 7, 8, 2, 4, 3));

可変長引数は「int...」のように「...」を付与することで表現できる。

可変長引数の利用にあたって、制限や注意点を以下にまとめる。
1.可変長引数はメソッドに1つ、引数リストの末尾にだけ指定できる。
2.想定される引数まで可変長引数にまとめない
3.可変長引数で「1個以上の引数」を表す方法
可変長引数は、引数そのものの省略を認めている。よってtotalProductsメソッドであれば、単に「v.totalProducts()」としても正しい。
*/
