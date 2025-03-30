package Problem8;

public class Problem8 {
    /**
     * Recursively checks if a string consists entirely of digits
     * @param s The string to check
     * @return true if all characters are digits, false otherwise
     */
    public static boolean isAllDigits(String s) {
        // Base case: empty string is considered valid
        if (s.isEmpty()) {
            return true;
        }

        // Check first character
        char firstChar = s.charAt(0);
        if (firstChar < '0' || firstChar > '9') {
            return false;
        }

        // Recursively check remaining characters
        return isAllDigits(s.substring(1));
    }
}