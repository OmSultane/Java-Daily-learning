package DSA.Strings;

class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int openCount = 0;

        // Pass 1: Remove invalid closing parentheses ')' from left to right
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                openCount++;
            } else if (arr[i] == ')') {
                if (openCount > 0) {
                    openCount--; // Valid pair found
                } else {
                    arr[i] = '*'; // Mark invalid ')' for removal
                }
            }
        }

        // Pass 2: Remove unmatched opening parentheses '(' from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '(' && openCount > 0) {
                arr[i] = '*'; // Mark invalid '(' for removal
                openCount--;
            }
        }

        // Build the final filtered string
        StringBuilder result = new StringBuilder();
        for (char c : arr) {
            if (c != '*') {
                result.append(c);
            }
        }

        return result.toString();
    }
}