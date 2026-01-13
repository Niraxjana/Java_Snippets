class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = FirstOcc(nums, target);
        int last = LastOcc(nums, target);
        return new int[]{first, last};
    }

    private int FirstOcc(int[] nums, int target){  
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;//move left
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    private int LastOcc(int[] nums, int target){
        int low = 0, high = nums.length -1;
        int ans = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid + 1;//move right
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
