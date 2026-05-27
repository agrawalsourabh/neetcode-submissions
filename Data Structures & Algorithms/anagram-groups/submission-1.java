class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

     HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] countTable = new int[26];
            Arrays.fill(countTable, 0);
            char[] sCharacters = str.toCharArray();

            for (char ch : sCharacters) {
                countTable[ch - 'a']++;
            }

            String key = Arrays.toString(countTable);

            map.putIfAbsent(key, new ArrayList<>());
            ArrayList<String> list = (ArrayList<String>) map.get(key);
            list.add(str);
            map.put(key, list);
        }

        return new ArrayList<>(map.values());   
    }
}
