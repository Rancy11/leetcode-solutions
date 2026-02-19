class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        List<int[]> result = new ArrayList<>();
        for(int i =0; i< intervals.length; i++){
            res.add(intervals[i]);
        }
        res.add(newInterval);

        res.sort((a, b) -> a[0] - b[0]);

        int start1 = res.get(0)[0];
        int end1 = res.get(0)[1];

        for(int i=1; i<res.size(); i++){
            int start2 = res.get(i)[0];
            int end2 = res.get(i)[1];
            if(end1 >= start2){
                start1 = start1;
                end1 = Math.max(end1, end2);
                continue;
            }
            else{
                result.add(new int[] {start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }
        result.add(new int[] {start1 , end1});
        return result.toArray(new int[result.size()][]);
    }
}
