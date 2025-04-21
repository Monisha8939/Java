class Solution {
    public String convert(String s) {
        // code here
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))); // First letter uppercase
                result.append(word.substring(1).toLowerCase());       // Rest lowercase
                result.append(" ");
            }
        }

        return result.toString().trim();  // Remove last extra space
    }
}
