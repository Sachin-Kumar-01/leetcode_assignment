class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int maxFreq = 0;

        HashMap<Character, Integer> mpp = new HashMap<>();

        while (right < s.length()) {

            char ch = s.charAt(right);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, mpp.get(ch));

            while ((right - left + 1) - maxFreq > k) {
                char c = s.charAt(left);
                mpp.put(c, mpp.get(c) - 1);

                if (mpp.get(c) == 0) {
                    mpp.remove(c);
                }

                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1);

            right++;
        }

        return maxlen;
    }
}