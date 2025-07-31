import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ThreeSumSmaller {
    public static int threeSumSmaller(int nums[], int target) {
        int result = 0;
        if(nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++) {
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if(sum < target) {
                    // All triplets (i,l,k) where k in [l+1, r] are valid
                    result += r - l;
                    l++; // Moving left pointer to find more triplets
                } else {
                    r--; // Sum too large, move right pointer left
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int nums[] = {-2, 0, 1, 3};
        int target = 2;

        System.out.println(threeSumSmaller(nums, target)); //2
    }
}
