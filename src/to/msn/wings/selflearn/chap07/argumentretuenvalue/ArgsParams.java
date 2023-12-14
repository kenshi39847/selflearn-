package to.msn.wings.selflearn.chap07.argumentretuenvalue;

public class ArgsParams {
	public int totalProducts(int... values) {
		var result = 1;
		for(var value : values) {
			result *= value;
		}
		return result;
	}
}
