package algorithms;

public class Algorithms {

    public String findTheLongestString(String string) {
        String longestString = " ";
        String[] strings = string.split(" ");

        for (String s : strings) {
            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }
        return longestString;
    }
}
