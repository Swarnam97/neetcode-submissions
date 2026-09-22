class Solution {
    int findPivot(int[] nums){
        int l = 0, r = nums.length - 1;

        while(l < r && nums[l] == nums[l+1])
                l++;

        while(l < r && nums[r] == nums[r-1])
            r--;

        while(l < r){
            
            int m = l + (r-l)/2;
            if(nums[m] > nums[r])
            l = m +1;
            else
            r = m;
        }

        return r;
    }

    int binarySearch(int[] nums, int l, int r, int target){
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == target)
            return m;
            if(target > nums[m])
            l = m +1;
            else
            r = m -1;
        }

        return -1;

    }

    public boolean search(int[] nums, int target) {
        int l =0, r = nums.length - 1;
        int pivot = findPivot(nums);
        System.out.println(pivot);
        int idx = binarySearch(nums,l,pivot-1,target);
        if(idx != -1)
        return true;

        idx = binarySearch(nums,pivot,r,target);
        return  idx!= -1 ? true : false;
    }
}