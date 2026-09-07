class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l=0;
        int r=0;
        int n=nums.length;

        int minLength=Integer.MAX_VALUE;
        int sum=0;

        while(r <n){
            sum+=nums[r];

            while(sum>=target){
                 minLength=Math.min(minLength,r-l+1);
                  sum-=nums[l];
                  l++;

            }

           
            r++;
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
        
    }
}