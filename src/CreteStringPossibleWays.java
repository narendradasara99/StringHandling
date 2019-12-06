

public class CreteStringPossibleWays {

	public static void main(String[] args) {

		//1)String()
		String s1= new  String();


		//2)String(String original)
		String s2 = new String(" narendra dasara");
		System.out.println(s2);

		//3)String(char value[])
		char v[]= {'n','a','r','e','n','d','r','a'};
		String s3= new  String(v);
		System.out.println(s3);

		//4) String(StringBuffer buffer)
		StringBuffer b =new StringBuffer(" narendra");
		String s4 =new String(b);
		System.out.println(s4);

		//5)String(StringBuilder builder)
		StringBuilder b1= new StringBuilder("narendra");
		String s5= new String(b1);
		System.out.println(s5);


		//6) public String(char value[], int offset, int count) // create new strig of given char
		char v1[]= {'n','a','r','e','n','d','r','a'};
		String s6= new  String(v1,2,6);
		System.out.println(s6);//rendra

		//7)String(byte bytes[], int offset, int length)
		byte byt[]= {'n','a','r','e','n','d','r','a'};
		String s7= new  String(byt,1,7);
		System.out.println(s7);//arendra

		//8)String(byte bytes[])
		byte by[]= {'n','a','r','e','n','d','r','a'};
		String s8= new  String(by);
		System.out.println(s8);//narendra




	}

}
