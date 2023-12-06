package to.msn.wings.selflearn.chap05;

public class Stream {

	public static void main(String[] args) {
		
		/*
		try (var writer = Files.newBufferedWriter(Paths.get("C:\\data\\data.log"))) {
		// try (var writer = Files.newBufferedWriter(Paths.get("C:/data/data.log"))) {
		//try (var writer = Files.newBufferedWriter(Paths.get("C:\\data\\data.log"), StandardOpenOption.APPEND)) {
		writer.write(LocalDateTime.now().toString());
		  writer.newLine();
		} catch (IOException e) {
		  e.printStackTrace();
		}
		*/	

	}

}

/*
  入出力先に関わらず（メモリでもファイルでもネットワークでも）、同じくデータの連なりとして見えるような仕組みを「ストリーム」という。
  ストリームにはファイル/ネットワークなどからデータを受け取る「入力ストリーム」と、データを書き出すための「出力ストリーム」がある。
  また、それぞれはさらに流れるデータの種類によって「文字ストリーム」と「バイナストリーム」に分類できる。
  
  ストリームの種類に応じた基本クラス
  |                |入力ストリーム|出力ストリーム|
  |文字ストリーム  |Reader        |Writer        |
  |バイナストリーム|InputStream   |OutputStream  |
*/

/*
  テキストをファイルに書き込む流れ
  1.書き込み用にテキストファイルを開く。テキストファイルへの書き込みには「BufferedWriterクラス」を利用する。
  public static BufferedWriter newBufferedWriter(Path path [, Charset cs][, OpenOption... options])
  path:ファイルのパス
  cs:文字コード
  options:ファイルのオープンモード
  
  2.テキストを書き込む
  テキストを書き込むのは「writeメソッド」である。
  public void write(String str, int offset, int len)
  str:書き込む文字列
  offset:書き込み開始位置
  len:書き込む長さ
  
  3.ファイルをクローズする
  「try-with-resources構文」を利用することでファイルを則罪にかつ確実にクローズできる。
  try(リソース生成式){
    ...リソースの操作...
  }
*/