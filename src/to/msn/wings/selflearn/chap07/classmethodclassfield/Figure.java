package to.msn.wings.selflearn.chap07.classmethodclassfield;

public class Figure {
	
	/*クラスメソッド
	public static double getTriangleArea(double width, double height) {
	    return width * height / 2;
	}
	*/
	
	public static double pi = 3.14;
	public static void getCircleArea(double r) {
		System.out.println("円の面積は" + r * r * pi);
	}
}
