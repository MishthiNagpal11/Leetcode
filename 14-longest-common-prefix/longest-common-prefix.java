class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String ans = "";

        for (int j = 0; j < strs[0].length(); j++) {

            char current = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {

                if (j >= strs[i].length() || strs[i].charAt(j) != current) {
                    return ans;
                }
            }

            ans = ans + current;
        }

        return ans;
    }
}