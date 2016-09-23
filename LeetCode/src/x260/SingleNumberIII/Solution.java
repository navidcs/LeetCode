package x260.SingleNumberIII;

import java.util.Arrays;

public class Solution {
    public int[] singleNumber(int[] nums){
    	//First Xor Result
    	int fxr = 0;
    	for (int n : nums)
    		fxr ^= n;
    	//Bit Number
    	int bn = 0;
    	while(fxr % 2 == 0){
    		fxr/= 2;
    		++bn;
    	}
    	int x1 = 0;
    	int x0 = 0;
    	for (int n : nums){
    		if(isBitOne(n,bn)){
    			x1^= n;
    		}
    		else
    			x0^=n;
    	}
    	int[] result = new int[2];
    	result[0]=x0;
    	result[1]=x1;
    	return result;
    }
    
    public boolean isBitOne(int n, int bn){
    	n  = n>>bn;
    	if( n % 2 == 1 ) 
    		return true;
    	return false;
    }
    
    public static void main(String[] args){
    	Solution solution = new Solution();
    	int[] nums = { 132, 311, 5, 400, 600, 400, -2, 132, -2, 5};
    	System.out.println(Arrays.toString(solution.singleNumber(nums)));
    	int a = 12 ;
    	System.out.println(a &= -a);
    	int b = -5 & 7;
    	System.out.println(b);
    }


}