//Kth smallest element
//link:https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        while(true){
            int j=Partition(arr,l,r);
            if(j==k-1){
                return arr[j]
            }
            else if(j<k-1){
                l=j+1;
            }
            else{
                r=j-1;
            }
        }
    }
    public static void interchange(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int Partition(int[] arr,int l,int r){
        int pivot=arr[l];
        int i=l,j=r;
        while(i<j){
            while(i<j && arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                interchange(arr,i,j);
            }
        }
        interchange(arr,l,j);
        return j;
    }
}
