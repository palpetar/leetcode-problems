import java.util.HashMap;

public class Solution {
    public static int romanToInt(String s){

        HashMap<String, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put("I", 1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L", 50);
        romanNumbers.put("C", 100);
        romanNumbers.put("D", 500);
        romanNumbers.put("M", 1000);
        int result = 0;
        String[] str = s.split("");
        for (int i = str.length - 1; i >= 0; i--){
            if (i >= 1 && romanNumbers.get(str[i]) > romanNumbers.get(str[i - 1])){
                result += romanNumbers.get(str[i]) - romanNumbers.get(str[i - 1]);
                i--;
                continue;
                }
            if (i >= 1 && romanNumbers.get(str[i]) == romanNumbers.get(str[i - 1])){
                if (i >= 2 && romanNumbers.get(str[i]) == romanNumbers.get(str[i - 2])){
                    result += romanNumbers.get(str[i]) * 3;
                    i -= 2;
                    continue;
                    }
                    else {
                        result += romanNumbers.get(str[i]) * 2;
                        i--;
                        continue;
                    }
                }
            result += romanNumbers.get(str[i]);
            }
        return result;

//        int answer = 0, number = 0, prev = 0;
//
//        for (int j = s.length() - 1; j >= 0; j--) {
//            switch (s.charAt(j)) {
//                case 'M' -> number = 1000;
//                case 'D' -> number = 500;
//                case 'C' -> number = 100;
//                case 'L' -> number = 50;
//                case 'X' -> number = 10;
//                case 'V' -> number = 5;
//                case 'I' -> number = 1;
//            }
//            if (number < prev) {
//                answer -= number;
//            }
//            else {
//                answer += number;
//            }
//            prev = number;
//        }
//        return answer;

    }
}
