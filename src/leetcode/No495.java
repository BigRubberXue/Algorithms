package leetcode;

class No495 {


public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length<1||duration==0){
            return 0;
        }
        int time=duration;

        int local_time = timeSeries[0]+duration;
        for(int i=1;i<timeSeries.length;i++){
            //����ʱ��<=���
            if(timeSeries[i]>=local_time){
                local_time=timeSeries[i]+duration;
                time+=duration;
            }

            if(timeSeries[i]<local_time+duration){
                time =timeSeries[i]+duration-local_time+time;
                local_time = timeSeries[i]+duration;
            }
        }

        return time;
    }

}