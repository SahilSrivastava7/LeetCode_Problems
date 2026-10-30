class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int arr[]=new int[temperatures.length];

         Stack<Integer> stack=new Stack<>();

         for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() &&  temperatures[i]>temperatures[stack.peek()]){//74-73
                int prevIndex=stack.pop();//0
                arr[prevIndex]=i-prevIndex;//1-0
            }
            stack.push(i);
         }
         return arr;
    }
}