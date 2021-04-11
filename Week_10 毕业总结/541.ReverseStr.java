/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        int index = 0;
        char[] result = s.toCharArray();
        if (s.length() < k) {
            swapString(index, result, s.length());
        } else {
            while (index < s.length()) {
                swapString(index, result, k);
                index += k * 2;
            }
        }
        return String.valueOf(result);
    }

    private String swapString(int index, char[] array, int k) {
        int left = index;
        int right = index + k - 1;
        if(right > array.length){
            right = array.length - 1;
        }
        while (left < right) {
            char first = array[left];
            char temp = first;
            char second = array[right];
            array[left] = second;
            array[right] = temp;
            left++;
            right--;
        }
        return array.toString();
    }
}
// @lc code=end
