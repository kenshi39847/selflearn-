/* [2] 複数のメールアドレスを含むテキストcontact.txtがあるとします。contact.txtを順番に読み込み、テキストに含まれる
       メールアドレスを一覧表示してみましょう。 */
package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Chap05Practice4_2 {

	public static void main(String[] args) {
		var ptn = Pattern.compile(
		    "[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(?:\\.[a-z0-9-]+)*",
		    Pattern.CASE_INSENSITIVE);
		try (var reader = Files.newBufferedReader(Paths.get("C:/data/contact.txt"))) {
		    var line = "";
		    while ((line = reader.readLine()) != null){
		        var match = ptn.matcher(line);
		        while (match.find()) {
		          System.out.println(match.group());
		    }
		}
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
