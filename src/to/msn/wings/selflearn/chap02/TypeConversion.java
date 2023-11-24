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
  しかし、例外的に、「数値型で、値範囲の狭い型から広い型へ代入する（拡大変換）場合」は暗黙的な変換が許される。
  int i = 10;
  long l = i;
*/

/*
  変換元 |暗黙的な変換可能な型
  boolean|-
  char   |int,long,float,double
  byte   |short,int,long,float,double
  short  |int,long,float,double
  int    |long,float,double
  long   |float,double
  float  |double
  double |-
*/

/*
  広い型から狭い型への代入（縮小変換）は実際の値に関わらずエラーとなる。
  int i = 13;
  byte b = i; //エラー（intからbyteには変換できない）
  しかし、例外的に、「型キャスト（キャスト）」構文を利用して、明示的に変換の意思を表明した場合に限って、
  縮小返還を認めており、これを明示的な変換という。
  int i = 13;
  byte b = (byte)i;  //エラー解消
*/

/*
  型キャスト
  (データ型)変換
*/

/*
  変換元 |明示的な変換可能な型
  byte   |char
  short  |byte,char
  char   |byte,short
  int    |byte,short,char
  long   |byte,short,char,int
  float  |byte,short,char,int,long
  double |byte,short,char,int,long,float
*/
