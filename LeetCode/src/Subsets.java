import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Subsets {

    public static List<List<Integer>> subsets(int[] S) {
//    	ArrayList<Integer> input = new 	ArrayList<Integer> ();
    	int NumberOfElements = S.length;
    	int twoToThePowerOfNumberOfElements = (int) Math.pow(2, NumberOfElements);
    	List<List<Integer>> combinationList = new ArrayList() ;
    	Arrays.sort(S);
    	
    	for (int i = 0; i < twoToThePowerOfNumberOfElements; i++) {
    		ArrayList<Integer> tempArrayList = new ArrayList<>();
    		for (int j = 0; j < S.length; j++) {
    			if ((i >> j) % 2 == 1){
    				tempArrayList.add(S[j]);
    				System.out.println("j = " + j  );
    				
    			}
    			
				
			}
    		System.out.println(tempArrayList);
			combinationList.add(tempArrayList);
		}

    	
		return combinationList;
        
    }

    public static void main(String[] args) {
    	
    	int [] testArray = {4, 1, 0};
    	System.out.println(subsets(testArray));

	}

}
