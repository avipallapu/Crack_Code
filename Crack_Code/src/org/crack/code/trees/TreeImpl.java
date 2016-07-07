package org.crack.code.trees;

public class TreeImpl {
	public static void main(String args[]){
		TreeDS treeDS = new TreeDS(1, null, null);
		
		treeDS = treeDS.addLeft(treeDS, 2);
		treeDS = treeDS.addLeft(treeDS, 3);
		treeDS = treeDS.addRight(treeDS, 4);
		treeDS = treeDS.addRight(treeDS, 5);
		treeDS = treeDS.addRight(treeDS, 6);
		
		int q = treeDS.checkHeight(treeDS);
		System.out.println();
	}
}
