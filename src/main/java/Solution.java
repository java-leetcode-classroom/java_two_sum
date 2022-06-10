import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        int nLen = nums.length;
        for (int idx = 0; idx < nLen; idx++) {
            if (hash.containsKey(target-nums[idx])) {
              return setWithOrder(idx, hash.get(target-nums[idx]));
            }
            hash.put(nums[idx], idx);
        }
        return result;
    }
    public static int[] setWithOrder(int numberToCompare, int numberBeCompared) {
        return (numberToCompare > numberBeCompared)? new int[]{numberBeCompared, numberToCompare}:
                new int[]{numberToCompare, numberBeCompared};        
    }
}
