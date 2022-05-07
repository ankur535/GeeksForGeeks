package ds.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FirstAndLastOccurenceOfX {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inputLine[] = br.readLine().trim().split(" ");
		int n = Integer.parseInt(inputLine[0]);
		int x = Integer.parseInt(inputLine[1]);
		int a[] = new int[n];

		String inputLine1[] = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(inputLine1[i]);
		}

		Solution solution = new Solution();
		ArrayList<Integer> ans = solution.firstAndLast(a, n, x);

		for (Integer val : ans) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}

//User function Template for Java
class Solution {
	public ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
		// Code here

		ArrayList<Integer> ans = new ArrayList<Integer>();

		int low = 0;
		int high = n - 1;
		int val = -1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				val = mid;
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else if (arr[mid] > x) {
				high = mid - 1;
			}
		}
		if(val == -1) {
		    ans.add(val);
		    return ans;
		}
		ans.add(val);
		
		low = 0;
		high = n - 1;
		val = -1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				val = mid;
				low = mid + 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else if (arr[mid] > x) {
				high = mid - 1;
			}
		}
		ans.add(val);
		
		return ans;
	}
}
