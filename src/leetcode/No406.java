package leetcode;
class No406 {
    public int[][] reconstructQueue(int[][] people) {
        int length = people.length;
        if(length<2){
            return people;
        }
        Arrays.sort(people,(o1,o2)->{
           return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
        });
        List<int[]> list = new ArrayList<>();
        for(int[] i : people){
            list.add(i[1],i);
        }
        
        return list.toArray(new int[list.size()][2]);
    }
}