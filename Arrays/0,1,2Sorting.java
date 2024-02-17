//Sort an array of 0s, 1s and 2s
//link:https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
class Solution
{
    public static void swap(int[] a ,int i,int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void sort012(int a[], int n)
    {
        // code here
        int l=0,mid=0,h=n-1;
        while(mid<=h){
            if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==0){
                swap(a,mid,l);
                mid++;
                l++;
            }
            else if(a[mid]==2){
                swap(a,mid,h);
                h--;
            }
        }
    }
}
