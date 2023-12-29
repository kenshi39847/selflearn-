package to.msn.wings.selflearn.chap09.objectclass;

import java.util.Objects;

public class ObjectHash {
	//オブジェクトのハッシュ値を取得する～hashCode～
	private boolean boolValue;
	private int intValue;
	private long longValue;
	private float floatValue;
	private double doubleValue;
	private String stringValue;
	@Override
	public int hashCode() {
		return Objects.hash(boolValue, doubleValue, floatValue, intValue, longValue, stringValue);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectHash other = (ObjectHash) obj;
		return boolValue == other.boolValue
				&& Double.doubleToLongBits(doubleValue) == Double.doubleToLongBits(other.doubleValue)
				&& Float.floatToIntBits(floatValue) == Float.floatToIntBits(other.floatValue)
				&& intValue == other.intValue && longValue == other.longValue
				&& Objects.equals(stringValue, other.stringValue);
	}
	
	
}
