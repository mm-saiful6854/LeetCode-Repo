/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        Stack<ListNode> stack = new Stack<>();
        while(fast!=null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        int mx = Integer.MIN_VALUE;
        while(!stack.empty()){
            ListNode top = stack.pop();
            mx = Math.max(mx, slow.val + top.val);
            slow = slow.next;
        }
        return mx;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna