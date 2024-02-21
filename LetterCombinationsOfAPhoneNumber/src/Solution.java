import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits){

        ArrayList<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        HashMap<Integer, String> digitToLetters = new HashMap<>();
        digitToLetters.put(2, "abc");
        digitToLetters.put(3, "def");
        digitToLetters.put(4, "ghi");
        digitToLetters.put(5, "jkl");
        digitToLetters.put(6, "mno");
        digitToLetters.put(7, "pqrs");
        digitToLetters.put(8, "tuv");
        digitToLetters.put(9, "wxyz");
        char[] digit = digits.toCharArray();



        return null;
    }

    public static String generate(HashMap<Integer, String> digitToLetters, ArrayList<String> result, ){

    }

}