class Solution
{
    char firstRep(String S)
    {
        int[] freq = new int[256]; // ASCII size

        for (char ch : S.toCharArray()) {
            freq[ch]++; //Increment
        }

        for (char ch : S.toCharArray()) {
            if (freq[ch] > 1) {
                return ch;
            }
        }

        return '#'; // if no repetition
    }
}
