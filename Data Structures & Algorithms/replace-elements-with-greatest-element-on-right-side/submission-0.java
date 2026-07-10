class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int rmax = -1;
            for(int j = i + 1 ; j  < arr.length ; j++){
                rmax = Math.max(rmax , arr[j]);
            }
            res[i] = rmax;
        }
        return res;
    }
}