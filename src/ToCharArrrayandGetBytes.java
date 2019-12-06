import java.util.Arrays;

public class ToCharArrrayandGetBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="narendra is good";
		char[] c=s.toCharArray();
		byte[]b=s.getBytes();
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(b));
		System.out.println(c.length);


	}

}
