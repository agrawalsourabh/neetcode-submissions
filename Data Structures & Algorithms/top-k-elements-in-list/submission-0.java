class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> frequencyList = new ArrayList<>();
        int[] result = new int[k];

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            frequencyList.add(new ArrayList<>());
        }

        frequencyList.add(new ArrayList<>());

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            ArrayList<Integer> list = frequencyList.get(entry.getValue());
            list.add(entry.getKey());
        }

        int resultSize = 0;

        for (int i = frequencyList.size() - 1; i >= 0; i--) {
            if (resultSize == k) {
                break;
            }
            if (!frequencyList.get(i).isEmpty()) {
                for (int value : frequencyList.get(i)) {
                    result[resultSize] = value;
                    resultSize++;
                }
            }
        }

        return result;
    }
}
