package week12;

public class RemoveDuplicatesFromLinkedList {
    //You're given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.
    //Write a function that returns a modified version of the Linked List that doesn't contain any nodes with
    //duplicate values. The Linked List should be modified in place (i.e., you shouldn't create a brand-new list), and
    //the modified Linked List should still have its nodes sorted with respect to their values. Each LinkedList node
    //has an integer value as well as a next node pointing to the next node in the list or to None / null if it's the tail
    //of the list.
    //Example 1:
    //Input: head = [1,1,2,3,3]
    //Output: [1,2,3]
    //Example:
    //Input: [1, 1, 3, 4, 4, 4, 5, 6, 6] // the head node with value 1
    //Output: [1, 3, 4, 5, 6] // the head node with value 1
    //Constraints:
    //• The number of nodes in the list is in the range [0, 300].
    //• -100 <= Node.val <= 100
    //• The list is guaranteed to be sorted in ascending order.
    //Please, try to test your solution via JUnit and also test your solution here:
    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/



    public static ListNode deleteDuplicates(ListNode head) {
        //0 ms Beats 100.00% of users with Java
        //43.93 MB Beats 58.61% of users with Java

        ListNode current = head;
        while (current != null && current.next != null){
            while (current.val == current.next.val ) {
                if(current.next.next != null)
                current.next = current.next.next;
                else {
                    current.next = null;
                    break;
                }
            }

            current = current.next;
        }
        return head;
    }


    public static void main(String[] args) {

        ListNode nod1 = new ListNode(1);
        ListNode nod2 = new ListNode(1);
        ListNode nod3 = new ListNode(1);
        ListNode nod4 = new ListNode(3);
        ListNode nod5 = new ListNode(3);
        nod1.next = nod2;
        nod2.next = nod3;
        nod3.next = nod4;
        nod4.next = nod5;




        ListNode current = nod1;

        while (current != null) {
            // Process or print the data of the current node
            System.out.println("current.val = " + current.val);

            // Move to the next node
            current = current.next;
        }

        System.out.println("----------------------------------After deleting duplicates----------");

        ListNode modifiedNode = deleteDuplicates(nod1);


         current = modifiedNode;

        while (current != null) {
            // Process or print the data of the current node
            System.out.println("current.val = " + current.val);

            // Move to the next node
            current = current.next;
        }

    }


}
