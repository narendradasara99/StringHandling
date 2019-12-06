import java.util.Arrays;
public class Split {
	public static void main(String[] args) {
		String s="java by narendra.txt";
		String[] s1=s.split("a");
		System.out.println(Arrays.toString(s1));
		String[] s2=s.split("n");
		System.out.println(Arrays.toString(s2));
		String[] s3=s.split("\\.");
		System.out.println(Arrays.toString(s3));
	}
}
