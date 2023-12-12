/* [4] switch命令を使って、変数languageの値が「Scale」、「Kotlin」、「Groovy」であれば、「JVM言語」、
       「C#」、「Visual Basic」、「F#」であれば、「.NET言語」、さもなければ「不明」と表示されるコードを作成してください。 */
package to.msn.wings.selflearn.chap04;

public class Chap04Practice3_4 {

	public static void main(String[] args) {
		var language = "C#";
		
		switch(language) {
			case "Scale":
			case "Kotiln":
			case "Groovy":
				System.out.println("JVM言語");
				break;
			case "C#":
			case "Visual Basic":
			case "F#":
				System.out.println(".NET言語");
				break;
			default:
				System.out.println("不明");
				break;
		}

	}

}
