package org.crack.code.trees;

public class BinaryTreeImpl {

	public static void main(String[] args) {
			BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
			
			binaryTreeNode.addNode(10, "A");
			binaryTreeNode.addNode(12, "B");
			binaryTreeNode.addNode(14, "C");
			binaryTreeNode.addNode(9, "C");
			binaryTreeNode.addNode(16, "C");
			binaryTreeNode.addNode(18, "C");
			
			int q = binaryTreeNode.checkHeight(binaryTreeNode.root);
			System.out.println("The height of the binary tree is: "+q + "\n");
			System.out.println("PRE ORDER TRAVERSE");
			binaryTreeNode.preOrder(binaryTreeNode.root);
			System.out.println("IN ORDER TRAVERSE");
			binaryTreeNode.inOrder(binaryTreeNode.root);
			System.out.println("POST ORDER TRAVERSE");
			binaryTreeNode.postOrder(binaryTreeNode.root);
			System.out.println("\nChecking if tree is balanced ");
			binaryTreeNode.checkBalanced(binaryTreeNode.root);
			
			
			
			// array to binary tree
			
			int[] arr = {1,2,3,4,5,6};
			Node n = binaryTreeNode.array2BinaryTree(arr, 0, 5);
			System.out.println("\nArray to Binary Tree");
			binaryTreeNode.preOrder(n);
			
			
			// check if BST
			boolean x = binaryTreeNode.checkIfBST(binaryTreeNode.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
			System.out.println("\nIs the tree a BST? -> "+x);
			
	}

}
