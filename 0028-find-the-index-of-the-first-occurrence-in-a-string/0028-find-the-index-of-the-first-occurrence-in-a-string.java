class Solution {
    public int strStr(String haystack, String needle) {

        int len1 = haystack.length();
        int len2 = needle.length();

        if (len2 == 0) {
            return 0;
        }

        int[] lps = new int[len2];

        int len = 0;
        int i = 1;

        while (i < len2) {

            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }

            else if (len == 0) {
                lps[i] = 0;
                i++;
            }

            else {
                len = lps[len - 1];
            }
        }

        i = 0;
        int j = 0;

        while (i < len1) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == len2) {
                    return i - j;
                }
            }

            else {

                if (j != 0) {
                    j = lps[j - 1];
                }

                else {
                    i++;
                }
            }
        }

        return -1;
    }
}