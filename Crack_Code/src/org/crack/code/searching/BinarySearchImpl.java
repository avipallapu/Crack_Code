package org.crack.code.searching;

class BinaryS{
	public int binartSearch(int arr[], int find){
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] < find)
				low = mid+1;
			else if(arr[mid] > find)
				high = mid-1;
			else
				return mid;
		}
		return -1;
	}
	
	public int binartSearchRec(int[] arr, int low, int high, int find){
		if( high < low) { return -1; }
		
		int mid = (low+high)/2;
		if(arr[mid] > find)
			return binartSearchRec(arr, low, mid-1, find);
		else if(arr[mid] < find)
			return binartSearchRec(arr, mid+1, high, find);
		else
			return mid;
	}
}

public class BinarySearchImpl {
	public static void main(String[] args) {
		int[] arr = {1,3,5,6,7,8,9,99,101};
		BinaryS binaryS = new BinaryS();
		System.out.println(binaryS.binartSearch(arr, 99));
		System.out.println(binaryS.binartSearchRec(arr, 0, arr.length-1, 101));
	}

}
