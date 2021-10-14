package interpretorPattern;

public class InterpretorContext {
	public String getBinaryString(int i) {
		return Integer.toBinaryString(i);
	};
	public String getHexaString(int i) {
		return Integer.toHexString(i);
	}
}
