package ds.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOf1st1InAnSortedArrayOf0And1 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine().trim());
		long a[] = new long[(int) (n)];
		// long getAnswer[] = new long[(int)(n)];
		String inputLine[] = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(inputLine[i]);
		}

		Solution1 obj = new Solution1();
		System.out.println(obj.firstIndex(a, n));
	}

}

class Solution1 {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        int low = 0;
		int high = (int) n - 1;
		int ans = -1;

		while (low <= high) {

			int mid = (low + high) / 2;
			if (arr[mid] == 1) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] == 0) {
				low = mid + 1;
			}

		}
		return ans;
    }
}