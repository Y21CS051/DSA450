//link:https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        for(int i=0;i<n;i++){
            arr[arr[i]%n]+=n;
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]/n>1){
                res.add(i);
            }
        }
        if(res.size()>0){
        return res;
        }
        res.add(-1);
        return res;
    }
}
