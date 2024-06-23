package com.sort;

import java.util.Arrays;

public class BubbleSort {
	
	static void bubblesort(int array[]) {
		int size = array.length;
		
	        //loop to access each element
		 for(int i=0; i<size-1; i++) {
			
			//loop to compare array element
			for(int j=0; i<size-i-1; j++) {
				
				//compare two adjacent elements
				//change > to < to sort in ascending order
				if(array[j] > array[j+1]) {
					
					//swapping occurs if elements
					//are not in the intended order 
					int temp = array[i];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] data = {-12, 10 , 8 ,90 };
		
		//call method using the class name
		BubbleSort.bubblesort(data);
		System.out.println("Sorted array in ascending order : ");
		System.out.println(Arrays.toString(data));
		
	}

}
