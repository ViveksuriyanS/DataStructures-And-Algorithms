package leetcode.easy;

public class MergeTwoSortedList {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode currNode = null;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) if (l1.val < l2.val) {
                currNode = l1;
                l1 = l1.next;
            } else {
                currNode = l2;
                l2 = l2.next;
            }
            else if (l1 == null) {
                currNode = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                currNode = l1;
                l1 = l1.next;
            }

            if (head == null) {
                head = currNode;
            } else {
                ListNode tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = currNode;
            }
        }

        return head;
    }
}


class ListNode {
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
