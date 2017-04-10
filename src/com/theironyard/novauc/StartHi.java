package com.theironyard.novauc;

/**
 Given a string, return true if the string starts with "hi" and false otherwise.
 */
public class StartHi {
    public boolean startHi(String str) {
        // First test if the string is not at least length 2
        // (so the substring() below does not go past the end).
        if (str.length() < 2) return false;

        // Pull out the string of the first two chars
        String firstTwo = str.substring(0, 2);

        // Test if it is equal to "hi"
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }

    }
}
