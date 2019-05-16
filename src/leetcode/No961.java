package leetcode;

public class No961 {
    public int repeatedNTimes(int[] A) {
        int left = A[0];
        int right = A[A.length-1];
        int mid = left+(right-left)/2;
        return Math.max(repeatedNTimes(A,left,mid)[0],repeatedNTimes(A,mid+1,right)[0]);
    }
    public int[] repeatedNTimes(int[] A,int left,int right){
        if(right<=left){
            return new int[]{0,0};
        } else if(right-left==1){
            return new int[]{Math.max(A[left],A[right]),1};
        }
        int mid = left+(right-left)/2;
        return new int[]{Math.max(repeatedNTimes(A,left,mid)[0],repeatedNTimes(A,mid+1,right)[0]),
                Math.max(repeatedNTimes(A,left,mid)[1],repeatedNTimes(A,mid+1,right)[1])};
    }
}
