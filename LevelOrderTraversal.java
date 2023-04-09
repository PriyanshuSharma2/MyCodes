class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> Arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node currentNode = q.poll();
            Arr.add(currentNode.data);
            if(currentNode.left!=null){
                q.add(currentNode.left);
            }
             if(currentNode.right!=null){
                q.add(currentNode.right);
            }
        }
        return Arr;
    }
}
