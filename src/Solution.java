import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            char[] chars1 = s.toLowerCase().toCharArray();
            char[] chars2 = t.toLowerCase().toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            return Arrays.equals(chars1, chars2);
        }
        return false;
    }
}
