class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    Node temp = head1;
	    int count = 0;
	    
	    while(temp!=null){
	        count++;
	        temp = temp.next;
	    }
	    if(count%2==0){
	        return 0;
	    }
	    return 1;
	}
}
