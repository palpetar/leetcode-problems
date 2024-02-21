public class Solution2 {
    public static int countValidWords(String sentence) {
        String[] token = sentence.split("\\s+");
        int result = 0;
        String regexForCharacters = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String regexForDigits = "[^0-9]+";
        for(String s: token)
            if(s.matches(regexForCharacters) && s.matches(regexForDigits)) result++;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countValidWords("a-!b"));
    }
}
