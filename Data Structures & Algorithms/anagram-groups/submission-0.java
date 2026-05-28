class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //logic
        //sort the whole string
        //check the id of every element in the string
        //strings w similar elements get pushed to their own array
        //return output of arrays

        //pseudocode
        //create a hashmap to track sorted words and push that to list of valid anagrams
        //create a list result
        //iterate through values of the map

        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs)  {
            String sort = sortStr(s);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(s);
        }

        return convertToList(map);
    }

    private List<List<String>> convertToList(Map<String, List<String>> map) {
        List<List<String>> result = new ArrayList<>();

        for (List<String> anagrams: map.values()) {
            result.add(anagrams);
        }
        return result;
    }

    private String sortStr(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
