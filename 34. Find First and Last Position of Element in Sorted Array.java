class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        
        return new int[]{first, last};
    }

    private int findFirst(int nums[], int target) {
        int si = 0;
        int ei = nums.length-1;
        int first = -1;

        while(si <= ei) {
            int mid = si+(ei-si)/2;
            if(nums[mid] == target) {
                first = mid;
                ei = mid-1;             
            } else if(nums[mid] < target) {
                si = mid+1;
            } else {
                ei = mid-1;
            }
        }
        return first;
    }

    private int findLast(int nums[], int target) {
        int si = 0;
        int ei = nums.length-1;
        int last = -1;

        while(si <= ei) {
            int mid = si+(ei-si)/2;
            if(nums[mid] == target) {
                last = mid;
                si = mid+1;             
            } else if(nums[mid] < target) {
                si = mid+1;
            } else {
                ei = mid-1;
            }
        }
        return last;
    }
}
