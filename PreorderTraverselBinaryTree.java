import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        Node left = null;
        Node right= null;
    }
}
public class CreationOfBinaryTree {
    static Scanner sc = new Scanner(System.in);
    public static Node createBinaryTree()
    {
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if(data == -1)
        {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the data for left of "+data);
        root.left = createBinaryTree();
        System.out.println("Enter the data for right of "+data);
        root.right = createBinaryTree();

        return root;
    }
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
       Node root = createBinaryTree();
        preOrder(root);
    }
}
