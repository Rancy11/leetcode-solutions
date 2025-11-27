class Solution {
    public int[] sortedSquares(int[] nums) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num : nums){
            if(num < 0) neg.add(num);
            else pos.add(num);
        }

        if(neg.size() == 0){
            for(int i=0; i<pos.size(); i++){
                pos.set(i, pos.get(i) * pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        if(pos.size() == 0){
            for(int i = neg.size()-1; i>=0; i--){
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        for(int i=0; i<neg.size(); i++){
            neg.set(i, neg.get(i) * neg.get(i));
        }
        for(int i=0; i<pos.size(); i++){
            pos.set(i, pos.get(i) * pos.get(i));
        }

        Collections.reverse(neg);

        int n1 = neg.size(), n2 = pos.size();
        int i=0, j=0, id=0;
        int res[] = new int[n1+n2];

        while(i < n1 && j < n2){
            if(neg.get(i) <= pos.get(j)) res[id++] = neg.get(i++);
            else res[id++] = pos.get(j++);
        }

        while(i < n1) res[id++] = neg.get(i++);
        while(j < n2) res[id++] = pos.get(j++);

        return res;
    }
}

