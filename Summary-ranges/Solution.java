class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>(); 
        if (nums == null || nums.length == 0) return arr;
        int start = nums[0];  
        for (int i = 1; i <= nums.length; i++) {
            // Check if we're at the end or if the current number is not part of the current range
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
            if (start == nums[i - 1]) {
             // If start and end are the same, it's a single number
            arr.add(String.valueOf(start));
            } else {
            // Otherwise, it's a range from start to nums[i-1]
            arr.add(start + "->" + nums[i - 1]);
            }
            // Update the start for the next potential range
            if (i < nums.length) {
            start = nums[i];
            }
            }
        }
        return arr;  // Return the list of ranges
    }
}
