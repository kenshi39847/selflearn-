package to.msn.wings.selflearn.chap07.scope;

public class ScopeBasic {
	public String date = "フィールド";
	
	public String show() {
		var date = "ローカル";
		//return date;
		//return this.date;
	}

}
