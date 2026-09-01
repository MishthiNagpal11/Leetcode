class Solution {
    public boolean isPalindrome(String s) {

        String clean = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                clean = clean + Character.toLowerCase(ch);
            }
        }

        String rev = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            rev = rev + clean.charAt(i);
        }

        return clean.equals(rev);
    }
}