class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
    //     for(int i=0;i<n;i++){
    //         int prod = 1;
    //         for(int j=0;j<n;j++){
    //             if(i!=j){
    //                 prod *= nums[j];
    //             }
    //         }
    //         result[i] = prod;
    //     }
    //     return result;

    int[] pref = new int[n];
    int[] suff = new int[n];

    pref[0] = 1;
    suff[n-1] = 1;

    for(int i=1; i<n; i++){
        pref[i] = nums[i-1]*pref[i-1];
    }

    for(int j=n-2; j>=0 ; j--){
        suff[j] = nums[j+1]*suff[j+1];
    }

    for(int k=0; k<n; k++){
        result[k] = pref[k]*suff[k];
    }

    return result;

    }
}  
