
public class joinupLoReplaceTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="    narendr is bad boy";
		String s1=String.join("-","a","b");//a-b
		String s2=String.join("@","k","j");//k@j
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		String s3=s.replace('b','c');
		System.out.println(s3);
		String s4=s3.replace("c", ".");
		System.out.println(s4);

		System.out.println(s.length());
		String s5=s.trim();
		System.out.println(s5);
		System.out.println(s5.length());


	}

}
