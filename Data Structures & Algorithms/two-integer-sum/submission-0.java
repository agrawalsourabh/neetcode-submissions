class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compHashmap = new HashMap<>();

        for (int i=0 ; i<nums.length ; i++){
            if(compHashmap.containsKey(nums[i])){
                return new int[] {compHashmap.get(nums[i]), i};
            }

            compHashmap.put(target-nums[i], i);
        }

        return null;
    }
}
