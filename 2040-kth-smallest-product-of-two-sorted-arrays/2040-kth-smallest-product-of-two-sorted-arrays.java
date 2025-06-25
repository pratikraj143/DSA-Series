class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long left = -10_000_000_000L; 
        long right = 10_000_000_000L; 
        
        while (left < right) {
            long mid = left + (right - left) / 2;

            if (countProductsLessOrEqual(nums1, nums2, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    
    private long countProductsLessOrEqual(int[] nums1, int[] nums2, long target) {
        long count = 0;

        for (int num1 : nums1) {
            if (num1 > 0) {
                int left = 0, right = nums2.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if ((long) num1 * nums2[mid] <= target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                count += left; 
            } else if (num1 < 0) {
                int left = 0, right = nums2.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if ((long) num1 * nums2[mid] <= target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                count += (nums2.length - left); 
            } else {
                if (0 <= target) {
                    count += nums2.length;
                }
            }
        }
        return count;
    }
}