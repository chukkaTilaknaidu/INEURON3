///Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

//Note that you must do this in-place without making a copy of the array.

//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Example 2:
//Input: nums = [0]
//Output: [0]

//Constraints:
//a. 1 <= nums.length <= 10^4
//b. -2^31 <= nums[i] <= 2^31 - 1
package Tarun;
import java.util.*;
class Arrays{
	int a;
	int c=0;
	
	
	void UserInput() {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER ARRAY SIZE");
	a=scan.nextInt();
	
	int[]b=new int[a];
	
	
	for(int i=0;i<a;i++) {
		System.out.println("please enter "+i+ " index");
		b[i]=scan.nextInt();
	}	
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(b[i]<b[j]) {
				c=b[i];
				b[i]=b[j];
				b[j]=c;
			}
		}
		
	}
	
	
	for(int i=a-1;i>=0;i--) {
		System.out.println(b[i]);
		
	}
	
	}
	}


public class Ineuron2 {
	public static void main(String[] args) {
		Arrays ar=new Arrays();
		ar.UserInput();
	}
}
