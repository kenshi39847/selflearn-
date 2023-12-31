package to.msn.wings.selflearn.chap09.objectclass;

public class Person implements Cloneable {
	  
	/*
	//オブジェクトの文字列表現を取得する～toString～
	private String firstName;
    private String lastName;

	public Person(String firstName, String lastName) {
	  this.firstName = firstName;
	  this.lastName = lastName;
	}
	@Override
	//toStringメソッドを実装する際には、そのクラスを特徴づけるフィールドを選別して文字列かする
	public String toString() {
	  return String.format("名前は、%s %s です。",
	      this.lastName, this.firstName);
	}
	//toStringメソッドで利用した情報（フィールド）は、個別のゲッターでも取得できるようにする
	public String getLastName() {
	  return this.lastName;
    }
	public String getFirstName() {
	  return this.firstName;
	}
	*/
	
	/*
	//オブジェクト同士が等しいかどうかを判定する～equals～
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
	  this.firstName = firstName;
	  this.lastName = lastName;
	}
	@Override
	public boolean equals(Object obj) {
	  if (this == obj) {
	    return true;
	  }
	  if (obj instanceof Person) {
	    var p  = (Person)obj;
	    return this.firstName.equals(p.firstName) &&
	        this.lastName.equals(p.lastName);
	  }
	  return false;
	}
	*/
	
	/*
	//オブジェクトを比較する～compareTo～
	private String firstNameKana;
    private String lastNameKana;

	public Person(String firstNameKana, String lastNameKana) {
	    this.firstNameKana = firstNameKana;
	    this.lastNameKana = lastNameKana;
    }

	@Override
	public int compareTo(Person o) {
	    if (this.lastNameKana.equals(o.lastNameKana)) {
	      return this.firstNameKana.compareTo(o.firstNameKana);
	    } else {
	      return this.lastNameKana.compareTo(o.lastNameKana);
	    }
	}

	@Override
	public String toString() {
	    return this.lastNameKana + " " + this.firstNameKana;
	}
	*/
	
	//オブジェクトを複製する～cloneメソッド～
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	}

	@Override
	public Person clone() {
	    Person p = null;
	    try {
	      p = (Person)super.clone();
	    } catch (CloneNotSupportedException e) {
	      throw new AssertionError();
	    }
	    return p;
	}

	@Override
	public String toString() {
	    return this.lastName + this.firstName;
	}
	
}
