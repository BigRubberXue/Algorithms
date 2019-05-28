package leetcode;
class No5 {
    public String longestPalindrome(String s) {
        //List<Integer> list = new ArrayList<>();
        if(s.length()<=1){
            return s;
        }
        int maxL=0;
        int[] range = new int[2];
        for(int i=0;i<s.length();i++){
            int mid = i;
            int sameNum = 1;
            while(mid+sameNum<s.length()&&s.charAt(mid)==s.charAt(mid+sameNum)){
                sameNum++;
            }
            if(sameNum>range[1]-range[0]){
                range[0]=mid;
                range[1]=mid+sameNum-1;
            }
            for(int j=0;j<s.length()&&j>=0;j++){
                if(mid-j-1<0||mid+sameNum+j>=s.length()){
                    if(2*j+sameNum>range[1]-range[0]){
                        range[0]=mid-j;
                        range[1]=mid+sameNum+j-1;
                    }
                    break;
                }
                if(s.charAt(mid-j-1)!=s.charAt(mid+sameNum+j)){
                    if(2*j+sameNum-1>range[1]-range[0]){
                        range[0]=mid-j;
                        range[1]=mid+sameNum+j-1;
                    }
                    break;  
                }
            }
        }
        return s.substring(range[0],range[1]+1);
    }
}