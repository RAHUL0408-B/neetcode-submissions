class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = "";

        // Build cleaned string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned += Character.toLowerCase(ch);
            }
        }

        // Reverse cleaned string
        String reverse = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reverse += cleaned.charAt(i);
        }

        return cleaned.equals(reverse);
    }
}