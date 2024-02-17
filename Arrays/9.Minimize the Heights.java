//Minimize the Heights
//link:https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        int res=max-min;
        for(int i=1;i<n;i++){
            if(arr[i]-k <0){
                continue;
            }
            int tempmin=Math.min(arr[0]+k,arr[i]-k);
            int tempmax=Math.max(arr[n-1]-k,arr[i-1]+k);
            int temp_res=tempmax-tempmin;
            if(temp_res<res){
                res=temp_res;
            }
        }
        return res; 
        
    }
}
