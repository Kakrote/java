package questions;

public class LargestRectangel {

    // Method to find the index of the next smaller element on the right for each element
    public static int[] smallestInright(int[] arr, int length) {
        int[] ans = new int[arr.length];
        int[] stack = new int[arr.length]; // Stack array to hold indices
        int j = 0;
        stack[0] = -1; // Initialize with -1 for boundaries

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            while (j > 0 && curr <= arr[stack[j]]) { // Compare with arr[stack[j]], not stack[j]
                j--;
            }
            ans[i] = stack[j]; // Corrected to store indices, not values
            j++;
            stack[j] = i; // Store the index of the current element
        }
        return ans;
    }

    // Method to find the index of the previous smaller element on the left for each element
    public static int[] smallestInleft(int[] arr, int length) {
        int[] ans = new int[arr.length];
        int[] stack = new int[arr.length]; // Stack array to hold indices
        int j = 0;
        stack[0] = -1; // Initialize with -1 for boundaries

        for (int i = 0; i < length; i++) {
            int curr = arr[i];
            while (j > 0 && curr <= arr[stack[j]]) { // Compare with arr[stack[j]], not stack[j]
                j--;
            }
            ans[i] = stack[j]; // Corrected to store indices, not values
            j++;
            stack[j] = i; // Store the index of the current element
        }
        return ans;
    }

    // Method to calculate the largest rectangle area in the histogram
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] next = smallestInright(heights, n);
        int[] prev = smallestInleft(heights, n);
        int area = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++) {
            int length = heights[i];
            if (next[i] == -1) {
                next[i] = n;
            }
            int width = next[i] - prev[i] - 1;
            int new_area = length * width;
            area = Math.max(area, new_area);
        }
        return area;
    }

    public static void main(String[] args) {
        LargestRectangle obj = new LargestRectangle();
        int testcase[] = {2, 1, 5, 6, 2, 3};
        System.out.println(obj.largestRectangleArea(testcase)); // Output: 10
    }
}
