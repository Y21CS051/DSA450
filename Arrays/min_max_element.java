//Find minimum and maximum element in an array
//link:https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=Integer.MAX_VALUE;
        long max=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        Pair p=new Pair(min,max);
        return p;
    }
