class Solution {
    public boolean isPalindrome(int x) {
        int temp= 0;
        int rem=0;
        int y =x;

        if(x < 0)
        {
            return false;
        }
        
        while(x != 0)
        {
            rem = x % 10;
            x = x/10;
            temp = (temp * 10) + rem;
        } 
        System.out.println(temp);

        if(temp == y)
            return true;
        else return false;
    }
}
