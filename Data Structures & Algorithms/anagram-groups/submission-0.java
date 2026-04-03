class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>>returns = new HashMap<>();
      for (String s : strs) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        String sorted = new String(array);
        returns.putIfAbsent(sorted, new ArrayList<>());
        returns.get(sorted).add(s);
      }


      return new ArrayList<>(returns.values());
    }
}
