//solve this question of the leetcode 2099 problem
import java.util.Arrays;
import java.util.HashMap;   
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
public class Leetcode2099 {
    public int[] findSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>();
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            queue.offer(nums[i]);

            while (map.size() > k) {
                int removed = queue.poll();
                map.put(removed, map.get(removed) - 1);
                if (map.get(removed) == 0) {
                    map.remove(removed);
                }
            }

            if (map.size() == k) {
                result[index++] = i;
            }
        }

        return Arrays.copyOf(result, index);
    }
}