class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums2){
            // find next greator element 
            while(!stack.isEmpty() && num>stack.peek()){
                int smaller=stack.pop();//3
                map.put(smaller,num);//3,4
            }
            stack.push(num);//4,2

        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);//2,-1   4,-1  1,3     3,4
        }

        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=map.get(nums1[i]);

        }
        return arr;

    }
}