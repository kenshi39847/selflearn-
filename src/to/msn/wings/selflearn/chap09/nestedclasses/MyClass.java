package to.msn.wings.selflearn.chap09.nestedclasses;

public class MyClass {
	private static class MyHelper {
	    public void show() {
	      System.out.println("Nested class is running!");
	    }
	}

	public void run() {
	    var helper = new MyHelper();
	    helper.show();
	}

}
