class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
//         int f0=0;
//         int f1=1;
        
//         int sum=0;
        
//        while(n>1){
//            sum=f0+f1;
//            f0=f1;
//            f1=sum;
//            n--;
//        }
//         return sum;
        
        int f0=fib(n-1);
        int f1=fib(n-2);
        int sum=f0+f1;
        return sum;
        
    }
}