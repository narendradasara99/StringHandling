
public class ToString {

	int  x;
	public ToString(int x){
		this.x=x;
	}
	
	
	@Override
	public String toString() {
		return x+"";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="naren";
		System.out.println(s);
		System.out.println(s.toString());
		ToString t=new ToString(444);
		System.out.println(t.toString());
		
		
		

	}

}
