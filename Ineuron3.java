package Tarun;
import java.util.*;
class Solution {
	
	
    public int firstUniqChar(String z) {
    	
    	
        char[] a = z.toCharArray();
  
  for(int i=0; i<a.length;i++){
   if(z.indexOf(a[i])==z.lastIndexOf(a[i]))
   return i;
  }
  return -1;
  
    }
    
    
}





public class Ineuron3 {
public static void main(String[] args) {
	Solution s1=new Solution();
	
	
	s1.firstUniqChar("Tilaknaidu");
		
	}
}
