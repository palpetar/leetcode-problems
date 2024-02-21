public class Solution {
    public static int removeDuplicates(int[] nums){
//        int current; int previous = nums[0]; int result = nums.length;
//        for (int i = 1; i < nums.length; i++){
//            current = nums[i];
//            if (current == previous){
//                System.arraycopy(nums, i + 1, nums, i, nums.length - i - 1);
//                result--;
//                i--;
//            }else {
//                previous = current;
//            }
//        }
//        return result;

        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = {1,2}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
