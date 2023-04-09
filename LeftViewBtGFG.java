class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> Arr = new ArrayList<>();
      if(root==null) return Arr;
      int level=0;
      LeftView(Arr,root,level);
      return Arr;
    }
    public static void LeftView(ArrayList<Integer> Arr, Node root, int level){
        if(root == null) return ;
        if(level==Arr.size()){
            Arr.add(root.data);
        }
        LeftView(Arr,root.left,level+1);
        LeftView(Arr,root.right,level+1);
       
    }
}
