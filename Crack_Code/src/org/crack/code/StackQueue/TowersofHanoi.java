package org.crack.code.StackQueue;

public class TowersofHanoi {

	public void move(int n, char start, char aux, char end){
		if(n == 1) { System.out.println("Move Disk "+n+" "+start+ "->"+ end); }
		if(n>1){
			move(n-1,start,end,aux);
			System.out.println("Move Disk "+n+" "+start+ "->"+ end);
			move(n-1,aux,start,end);
		}
	}
	public static void main(String[] args) {
		TowersofHanoi towersofHanoi = new TowersofHanoi();
		towersofHanoi.move(3, 'A', 'B', 'C');

	}

}
