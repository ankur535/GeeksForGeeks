package ds.Arrays;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int d = in.nextInt();
		rotateArray(arr, d, n);
		in.close();
	}

	public static void rotateArray(int arr[], int d, int n) {

		if (d < 0) {
			d = d + n;
		}
		d = d % n;
		
		// reverse front
		reverseArray(arr, 0, d - 1);
		// reverse back
		reverseArray(arr, d, n - 1);
		// reverse total
		reverseArray(arr, 0, n - 1);

		printArray(arr);

	}

	public static void reverseArray(int arr[], int i, int j) {
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}

	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int arr[]) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
