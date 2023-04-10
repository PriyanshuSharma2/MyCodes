class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        
        if(node==null) return -1;
      return min(node);
    }
    public static int min(Node node){
        if(node.left==null) return node.data;
          return Math.min(node.data,min(node.left));
    }
}
