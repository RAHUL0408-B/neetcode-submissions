class Solution {
    public String minWindow(String s, String t) {

        // If t is longer than s, impossible
        if (t.length() > s.length()) {
            return "";
        }

        // Frequency array for characters needed
        int[] count = new int[128];

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int right = 0;

        // Number of characters still needed
        int required = t.length();

        // Store minimum window
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            // Current character
            char rightChar = s.charAt(right);

            // If character is needed
            if (count[rightChar] > 0) {
                required--;
            }

            // Decrease frequency
            count[rightChar]--;

            right++;

            // Window is valid
            while (required == 0) {

                // Update answer
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                count[leftChar]++;

                // If removing it makes window invalid
                if (count[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}