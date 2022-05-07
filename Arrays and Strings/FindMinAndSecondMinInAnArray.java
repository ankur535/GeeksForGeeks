package ds.Arrays;

import java.io.*;

public class FindMinAndSecondMinInAnArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine().trim());
		long a[] = new long[(int) (n)];
		String inputLine[] = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(inputLine[i]);
		}

		Compute obj = new Compute();
		long[] product = obj.minAnd2ndMin(a, n);
		if (product[0] == -1)
			System.out.println(product[0]);
		else
			System.out.println(product[0] + " " + product[1]);
	}

}

// } Driver Code Ends

//User function Template for Java
//To do
class Compute {
	public long[] minAnd2ndMin(long a[], long n) {
		long min = Long.MAX_VALUE;
		long secondmin = Long.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (min > a[i]) {
				secondmin = min;
				min = a[i];
			} else if (secondmin > a[i] && min != a[i]) {
				secondmin = a[i];
			}
		}
		long ans[] = new long[(int) 2];
		if (secondmin != Long.MAX_VALUE) {
			ans[0] = min;
			ans[1] = secondmin;
		} else {
			ans[0] = -1;
			ans[1] = -1;
		}

		return ans;
	}
}
