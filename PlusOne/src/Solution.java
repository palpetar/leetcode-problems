import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits){
        String s = "";

        for (int digit : digits) {
            s = s.concat(String.valueOf(digit));
        }
        BigInteger num = new BigInteger(s);
//        int j = 0;
//        for (int i = digits.length; i > 0; i--){
//            num = num.add(digits[i - 1] * Math.pow(10, j));
//            //num += digits[i - 1] * Math.pow(10, j);
//            j++;
//        }
        num = num.add(BigInteger.valueOf(1));
        s = num.toString();
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            result[i] = Character.getNumericValue(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {4,3,2,1};
        input = plusOne(input);
        System.out.println(Arrays.toString(input));
    }
}
