package DAY09;

public class _206 {
    static class ListNode {
      int val;
        ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        ListNode n0 = new ListNode(0);

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        reverseList(n0);
        printNode(n0);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode firstNode = head;
        ListNode node = head.next;
        ListNode nextNode = node.next;

        do {

            head = new ListNode(node.val, nextNode);
            node = nextNode;
            nextNode = node.next;
            System.out.println(head.val);
            System.out.println(node.val);

        }while (nextNode != null);

        return head;
    }
    public static void printNode(ListNode headNode) {
        if(headNode == null) System.out.println("LinkedList rỗng");
        else {
            ListNode temp = headNode;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) System.out.print("->");
            }
            System.out.println();
        }
    }
}
