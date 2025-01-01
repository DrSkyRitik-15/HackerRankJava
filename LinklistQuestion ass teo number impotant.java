import java.util.LinkedList;
import java.util.Collections;



class Solution {
    // Method to convert ListNode to LinkedList
    public LinkedList<Integer> convertToList(ListNode node) {
        LinkedList<Integer> list = new LinkedList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }

    // Method to convert LinkedList to ListNode
    public ListNode convertToListNode(LinkedList<Integer> list) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int val : list) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Method to add two numbers represented by LinkedLists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> list1 = convertToList(l1);
        LinkedList<Integer> list2 = convertToList(l2);
        LinkedList<Integer> result = new LinkedList<>();

        int carry = 0;
        int maxLength = Math.max(list1.size(), list2.size());
        for (int i = 0; i < maxLength; i++) {
            int x = (i < list1.size()) ? list1.get(i) : 0;
            int y = (i < list2.size()) ? list2.get(i) : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            result.add(sum % 10);
        }
        if (carry > 0) {
            result.add(carry);
        }

        // Reverse the resultant list using Collections.reverse
        // Collections.reverse(result);
        return convertToListNode(result);
    }
}
