package TT_Smartlog.Day2.ListNodes;

public class Swap_Nodes_in_Pairs {
    public static ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy;

        while(cur.next!=null && cur.next.next!=null){
            ListNode first=cur.next;
            ListNode sec=cur.next.next;

            first.next=sec.next;
            sec.next=first;
            cur.next=sec;

            cur=first;

        }

        return dummy.next;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Danh sách liên kết trước khi đảo cặp:");
        printList(head);

        ListNode result = Swap_Nodes_in_Pairs.swapPairs(head);

        System.out.println("\nDanh sách liên kết sau khi đảo cặp:");
        printList(result);
    }

}
