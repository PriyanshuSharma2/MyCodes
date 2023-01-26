class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i = 0 ; i<a.length; i++){
                      int temp = a[i];
                      int num = 0 ;
                      while(temp>0){
                          int lastDigit = temp%10;
                          num = (num*10)+lastDigit;
                          temp = temp/10;
                      }
                      if(num!=a[i]) return 0;
                  }
                  return 1;
           }
           
}
