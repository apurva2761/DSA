package com.Test;
import com.bin.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		SortArr sort=new SortArr();
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Bubble Sort\n2.Selection Sort\nEnter choice");
		choice=sc.nextInt();
		System.out.println("Enter Data For array");
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt();
		}
		switch(choice)
		{
		case 1:
			sort.bubble(arr);
			break;
		case 2:
			sort.Selection(arr);
	
		}
		
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
		
	}

}
