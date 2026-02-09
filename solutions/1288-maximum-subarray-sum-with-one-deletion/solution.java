class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = arr[0];
        int ans = arr[0];
        int v2;
        for(int i=1; i<arr.length; i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            nodelete = Math.max(nodelete+ arr[i], arr[i]);
            // if(prevonedelete == Integer.MIN_VALUE){
            //     v2 = arr[i];
            // }
            // else{
            //     v2 = prevonedelete+ arr[i];
            // }
            onedelete = Math.max(onedelete + arr[i], prevnodelete);
            ans = Math.max(ans, Math.max(onedelete, nodelete));
        }
        return ans;
    }
}
