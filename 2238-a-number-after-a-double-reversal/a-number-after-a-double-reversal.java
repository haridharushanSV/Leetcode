class Solution {
    public boolean isSameAfterReversals(int num) {
    //   int revNum=0,revNum1=0,rev=0;
    //   int n=num;
    //     while(n>0){
    //          revNum = revNum * 10 + n % 10;
    //         n = n / 10;
            
    //     }
    //     rev=revNum;
    //      while(rev>0){
    //          revNum1 = revNum1 * 10 + rev % 10;
    //         rev = rev / 10;
            
    //     }

    //     System.out.println(revNum1);
    //             System.out.println(num);

    
    // return num==revNum1;
    int a=num%10;
    // if(num<10){
    //     return true;
    // }
    // else if(a==0){
    //     return false;
    // }
   // return true;
   // return num<10?a==0:true;
    return (num < 10) ? true : (a == 0) ? false : true;
}}