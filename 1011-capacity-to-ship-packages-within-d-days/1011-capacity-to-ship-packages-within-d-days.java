class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;

        int high=0;

        for(int weight : weights){
            low = Math.max(low,weight);
            high += weight;
        }
        int answer =high;

        while (low <=high){
            int mid = low + (high - low)/2;

            int daysused=1;
            int currentload=0;

            for(int weight : weights){
                if(currentload + weight <= mid){
                    currentload += weight;
                }else{
                    daysused++;
                    currentload = weight;
                }
            }
            if(daysused <= days){
                answer = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return answer;
    }
}