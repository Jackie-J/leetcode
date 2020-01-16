package vip.jackie.algorithm;

public class Test {
    
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tem1 = l1, tem2 = l2, temResult = new ListNode(0), result = temResult;
        int carry = 0;
        while (tem1 != null || tem2 != null) {
            int i = tem1 != null ? tem1.val : 0;
            int j = tem2 != null ? tem2.val : 0;
            int k = (i + j) % 10;
            carry = (i + j) / 10;
            temResult.val += k;
            
            temResult.next = new ListNode(carry);
            temResult = temResult.next;
            
            tem1 = tem1 == null ? null : tem1.next;
            tem2 = tem2 == null ? null : tem2.next;
        }
        if (carry > 0) {
            temResult.next = new ListNode(carry);
        } else {
            temResult.next = null;
        }
        return result;
    }
    
}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}