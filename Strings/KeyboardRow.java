import java.util.*;

class MainClass {
    public static void main(String args[]) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            String row;

            if (row1.contains(String.valueOf(word.charAt(0)))) {
                row = row1;
            } else if (row2.contains(String.valueOf(word.charAt(0)))) {
                row = row2;
            } else {
                row = row3;
            }

            boolean isValid = true;

            for (int j = 0; j < word.length(); j++) {
                if (!row.contains(String.valueOf(word.charAt(j)))) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(words[i]);
            }
        }

        System.out.println(result);
    }
}

//LeetCode
class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            String row;

            if (row1.contains(String.valueOf(word.charAt(0)))) {
                row = row1;
            } else if (row2.contains(String.valueOf(word.charAt(0)))) {
                row = row2;
            } else {
                row = row3;
            }

            boolean isValid = true;

            for (int j = 0; j < word.length(); j++) {
                if (!row.contains(String.valueOf(word.charAt(j)))) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(words[i]);
            }
        }

        return result.toArray(new String[0]);
    }
}