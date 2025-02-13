class MergeStrings {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz123";
        
        String mergedString = mergeStrings(str1, str2);
        System.out.println("Merged String: " + mergedString);
    }

    public static String mergeStrings(String s1, String s2) {
        int len1 = s1.length();  // Length of first string
        int len2 = s2.length();  // Length of second string
        int maxLength = Math.max(len1, len2);  // Find the longest length
        
        char[] merged = new char[len1 + len2]; // Create a character array
        int index = 0; // To keep track of array position
        
        // Loop through both strings
        for (int i = 0; i < maxLength; i++) {
            if (i < len1) { // If index is within first string length, add its character
                merged[index++] = s1.charAt(i);
            }
            if (i < len2) { // If index is within second string length, add its character
                merged[index++] = s2.charAt(i);
            }
        }
        
        // Convert char array to string manually
        String result = "";
        for (char c : merged) {
            result += c;  // Append each character manually
        }
        
        return result;
    }
}
