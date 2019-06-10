package leetcode;
class No461 {
    public int hammingDistance(int x, int y) {
        int i = x^y;
        int count = 0;
        while(true){
            if(i==0){
                break;
            }
            i = (i&i-1);
            count++;
        }
        return count;
    }
}