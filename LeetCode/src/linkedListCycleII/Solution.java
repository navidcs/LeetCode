package linkedListCycleII;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public class Solution {
	
    public ListNode detectCycle(ListNode head) {
    	if (head == null)
    		return null;
    	if (head.next == null) // is not necessary
    		return null;


    	ListNode slow = head.next;
    	ListNode fast = head.next.next;  //head.next
    	while(slow != fast && fast.next != null && fast != null){ //slow == fast at the beginning
    							//fast != null && fast.next != null
    		System.out.println("inside loop");
        	System.out.println("slow is: "+slow.val);
        	System.out.println("fast is: "+fast.val);
    		slow = slow.next;
    		fast = fast.next.next;

    	}
    	if(slow!=fast)
    		return null;
    	//35 min
//    	HashSet<ListNode> hs = new HashSet<ListNode>();
//    	slow = head;
//    	hs.add(slow);
//    	while(slow.next != null && !hs.contains(slow.next)){
//    		hs.add(slow.next);
//    		slow = slow.next;
//    	}
//    	return slow; //the node before loop
//    	// return slow.next (returns the first node in the loop)
//    	//41 min
//    	
    	slow = head;
    	System.out.println("slow is: "+slow.val);
    	System.out.println("fast is: "+fast.val);
    	while(slow.next != fast.next) {
    		slow = slow.next;
    		fast = fast.next;
    	}	
    	// if you want the node before the loop
    	return fast;//from head

    }

	public static void main(String[] args) {
		ListNode listNode = new ListNode(3);
		ListNode home = listNode;
//		ListNode tempListNode = home;
		ListNode tempListNode = home;
		ListNode tempListNode2 = home;
		
//		ArrayList<Integer> arrayList;
		for (int i = 4; i < 10; i++) {
			listNode.next = new ListNode(i);
			listNode = listNode.next;
			if(i==6){
				 tempListNode = listNode;
			}
		}
		listNode.next = tempListNode;
		Solution solution = new Solution();
		int count = 0;
		while(home!= null && count< 33){
			System.out.println(home.val);
			home = home.next;
			++count;
		}
		
		System.out.println();
		System.out.println(solution.detectCycle(tempListNode2).val);

	}

}
