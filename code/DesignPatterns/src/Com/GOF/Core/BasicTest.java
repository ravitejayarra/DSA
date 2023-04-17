package Com.GOF.Core;


class util{
	
	
	static String str = new String("hello");
	
	
	static {
		str = "static hello";
		System.out.println(str);
	}
	
	util(){
		str = "constructor hello";
		System.out.println(str);
	}
	
	{
		str = " non static hello";
		System.out.println(str);
	}
	
}



public class BasicTest {
	
	
	public static void main(String[] args) {
		util u = new util();
		
		//System.out.println(u.str);
		
	}

}
