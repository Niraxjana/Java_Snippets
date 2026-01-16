class Solution {
    int floorSqrt(int n) {
        if(n==0||n==1){
            return n;
        }
        int low = 0;
        int high = n/2;
        int ans=0;
      
        while(low<=high){
             int mid = low+(high-low)/2;
        if(mid*mid == n ){
            return mid;
        }
        else if(mid*mid>n){
            high = mid-1;
        }
        else{
            ans = mid;
            low = mid+1;
        }
    }
      
    return ans;
}
}
