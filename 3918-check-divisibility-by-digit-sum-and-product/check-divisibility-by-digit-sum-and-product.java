class Solution {
    public boolean checkDivisibility(int n) {
        int digitsum=0;
        int product=1;
        int x=n;

        while(x!=0){
            int digit=x%10;
            digitsum +=digit;
            product *=digit;
            x /= 10;
        }
        return n%(digitsum+product)==0;

    }
}