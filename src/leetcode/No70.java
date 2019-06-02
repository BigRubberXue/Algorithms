package leetcode;
class No70 {
    public int climbStairs(int n) {
        int d=1;
        int p=1;
        for(int i=1;i<n;i++){
            int temp = p;
            p=p+d;
            d=temp;
        }
        return p;
    }
}