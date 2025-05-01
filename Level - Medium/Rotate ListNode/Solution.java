public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static public void insertAtEnd(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    static public void traverse(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        if (current == null) {
            System.out.print("Null");
        }
        System.out.println("");
    }

    static public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        int length = 1;
        ListNode prevcurrent = head;
        while (current.next != null) {
            length++;
            prevcurrent = current;
            current = current.next;
        }

        k = k % length;
        if (k == 0) return head;

        prevcurrent.next = null; 
        ListNode newHead = current;
        current.next = head;
        head = newHead;

        head = rotateRight(head, k - 1);
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        insertAtEnd(head, 2);
        insertAtEnd(head, 3);
        insertAtEnd(head, 4);
        insertAtEnd(head, 5);

        System.out.println("Original list:");
        traverse(head);

        head = rotateRight(head, 1000); 
        System.out.println("List after rotation:");
        traverse(head);
    }
}
