import java.util.StringTokenizer;
public class TokensWithDelimeter {
	public static void main(String a[]) {
		String msg = "http://10.123.43.67:80/";
		StringTokenizer st = new StringTokenizer(msg,"://.",true);
		String[] s = msg.split("//");
		for(String ss :s)
		System.out.println(ss);
//		while(st.hasMoreElements()) {
//			System.out.println(st.nextToken());
//		}
	}

}
