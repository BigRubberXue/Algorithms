package leetcode;
class No338 {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        int local = 0;
        for(int i=0;i<num+1;i++){
            res[i]=Integer.bitCount(local);
            local++;
        }
        return res;
    }
}
/*
class No338 {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0]=0;
        for(int i=1;i<num+1;i++){
            res[i]=res[i&(i-1)]+1;
        }
        return res;
    }
}

*/