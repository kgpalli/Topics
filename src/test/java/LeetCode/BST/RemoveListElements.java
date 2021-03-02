package LeetCode.BST;

public class RemoveListElements {

    public static ListNode removeElements(ListNode head, int val) {

        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode p = helper;

        while(p.next != null){
            if(p.next.val == val){
                ListNode next = p.next;
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
       return helper.next;
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
