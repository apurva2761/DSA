package com.bin;

public class SortArr {


	public void bubble(int[] arr) {
		// TODO Auto-generated method stub
 
			for(int i=0;i<arr.length;i++) {
				for(int j=1;j<arr.length-i;j++) {
					if(arr[j-1]>arr[j]) {
						int temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
				
				
			
	}
	}

	public void Selection(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int minidx=findMinnum(arr,i,arr.length);
			int temp=arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
					
		}
			
		}
	private int findMinnum(int[] arr, int start, int end) {
		int min=arr[start];
		int minidx=start;
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minidx=i;
				
			}
		}
		return minidx;
	}
	}


