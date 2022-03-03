class node
{
    int data;
    node next;
    node(int data)
    {
        this.data = data;
    }
}
class queue
{
    node head=null;
    node tail=null;
    public boolean isEmpty()
    {
        return tail==null && head== null;
    }
}
public class practice {
    public static void main(String[] args) {

    }
}
