# java_two_sum

Given an array of integers `nums` and an integer `target`, return *indices of the two numbers such that they add up to `target`*.

You may assume that each input would have ***exactly* one solution**, and you may not use the *same* element twice.

You can return the answer in any order.

## Examples

**Example 1:**

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

```

**Example 2:**

```
Input: nums = [3,2,4], target = 6
Output: [1,2]

```

**Example 3:**

```
Input: nums = [3,3], target = 6
Output: [0,1]

```

**Constraints:**

- `2 <= nums.length <= $10^4$`
- $`-10^9$ <= nums[i] <= $10^9$`
- $`-10^9$ <= target <= $10^9$`

## 解析

題目給定一個整數陣列 nums, 還有一個整數 target

要求寫一個演算法來找出 nums 兩個元素相加 = target 的index

可以透過 hashtable 把經過的值暫存下來

假設每次透過 index來找尋

每次 檢查 （target - nums[index]） 有沒有 hashTable 內

有則回傳 index 與 target - nums[index]

## 程式碼
```java
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
```
## 困難點

1. 理解 HashTable 運作方式

## Solve Point

- [x]  Understand what problem to solve
- [x]  Analysis Complexity