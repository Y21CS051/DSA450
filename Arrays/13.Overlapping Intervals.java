//link:https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1
class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        int n=Intervals.length;
        Arrays.sort(Intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        int i=0;
            int start=Intervals[i][0];
            int end=Intervals[i][1];
        while(i<n){ 
            
            if(Intervals[i][0]<=end){
                end=Math.max(end,Intervals[i][1]);
            }
            else{
            int[] temp=new int[2];
            temp[0]=start;temp[1]=end;
            res.add(temp);
            start=Intervals[i][0];
            end=Intervals[i][1];
            }
            i++;
        }
           int[] temp=new int[2];
            temp[0]=start;temp[1]=end;
            res.add(temp);
        return res.toArray(new int[res.size()][2]);
        
    }
}
