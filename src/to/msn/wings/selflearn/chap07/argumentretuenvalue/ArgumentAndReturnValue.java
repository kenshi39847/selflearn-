package to.msn.wings.selflearn.chap07.argumentretuenvalue;

public class ArgumentAndReturnValue {

	public static void main(String[] args) {
		
		/*可変長引数のメソッド
		var v = new ArgsParams();
		System.out.println(v.totalProducts(12, 15, -1));
		System.out.println(v.totalProducts(5, 7, 8, 2, 4, 3));
		*/
		
		/*基本型
		var num = 2;
		var p = new ParamPrimitive();
		System.out.println(p.update(num));
		System.out.println(num);
		*/
		
		/*参照型
		var data = new int[] {2, 4, 6};
		var p = new ParamRef();
		System.out.println(p.update(data)[0]);
		System.out.println(data[0]);
		*/
		
		/*配列そのものを置き換えた場合
		var data = new int[] {2, 4, 6};
		var p = new ParamRefArray();
		System.out.println(p.update(data)[0]);
		System.out.println(data[0]);
		*/

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

/*
Javaの型には基本型と参照型があり、引数においても基本型と参照型いずれであるかによって受け渡した値への影響範囲が変化する。
基本型では実引数の値は仮引数にコピーされる。つまり、変数と仮引数は別物なので、
仮引数への操作が元の引数（実引数）に影響を及ぼすことはない。
一方、参照型では（値そのものではなく）値を格納したメモリ上の場所を格納している。そして、参照型を受け渡しする場合、
コピーする値も（扱っている値そのものではなく）メモリ上のアドレス情報となる。
つまり、メソッドの呼び出しによって実引数と仮引数は同じ値を参照することになる。
ただし、配列そのものを置き換えた場合には結果が変化する。
新たに配列を代入した場合には参照そのものが置き変わるため、実引数に影響することはない。
*/
