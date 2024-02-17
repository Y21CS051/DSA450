//)Move all negative elements to end
//linkk:https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
import java.io.*;

class GFG {

// Here the size of window increases as it encounters
// positive numbers
public static void rearrangePosNegWithOrder(int[] arr)
{
	int i = 0, j = 0;
	while (j < arr.length) {
		if (arr[j] >= 0) {
			j++;
		}
		else {
			for (int k = j; k > i; k--) {
				int temp = arr[k];
				arr[k] = arr[k - 1];
				arr[k - 1] = temp;
			}
			i++;
			j++;
		}
	}
}
