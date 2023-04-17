package Com.GOF.Core;

  class Singleton_DateUtil {

	
	private static Singleton_DateUtil dateUtil;  // 3. declare a static member of same class type
	
	private Singleton_DateUtil() { }             // 1 . define constructor as private
	
	
	//private static Singleton_DateUtil dateUtil = new Singleton_DateUtil();  == early initlization
	
	public static Singleton_DateUtil getInstance() {
	
		if(dateUtil == null) {
		 dateUtil = new Singleton_DateUtil();       // 2. declare a public static method return instance
		}                                           //   lazy initialization
		return dateUtil;
		
	}

}
  
  
  
 
 
 public class Singleton{
	 
	 public static void main(String[] args) {
		
		 Singleton_DateUtil util = Singleton_DateUtil.getInstance();
		 
		 Singleton_DateUtil util2 = Singleton_DateUtil.getInstance();
		 
		 Singleton_DateUtil util3 = Singleton_DateUtil.getInstance();
		 
		 System.out.println(util.toString());
		 
		 System.out.println(util2.toString());
		 
		 System.out.println(util3.toString());
		 
		 if(util==util2 && util == util3) {
			 System.out.println(true);
		 }
		 
	}
	 
 }
