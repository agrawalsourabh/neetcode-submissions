class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;


        // convert it to hashmap

        HashMap<Character, Integer> sHashMap = new HashMap<>();
        HashMap<Character, Integer> tHashMap = new HashMap<>();

        for(char ch : s.toLowerCase().toCharArray()){
            if(sHashMap.containsKey(ch))
                sHashMap.put(ch, sHashMap.get(ch) + 1);

            else
                sHashMap.put(ch, 1);
        }

        for(char ch : t.toLowerCase().toCharArray()){
            if(tHashMap.containsKey(ch))
                tHashMap.put(ch, tHashMap.get(ch) + 1);
            
            else 
                tHashMap.put(ch, 1);
        }


        if(tHashMap.size() != tHashMap.size())
            return false;

        if(sHashMap.equals(tHashMap))
            return true;

        return false;
    }
}
