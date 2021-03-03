package LeetCode.BST;

import java.util.Stack;

public class PracticeBST {


    public static ListNode removeElements(ListNode head, int val) {



        ListNode dummy = new ListNode(0);
        head.next = dummy;

        ListNode p = dummy;

        while(p != null){
            if(p.next.val == val){
                p.next = head;
                p.next = p.next.next;
            }else{

            }
        }



        return dummy.next;
    }



    public static void main(String[]args){
        LinkedList rmlist = new LinkedList();

        rmlist.push(1);
        rmlist.push(2);
        rmlist.push(6);
        rmlist.push(3);
        rmlist.push(4);
        rmlist.push(6);
        rmlist.push(6);


        rmlist.printList();


        removeElements(rmlist.head, 6);
        System.out.println();

        System.out.println("Print after removing duplicate" );

        rmlist.printList();
    }
}
