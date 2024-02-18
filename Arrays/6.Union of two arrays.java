//Union of two arrays
//link":https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> Union=new HashSet<>();
        for(int i:a){
            Union.add(i);
        }
        for(int j:b){
            Union.add(j);
        }
        return Union.size();
    }
}
