class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null) return 0;
       int lefth = height(node.left);
       int righth = height(node.right);
       int max = Math.max(lefth,righth)+1;
       return max;
    }
}
