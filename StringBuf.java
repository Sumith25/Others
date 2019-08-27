
public class StringBuf {
	
	protected StringBuf() {}
	
	public static void main( final String [] args) {
		StringBuffer buf = new StringBuffer("java");
		buf.append(" Guide Ver1/");
		buf.append(3);
	int index = 5;
	buf.insert(index, "Student ");
	index =23;
	buf.setCharAt(index,'.');
	int start = 25;
	int end = 26;
	buf.replace(start, end, "8");
	String s = buf.toString();
		System.out.println(s);
	}

}
