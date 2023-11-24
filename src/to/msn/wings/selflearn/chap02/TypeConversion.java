package to.msn.wings.selflearn.chap02;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

/*
  Javaは型を厳密に区別する言語で、以下のようなコードはエラーになる。
  int num = 108;
  String str = num;  //エラー（intからStringには変換できない）
  しかし、例外的に、「数値型で、値範囲の狭い型から広い型へ代入する（=拡大変換）場合」は暗黙的な変換が許される。
  int i = 10;
  long l = i;
*/

/*
  変換元 |変換可能な型
  boolean|-
  char   |int,long,float,double
  byte   |short,int,long,float,double
  short  |int,long,float,double
  int    |long,float,double
  long   |float,double
  float  |double
  double |-
*/
