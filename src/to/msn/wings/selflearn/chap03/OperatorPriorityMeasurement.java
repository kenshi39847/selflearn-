package to.msn.wings.selflearn.chap03;

public class OperatorPriorityMeasurement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

/*
  式に複数の演算子が含まれている場合、これらがどのような順序で処理されるかルールを規定したものを
  演算子の「優先順位」と「結合則」という。
  結合則とは、優先順位の同じ演算子が並んでいる場合に、演算子を左から右、右から左の
  いずれかの方向に処理するか決めるルールである。
*/

/*
  演算子の優先順位
  優先順位|演算子
  高い    |(引数)、[]、,
          |++(後置)、--(後置)
          |++(前置)、--(前置)、+(単項)、-(単項)、!、~
          |*、/、%
          |+(算術)、-(算術)
          |<<、>>、>>>
  ↑      |>、>=、<、<=、instanceof
  ↓      |==、!=
          |&
          |^
          ||
          |&&
          |||
          |?:
  低い      |=、+=、-=、*=、/=、%=、&=、|=、^=、<<=、>>=、>>>=
*/

/*
  演算子の結合則
  結合性|演算子の種類|演算子
  左→右|算術演算子  |+、-、*、/、%、++、--
        |比較演算子  |<、<=、>、>=、==、!=、===、!==
        |論理演算子  |&&、||
        |ビット演算子|<<、>>、>>>、&、^
  右→左|算術演算子  |++、--、+、-
        |代入演算子  |=、+=、-=、*=、/=、%=、&=、^=、|=
        |論理演算子  |!
        |ビット演算子|~
        |条件演算子  |?:
*/