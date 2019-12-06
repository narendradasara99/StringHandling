
public class HashEqals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="";
		String s1=" ";

		String s3="a";
		String s4="A";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));

		

	}

}
