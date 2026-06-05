class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode n = head; 
        int count = 0;
        if(head==null) {
            return head;
        }
        while(n!=null) {
            n = n.next;
            count++;
        }
        k = k%count;
        for(int i =0;i<k;i++) {
            ListNode node = head;  
            ListNode tailPre = node;
            ListNode tail;
            while(node.next!=null) {
                tailPre = node;
                node = node.next;
            }
            tail = node;
            tail.next = head;
            head = tail;
            tailPre.next = null;
        }  
        return head;  
    }
}
