package teat;

public class Question1 {

	public static void main(String[] args) {

		Solution s1= new Solution();
		
		String rremove = s1.rremove("geeksforgeek");
		System.out.println(rremove);
		
		
	}

}

class Solution{
    String rremove(String s) {
        // code here
        
        String prev ="";
        String res = s;
        
        while(prev.length() != res.length()){
            
            prev = res;
            res = solve(res);
        }
        
        return res;
    }
    
    
    
    
  public static String solve(String s){

   int i=0,n=s.length();
    String ans = "";
    
    while(i<n){
     
     if(i <n-1 && s.charAt(i) == s.charAt(i+1)){

        while(i<n-1 && s.charAt(i) == s.charAt(i+1)){ i++;}
        i++;
      }
     else{
        ans = ans + s.charAt(i);
        i++;
      }
      
    }

    return ans;
  }
    
    
  
    
}