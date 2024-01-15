package to.msn.wings.selflearn.chap09.nestedclasses;

public class MyClass {
	/*
	private static class MyHelper {
	    public void show() {
	      System.out.println("Nested class is running!");
	    }
	}

	public void run() {
	    var helper = new MyHelper();
	    helper.show();
	}
	*/
	
	private String str1 = "包含・インスタンス";
	private static String str2 = "包含・クラス";

	private class MyHelper {
	    private String str1 = "ネスト・インスタンス";
	    private static final String str2 = "ネスト・クラス";

	    public void show() {
	      System.out.println(MyClass.this.str1);
	      System.out.println(MyClass.str2);
	    }
	}

	public void run() {
	    var helper = new MyHelper();
	    helper.show();
	    System.out.println(helper.str1);
	    System.out.println(MyHelper.str2);
	}

}
