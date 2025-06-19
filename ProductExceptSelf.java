public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] result = solution.productExceptSelf(nums);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
