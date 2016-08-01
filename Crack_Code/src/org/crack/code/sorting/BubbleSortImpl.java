package org.crack.code.sorting;

class BubbleSort{
	private int[] arr2Sort;
	BubbleSort(int arr[]){
		this.arr2Sort = arr;
	}
	
	public void sortIt(){
		int i = 0;
		while(i<arr2Sort.length-1){
			if(arr2Sort[i+1] < arr2Sort[i]){
				swap(i, i+1);
				i = 0;
			}
			i++;
		}
		printIt();
	}
	
	public void swap(int i, int j) {
		int tmp;
		tmp = arr2Sort[i];
		arr2Sort[i] = arr2Sort[j];
		arr2Sort[j] = tmp;
	}

	public void printIt(){
	for(int j=0;j<arr2Sort.length;j++){
		System.out.println(arr2Sort[j]);
		}
}
}

public class BubbleSortImpl {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,6,7};
		BubbleSort bubbleSort = new BubbleSort(arr);
		bubbleSort.sortIt();

	}

}
