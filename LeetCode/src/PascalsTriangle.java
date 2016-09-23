//import static java.util.Arrays.asList;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//import java.awt.List;
//import java.util.ArrayList;



public class PascalsTriangle {

		

	public List<List<Integer>> generate(int numRows) {
		  List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		  if (numRows <=0)
			  return listOfList;

		 
			  List<Integer> firstInnerList = new ArrayList<Integer>() ;
				firstInnerList.add(1);
				
				listOfList.add(firstInnerList);
		  
		
		  for (int i = 1; i < numRows; i++) {

			  List<Integer> innerList = new ArrayList<Integer>() ;
			  innerList.add(1);
			  for (int j = 1; j < i ; j++) {
				  innerList.add(listOfList.get(i-1).get(j-1) + listOfList.get(i -1).get(j));
			  }
			  innerList.add(1);
			  listOfList.add(innerList);
			  
		  }
		  

	        return listOfList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle pascalsTriangle = new PascalsTriangle();
		System.out.println("before");
		List<List<Integer>> myList = pascalsTriangle.generate(5);
		System.out.println("after");
		for (List<Integer> tempList : myList) {
			System.out.println(tempList);
			System.out.println(Arrays.toString(tempList.toArray()));
		}
		System.out.println(Arrays.toString(myList.toArray()));

	}

}
