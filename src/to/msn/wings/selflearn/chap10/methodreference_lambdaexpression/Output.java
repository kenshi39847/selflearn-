package to.msn.wings.selflearn.chap10.methodreference_lambdaexpression;

// ①String型の引数を受け取り、戻り値はvoidであるメソッド型
@FunctionalInterface
public interface Output {
  void print(String str);
}
