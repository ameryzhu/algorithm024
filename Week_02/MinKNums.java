class Solution {
    public int[] getLeastNumbers(int[] array, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int i = 0; i < array.length; i++) {
            heap.add(array[i]);
        }
        int [] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
