	public Node rotateDLL(Node start, int p) {
		//Write your code here
		if(start == null)
		{
		    return start;
		}
		int i = 1;
		Node pointer = start;
		Node temp = start;
	    while(pointer.next!=null)
	    {
            if(i<=p)
            {
                temp = pointer;
            }
            pointer  = pointer.next;
	    }
	    pointer.next = start;
	    start.prev = pointer;
	    start = temp.next;
	    temp.next = null;
	    start.prev = null;
	    return start;
	}
