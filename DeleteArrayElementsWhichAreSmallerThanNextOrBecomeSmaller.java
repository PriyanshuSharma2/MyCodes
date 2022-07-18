class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> deleteElement (int arr[], int n, int k) {
        //Complete the function
        Stack<Integer> stk = new Stack<Integer>();
        ArrayList<Integer> Arr = new ArrayList<Integer>();
      
        int count = 0;
        stk.push(arr[0]);
        for(int i = 1; i<n;i++){
            while(!stk.isEmpty() && count<k && stk.peek()<arr[i]){
                stk.pop();
                count++;
            }
            stk.push(arr[i]);
        }
        while(!stk.isEmpty()){
        Arr.add(0,stk.pop());
        }
        return Arr;
    }
    
    }
