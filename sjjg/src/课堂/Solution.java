package 课堂;

/**
 * @author frank-chandler
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int charSum = str.length();
        boolean isPalindrome = true;
        for(int i=0,j=charSum-1;i<j;i++,j--) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
