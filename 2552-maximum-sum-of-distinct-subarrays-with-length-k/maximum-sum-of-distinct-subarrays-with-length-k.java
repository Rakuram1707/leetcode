class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        long max = 0;
        long window = 0;

        
        for (int i = 0; i < k; i++) {
            window += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            max = window;
        }

        for (int i = k; i < n; i++) {

            window += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            window -= nums[i - k];

            map.put(nums[i - k],
                    map.get(nums[i - k]) - 1);

            if (map.get(nums[i - k]) == 0) {
                map.remove(nums[i - k]);
            }

            
            if (map.size() == k) {
                max = Math.max(max, window);
            }
        }

        return max;
    }
}