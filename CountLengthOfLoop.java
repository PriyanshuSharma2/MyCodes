 static int countNodesinLoop(Node head)
    {
        //Add your code here.
        if(head == null || head.next==null)
        {
            return 0;
        }
        Node slow = head;
        Node fast = head;
        Node meet = null;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }
        if(fast == null || fast.next == null)
        {
            return 0;
        }
        int count = 1;
        if(slow == head)
        {
            while(slow.next!=head)
            {
                slow=slow.next;
                count++;
            }
            return count;
        }
        slow = slow.next;
        while(slow!=fast)
        {
          slow = slow.next;
          count++;
        }
        return count;
    }
