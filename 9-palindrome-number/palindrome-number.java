class Solution {
    public boolean isPalindrome(int x)
     {
        int temp;
        temp=x;
         int digit=0;
         int reversed=0;
        while(temp>0)
       {
            digit=temp%10;
            reversed=reversed*10+digit;
            temp=temp/10;
       }

       if (reversed==x)
       {
        return true;
       }
       else
       {
        return false;
       }
        
    }
}