package leetcode;

class No495 {
//提莫攻击

public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length<1||duration==0){
            return 0;
        }
        int time=duration;
        //计算时间 
        int local_time = timeSeries[0]+duration;
        for(int i=1;i<timeSeries.length;i++){
            //持续时间<=间隔
            if(timeSeries[i]>=local_time){
                local_time=timeSeries[i]+duration;
                time+=duration;
            }
            //持续时间>间隔
            if(timeSeries[i]<local_time+duration){
                time =timeSeries[i]+duration-local_time+time;
                local_time = timeSeries[i]+duration;
            }
        }

        return time;
    }

}