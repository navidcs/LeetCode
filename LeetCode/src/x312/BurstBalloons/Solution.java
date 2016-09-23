package x312.BurstBalloons;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//import com.google.common.primitives.Ints;


public class Solution {
	
	public int maxCoins(int[] nums){
		//depending on input, "sum" (or output) might need to be long.
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int n : nums){
			if(n>0){
				list.add(n);
			}
		}
		if(list.size() == 0)
			return 0;
		if(list.size() ==1)
			return list.get(0);
		int max = list.get(0);
		int index = 0;
		for(int i = 1 ; i < list.size(); ++i){
			if(list.get(i)>max){
				max = list.get(i);
				index = i;
			}
		}
		while(list.size()>index+2){
			sum+=list.get(index+1)*list.get(index+2);
			list.remove(index+1);
		}
		if(list.size() == index + 2){
			sum+=list.get(index + 1);
			list.remove(index+1);
		}
		while(list.size()>2){
			--index;
			sum+=list.get(index)*list.get(index-1);
			list.remove(index);
		}
		if(list.size()==2){
			sum += list.get(0);
		}
		return sum * max;
	}


	public int maxCoins2(int[] nums){
		ArrayList<Integer> list = new ArrayList<Integer>();
				//Arrays.asList(nums);
				//Arrays.asList(ArrayUtils.toObject(nums));  
				//new ArrayList<Integer>(Arrays.asList(nums));
		for(int n : nums){
			if(n>0)
				list.add(n);
		}
		int sum = 0;
		while(list.size()>2){
			int min = list.get(0);
			int index = 0;
			for(int i = 1 ; i < list.size() ; ++i){
				if(list.get(i) < min){
					index = i;
					min = list.get(i);
				}
			}
			if(index > 0)
				min *=list.get(index-1);
			if(index+1 < list.size())
				min *=list.get(index+1);
			sum+=min;
			list.remove(index);
		}	
		if(list.size()==2){
			sum+= list.get(0)*list.get(1);
			sum+= Math.max(list.get(0), list.get(1));
		}
		else if (list.size()==1) {
			sum+=list.get(0);
		}
				
		return sum;
	  }
	

	public static void main(String[] args) {
		int[] arr = {3,1,5,8};
		Solution solution = new Solution();
		System.out.println(solution.maxCoins(arr));

	}

}
