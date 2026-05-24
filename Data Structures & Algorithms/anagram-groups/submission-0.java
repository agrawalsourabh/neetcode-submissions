class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> finalList = new ArrayList<>();
        List<String> inputList = Arrays.asList(strs);
        Boolean[] traceElements = new Boolean[inputList.size()];
        Arrays.fill(traceElements, false);

        if(strs.length <= 1 ){
            finalList.add(inputList);
            return finalList;
        }

        for(int i=0 ; i< inputList.size() ; i++){
            
            if(!traceElements[i]){

                List<String> strList = new ArrayList<>();
                strList.add(inputList.get(i));
    
                for(int j = i+1 ; j< inputList.size() ; j++){
    
                    if(!traceElements[j]  && isAnagram(inputList.get(i), inputList.get(j))){
                        strList.add(inputList.get(j));
                        traceElements[j] = true;
                    }
    
                }
                finalList.add(strList);
            }

        }


        return finalList;

    }

    public boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }


        HashMap<Character, Integer> str1Map = new HashMap<>();
        HashMap<Character, Integer> str2Map = new HashMap<>();

        for(Character ch : str1.toCharArray()){
            str1Map.put(ch, str1Map.getOrDefault(ch, 0) + 1);
        }


        for(Character ch : str2.toCharArray()){
            str2Map.put(ch, str2Map.getOrDefault(ch, 0) + 1);
        }


        return str1Map.equals(str2Map);
    }
}
