class Solution {

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int[] results = maxSlidingWindow(nums, 3);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
        // now let's check it here.
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int[] results = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (queue.size() > 0 && nums[i] >= nums[queue.getLast()]) {
                queue.removeLast();
            }
            queue.addLast(i);
            if (queue.peek() == (i - k)) {
                queue.removeFirst();
            }
            if (i+1 >= k) {
                results[i - (k - 1)] = nums[queue.peek()];
            }
        }
        return results;
    }

}
