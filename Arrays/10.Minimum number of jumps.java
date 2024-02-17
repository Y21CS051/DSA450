//Minimum number of jumps
//link :https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
class Solution{
    static int minJumps(int[] arr){
        // your code here
        if(arr.length<=1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        if(arr[0]>=arr.length-1){
            return 1;
        }
        int maxreach=arr[0];
        int steps=arr[0];
        int jumps=1;
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1){
                return jumps;
            }
            if(arr[i]>=(arr.length-1)-i){
                return jumps+1;
            }
            steps--;
            maxreach=Math.max(maxreach,i+arr[i]);
            if(steps==0){
                if(i>=maxreach){
                    return -1;
                }
                steps=maxreach-i;
                jumps++;
            }
        }
        return -1;
        
    }
}
