//Cyclically rotate an array by one
//link:https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
class Compute {
    
    public void rotate(int arr[], int n)
    {
        for(int i=n-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
    }
}
