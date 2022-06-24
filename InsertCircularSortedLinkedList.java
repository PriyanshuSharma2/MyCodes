public static Node sortedInsert(Node head,int data)
         {
            //add code here.
            Node newnode = new Node(data);
            Node current = head;
            if(head == null)
            {
                head = newnode;
                newnode.next = head;
                return head;
            }
            else if(current.data>newnode.data)
            {
                while(current.next!=head)
                {
                    current = current.next;
                }
                current.next = newnode;
                newnode.next = head;
                head = newnode;
                return head;
            }
            
                while(current.next!=head && current.next.data<newnode.data)
                {
                    current = current.next;
                }
                newnode.next = current.next;
                current.next = newnode;
            return head;
         }
