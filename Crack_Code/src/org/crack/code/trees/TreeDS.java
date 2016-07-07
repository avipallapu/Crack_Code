package org.crack.code.trees;

class TreeDS{
	int data;
	TreeDS left;
	TreeDS right;
	
	public TreeDS(int data, TreeDS left, TreeDS right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public void setData(int data){
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public TreeDS getLeft() {
		return left;
	}

	public void setLeft(TreeDS left) {
		this.left = left;
	}

	public TreeDS getRight() {
		return right;
	}

	public void setRight(TreeDS right) {
		this.right = right;
	}

	public TreeDS addRight(TreeDS t, int data){
		TreeDS newT = new TreeDS(data, null, null);
		TreeDS tmp = t;
		
		if(tmp == null) { return newT; } 
		while(tmp.getRight()!=null){
			tmp = tmp.getRight();
		}
		tmp.setRight(newT);
		return t;		
	}
	
	public TreeDS addLeft(TreeDS t, int data){
		TreeDS newT = new TreeDS(data, null, null);
		TreeDS tmp = t;
		
		if(tmp == null) { return newT; } 
		while(tmp.getLeft()!=null){
			tmp = tmp.getLeft();
		}
		tmp.setLeft(newT);
		return t;	
	}
	
	
	public int checkHeight(TreeDS t){
		if(t == null) { return 0; }
		else{
			return Math.max(checkHeight(t.left), checkHeight(t.right)) + 1;
		}
	}
}
