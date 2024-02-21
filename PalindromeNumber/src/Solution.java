public class Solution {
    public static boolean isPalindrome(int x){

        String[] arr = Integer.toString(x).split("");
        int i = 0;
        while(arr[i].equals(arr[arr.length - i - 1])){
            if(i == arr.length - i - 1 || i == arr.length - i){
                return true;
            }
            i++;
        }
        return false;
    }
}
