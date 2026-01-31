class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        while(low<=high){
            if(arr[low]<=arr[high]){
                return arr[low];
            }
            int mid = low + (high-low)/2;
            if(mid>low && arr[mid]<arr[mid-1])
                return arr[mid];
            if(mid<high && arr[mid]> arr[mid+1])
                return arr[mid+1];
            if(arr[mid]>= arr[low])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
        
    }
}
