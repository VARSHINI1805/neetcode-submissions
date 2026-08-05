class Solution {
    public int candy(int[] ratings) {
       int[] candies = new int[ratings.length];
       for(int i=0;i<candies.length ;i++){
        candies[i] = 1;
       }
       //left to right
       for(int i = 1; i<ratings.length ;i++){
        if(ratings[i] > ratings[i-1]){
            candies[i] = candies[i-1]+1;
        }
       }
       //right to left
       for(int i = ratings.length-2 ; i>=0;i--){
        if(ratings[i] > ratings[i+1]){
            candies[i] = Math.max(candies[i],candies[i+1]+1);
        }
       }
       int sum=0;
       for(int c : candies){
        sum+=c;
       }
       return sum;
    }
}