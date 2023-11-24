package to.msn.wings.selflearn.chap02;

public class Chap02Practice {

	public static void main(String[] args) {
		int radius;
	    radius = 5;
	    System.out.println(radius * radius * 3.14);
	    
	    var radius2 = 5;
	    System.out.println(radius2 * radius2 * 3.14);
	    System.out.println(((Object)radius2).getClass().getSimpleName());
	}

}
