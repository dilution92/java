package com.chap02;

public class Ex17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int sum = 0;

		for(int i=0 ; i< arr.length; i++) {
			arr[i] = (i+1);
		}

		for( int i =0; i<arr.length; i++) {
			sum += arr[i];
		}

		System.out.println(sum);
	}
}

