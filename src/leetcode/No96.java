package leetcode;
class No96 {
    public int numTrees(int n) {
        int[] res = new int[n+1];
        res[0]=1;
        for(int i=1;i<=n;i++){
            int[] find = new int[i+1];
            for(int j=1;j<=i;j++){
                find[j]=res[j-1]*res[i-j];
                res[i]+=find[j];
            }
            
        }
        return res[n];
    }
}