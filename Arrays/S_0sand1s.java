package com.Programs;

public class S_0sand1s {

	public static void seperate(int arr[]) {
	//	int arr2[] = new int[arr.length];

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			while (arr[left] == 0 && left < right) {
				left++;
			}
			while (arr[right] == 1 && left < right) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 0, 0, 1, 0, 0 };
		seperate(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
