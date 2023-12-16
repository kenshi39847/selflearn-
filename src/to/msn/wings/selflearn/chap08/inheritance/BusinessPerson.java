package to.msn.wings.selflearn.chap08.inheritance;

public class BusinessPerson extends Person {
	/*継承の基本
	public String work() {
	    return String.format("%d歳の%sは、働きます。", this.age, this.name);
	}
	*/
	
	/*フィールドの隠蔽
	//基底クラスのフィールドを隠蔽
	public LocalDateTime birth = LocalDateTime.now();
	public void show() {
	    System.out.println(super.birth);
	}
	*/
	
	/*オーバーライド
	public BusinessPerson() {}
	@Override 
	public String show() {
	    return String.format("会社員の%s（%d歳）です。", this.name, this.age);
	}
	public String work() {
	    return String.format("%d歳の%sは、働きます。", this.age, this.name);
	}
	*/
	
	/*super
	public String work() {
	    return String.format("%d歳の%sは、働きます。", this.age, this.name);
	}
	*/
	
	/*継承/オーバーライドの禁止
	public String intro() {
		return "会社員です";
	}
	*/

}
