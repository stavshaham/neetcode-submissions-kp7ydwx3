class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Boolean toReturn = true;

        char[] array_s = s.toCharArray();
        char[] array_t = t.toCharArray();

        Arrays.sort(array_s);
        Arrays.sort(array_t);

        for (int i = 0; i < array_s.length; i++) {
            if (array_s[i] != array_t[i]) toReturn = false;
        }

        return toReturn;
    }
}
