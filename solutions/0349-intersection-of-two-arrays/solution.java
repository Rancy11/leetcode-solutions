class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums1){
            map.put(n,1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int n: nums2){
            if(map.containsKey(n)){
                list.add(n);
                map.remove(n);
            }
        }

        int ans[] = new int [list.size()];
        for(int i=0 ; i<list.size(); i++){
            ans[i]= list.get(i);
        }
        return ans;
    }
}
