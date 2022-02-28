class Queue
{
    int[] arr;
    int size;
    int front;
    int rear;
    Queue(int size)
    {
        this.size=size;
        arr = new int[size];
        front =-1;
        rear=-1;
    }
    public boolean isFull()
    {
       return rear==size-1;
    }
    public boolean isEmpty()
    {
       return rear==-1;
    }
    public void enqueue(int data)
    {
       if(isFull())
       {
           System.out.println("StackOverFLow");
           return;
       }
       rear++;
       arr[rear] = data;
    }
    public void dequeue()
    {
       if(isEmpty())
       {
           System.out.println("Queue is empty");
           return;
       }
        for (int i = 0; i < rear; i++) {
            arr[i]=arr[i+1];
        }
        rear--;
    }
    public void peek()
    {
       if(isEmpty())
       {
           System.out.println("QueueUnderFLow");
           return;
       }
       else {
           System.out.println(arr[0]);
       }
    }
}
public class QueueByArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        while (!q.isEmpty())
        {
q.peek();
q.dequeue();
        }
    }
}
