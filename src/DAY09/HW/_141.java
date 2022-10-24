public class _141 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(1);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node4;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        int pos = 1;
        if (head == null || head.next == null) {
            return false;
        }
        if (head.next == head)
            return true;
        // ListNode firstNode = head;
        ListNode temp = head.next;

        if (temp.next == null)
            return false;

        while (temp.next != null) {
            // pos++;
            // for (int i = pos - 1; i >= 0; i--) {
            //     if (firstNode.next == temp.next || temp.next == head.next)
            //         return true;
            //     else {
            //         firstNode = firstNode.next;
            //     }
            // }
            temp = temp.next;
            // firstNode = head;
            if (temp.next == null) return false;

        }
        return true;

    }
}