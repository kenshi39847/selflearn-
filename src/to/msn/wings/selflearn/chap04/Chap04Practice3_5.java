/* [5] [4]のコードを、if命令を使って書き換えてみましょう。 */
package to.msn.wings.selflearn.chap04;

public class Chap04Practice3_5 {

	public static void main(String[] args) {
		var language = "C#";
		
		/*
		if(language.equals("Scale")) {
			System.out.println("JVM言語");
		} else if(language.equals("Kotlin")) {
			System.out.println("JVM言語");
		} else if(language.equals("Groovy")) {
			System.out.println("JVM言語");
		} else if(language.equals("C#")) {
			System.out.println(".NET言語");
		} else if(language.equals("Visual Basic")) {
			System.out.println(".NET言語");
		} else if(language.equals("F#")) {
			System.out.println("JVM言語");
		} else {
			System.out.println("不明");
		}
		*/
		
		if(language.equals("Scale") || language.equals("Kotiln") || language.equals("Groovy")) {
			System.out.println("JVM言語");
		} else if(language.equals("C#") || language.equals("Visual Basic") || language.equals("F#")) {
			System.out.println(".NET言語");
		} else {
			System.out.println("不明");
		}

	}

}
