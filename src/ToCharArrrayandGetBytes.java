import java.util.Arrays;

public class ToCharArrrayandGetBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="narendra is good";
		char a[]=s.toCharArray();
		System.out.println(Arrays.toString(a));
		byte aa[]=s.getBytes();
		System.out.println(Arrays.toString(aa));
		 String sss=String.valueOf(7855);
		 System.out.println(s);
		 

	}

}
