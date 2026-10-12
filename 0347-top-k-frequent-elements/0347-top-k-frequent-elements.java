// LEETCODE 347 - TOP K FREQUENT ELEMENTS

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            int max = -1, key = 0;

            for(int n : map.keySet()){
                if(map.get(n) > max){
                    max = map.get(n);
                    key = n;
                }
            }

            ans[i] = key;
            map.put(key, -1);
        }

        return ans;
    }
}