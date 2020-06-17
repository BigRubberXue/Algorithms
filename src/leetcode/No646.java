package leetcode;

import java.util.Arrays;

//add for test
public class No646 {
    public int findLongestChain(int[][] pairs) {
        int[] Dp = new int[pairs.length];
        //Dp方程表示取当前结点时最长数对链
        //Dp[n]=Dp[x]+1
        //Dp[x]表示为符合当前节点的最大Dp
        //x表示第X个数对,且数对的第二个数字小于n的第一个数字

        //先将各个数对按第一个数字排序排序

        //快排sort2(pairs,0,pairs.length-1),不能解决重复
        //冒泡sort1(pairs,0,pairs.length-1)
        //选择sort3(pairs,0,pairs.length-1);
        //
        Arrays.sort(pairs, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        //动态规划
        for(int i = 0 ;i<Dp.length;i++){
            int get = pairs[i][0];
            int[] catchNum = new int[i+1];
            for(int j=0;j<i;j++){
                if(pairs[j][1]<get){
                    if(Dp[i]<Dp[j]){
                        Dp[i]=Dp[j];
                    }
                }
            }
            Dp[i]++;
        }
        int MaxNum = Dp[0];
        for(int q = 1 ; q <Dp.length;q++ ){
            if(MaxNum<Dp[q]){
                MaxNum=Dp[q];
            }
        }
        return MaxNum;
    }

    public static void sort2(int[][] n,int low,int hight){
        if(hight<=low){
            return ;
        }
        int temp = low;
        int i = low+1;//**
        int j = hight;//**
        while(true){
            while(n[i][0]<n[temp][0]) {
                if(i==hight) break;
                ++i;
            }
            while(n[j][0]>n[temp][0]){
                if(j==low+1) break;
                --j;
            }
            if(i>=j) break;
            int[] mid = n[i];
            n[i]=n[j];
            n[j]=mid;
        }
        int[] mid_final = n[j];
        n[j]=n[temp];
        n[temp]=mid_final;
        sort2(n,low,j-1);
        sort2(n,j+1,hight);
    }

    public static void sort1(int[][] n,int low,int hight){
        for(int i = 0 ; i <= hight ; i++){
            for(int j = 1; j <= hight-i ; j++){
                if(n[j][0]<=n[j-1][0]){
                    int[] mid = n[j];
                    n[j]=n[j-1];
                    n[j-1]=mid;
                }
            }
        }
    }

    public static void sort3(int[][] n,int low,int hight){
        //选择
        for(int i = 0 ; i <= hight ; i++){
            int get = i;
            for(int j = i + 1 ; j <= hight ; j++){
                if(n[j][0]<=n[get][0]){
                    get = j;
                }
            }
            int[] mid = n[i];
            n[i]=n[get];
            n[get]=mid;
        }
        for(int i =0 ; i<=hight;i++){
            System.out.println(n[i][0]);
        }
    }



}
/*public int findLongestChain(int[][] pairs) {
        int[] Dp = new int[pairs.length];
        //Dp方程表示取当前结点时最长数对链
        //Dp[n]=Dp[x]+1
        //Dp[x]表示为符合当前节点的最大Dp
        //x表示第X个数对,且数对的第二个数字小于n的第一个数字

        //先将各个数对按第一个数字排序排序

        //快排sort2(pairs,0,pairs.length-1),不能解决重复
        //冒泡sort1(pairs,0,pairs.length-1)
        //选择
        sort3(pairs,0,pairs.length-1);

        //动态规划
        for(int i = 0 ;i<Dp.length;i++){
            int get = pairs[i][0];
            int[] catchNum = new int[i+1];
            for(int j=0;j<i;j++){
                if(pairs[j][1]<get){
                    Dp[i]=Math.max(Dp[j],Dp[i]);
                }
            }
            Dp[i]++;
        }
        int MaxNum = Dp[0];
        for(int q = 1 ; q <Dp.length;q++ ){
            if(MaxNum<Dp[q]){
                MaxNum=Dp[q];
            }
        }
        return MaxNum;
    }

    public static void sort2(int[][] n,int low,int hight){
        if(hight<=low){
            return ;
        }
        int temp = low;
        int i = low+1;//**
        int j = hight;//**
        while(true){
            while(n[i][0]<n[temp][0]) {
                if(i==hight) break;
                ++i;
            }
            while(n[j][0]>n[temp][0]){
                if(j==low+1) break;
                --j;
            }
            if(i>=j) break;
            int[] mid = n[i];
            n[i]=n[j];
            n[j]=mid;
        }
        int[] mid_final = n[j];
        n[j]=n[temp];
        n[temp]=mid_final;
        sort2(n,low,j-1);
        sort2(n,j+1,hight);
    }

    public static void sort1(int[][] n,int low,int hight){
        for(int i = 0 ; i <= hight ; i++){
            for(int j = 1; j <= hight-i ; j++){
                if(n[j][0]<=n[j-1][0]){
                    int[] mid = n[j];
                    n[j]=n[j-1];
                    n[j-1]=mid;
                }
            }
        }
    }

    public static void sort3(int[][] n,int low,int hight){
        //选择
        for(int i = 0 ; i <= hight ; i++){
            int get = i;
            for(int j = i + 1 ; j <= hight ; j++){
                if(n[j][0]<=n[get][0]){
                    get = j;
                }
            }
            int[] mid = n[i];
            n[i]=n[get];
            n[get]=mid;
        }
        for(int i =0 ; i<=hight;i++){
            System.out.println(n[i][0]);
        }
    }

    */

/*    public int findLongestChain(int[][] pairs) {
        int[] Dp = new int[pairs.length];
        for(int i = 0 ;i<Dp.length;i++){
            Dp[i]=0;
        }
        //Dp方程表示取当前结点时最长数对链
        //Dp[n]=Dp[x]+1
        //Dp[x]表示为符合当前节点的最大Dp
        //x表示第X个数对,且数对的第二个数字小于n的第一个数字


        //先将各个数对按第一个数字排序排序

        //快排
        sort2(pairs,0,pairs.length-1);

        //动态规划
        for(int i = 0 ;i<Dp.length;i++){
            int get = pairs[i][0];
            int max = 0;
            int count = 0;
            int[] catchNum = new int[i+1];
            for(int j=0;j<i;j++){
                if(pairs[j][1]<get){
                    count++;
                    catchNum[j]=1;
                }
            }
            if(count==0){Dp[i]++;continue;}
            for(int j=0;j<i;j++){
                if(catchNum[j]==1&&Dp[i]<Dp[j]){
                    Dp[i]=Dp[j];
                }
            }
            Dp[i]++;
        }
        int MaxNum = Dp[0];
        for(int q = 1 ; q <Dp.length;q++ ){
            if(MaxNum<Dp[q]){
                MaxNum=Dp[q];

            }
        }

        return MaxNum;
    }

    public static void sort2(int[][] n,int low,int hight){
        if(hight<=low){
            return ;
        }
        int temp = low;
        int i = low+1;//**
        int j = hight;//**
        while(true){
            while(n[i][0]<n[temp][0]) {
                if(i==hight) break;
                ++i;
            }
            while(n[j][0]>n[temp][0]){
                if(j==low+1) break;
                --j;
            }
            if(i>=j) break;
            int[] mid = n[i];
            n[i]=n[j];
            n[j]=mid;
        }
        int[] mid_final = n[j];
        n[j]=n[temp];
        n[temp]=mid_final;
        sort2(n,low,j-1);
        sort2(n,j+1,hight);
    }
*/
