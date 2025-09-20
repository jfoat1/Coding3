package driver;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3, 4}, 
				{5, 6, 7, 8}, 
				{9, 10, 11, 12}};
		int[] test = MatrixSearch(arr, 10);
		System.out.println(Arrays.toString(test));
	}
	
	public static int[] MatrixSearch(int[][] arr, int key)
	{
		int upperRow = arr.length - 1; // 2
		int upperColumn = arr[upperRow].length - 1; // 3
		int upper = arr[upperRow][upperColumn]; // 12
		int lowerRow = 0;
		int lowerColumn = 0;
		int lower = arr[lowerRow][lowerColumn]; // 1
		while(upper != lower)
		{
			int mid = ((upperRow*(arr[upperRow].length) + upperColumn) + (lowerRow*(arr[lowerRow].length) + lowerColumn))/2;
			int midRow = mid / 4; 
			int midColumn = mid % 4;
			int midValue = arr[midRow][midColumn]; // 
			if(key == midValue)
			{
				int[] answer = {midRow, midColumn};
				return answer;
			}
			else if(key < midValue)
			{
				if(midColumn == 0)
				{
					upperRow = midRow - 1;
					upperColumn = arr[upperRow].length - 1;
				}
				else
				{
					upperRow = midRow;
					upperColumn = midColumn - 1; 
				}
			}
			else if(key > midValue)
			{
				if(midColumn == arr[midRow].length - 1)
				{
					lowerRow = midRow + 1;
					lowerColumn = 0; 
				}
				else
				{
					lowerRow = midRow;
					lowerColumn = midColumn + 1;
				}
			}
		}
		
		if(key == upper)
		{
			int[] answer = {upperRow, upperColumn};
			return answer; 
		}
		else 
		{
			return new int[] {-1, -1}; 
		}
	}

}
