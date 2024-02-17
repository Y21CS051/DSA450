// Pseudocode of Kadane’s algorithm:
// Initialize:
//     max_so_far = INT_MIN
//     max_ending_here = 0

// Loop for each element of the array

//   (a) max_ending_here = max_ending_here + a[i]
//   (b) if(max_so_far < max_ending_here)
//             max_so_far = max_ending_here
//   (c) if(max_ending_here < 0)
//             max_ending_here = 0
// return max_so_far
//link:https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long msf=Integer.MIN_VALUE;
        long max_ending=0;
        for(int i=0;i<n;i++){
            max_ending+=arr[i];
            if(max_ending>msf){
                msf=max_ending;
            }
            if(max_ending<0){
                max_ending=0;
            }
        }
        return msf;
        
    }
    
}
