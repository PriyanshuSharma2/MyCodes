class Solution
{
 static void insert(int arr[],int i)
 {
      // Your code here
      for(i=1;i<arr.length;i++){
          int j=i-1;
          int key=arr[i];
          
          while(j>=0 && arr[j]>key){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=key;
      }
 }
 //Function to sort the array using insertion sort algorithm.
 public void insertionSort(int arr[], int n)
 {
     //code here
     for(int i=0;i<n;i++){
         insert(arr,i);
     }
 }
}
