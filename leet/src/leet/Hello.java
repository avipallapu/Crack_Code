package leet;

public class Hello {

	public static void main(String[] args){
		int[][] island = {{0,1,0,0},
						  {1,1,1,0},
						  {0,1,0,0},
						  {1,1,0,0}};
		IslandPerimeter islandP = new IslandPerimeter(island);
		
		System.out.println(islandP.getCorners()*4 - islandP.getCommonSides()*2);
	}
}
