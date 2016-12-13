package leet;

public class IslandPerimeter {

	private int[][] island;

	public int[][] getIsland() {
		return island;
	}

	public void setIsland(int[][] island) {
		this.island = island;
	}
	
	public IslandPerimeter(int[][] island) {
		this.island = island;
	}
	
	public int getCorners(){
		int corners=0;
		for(int i=0;i<this.island.length;i++){
			for(int j=0;j<this.island.length;j++){
				if(this.island[i][j]==1){
					corners++;
				}
			}
		}
		
		return corners;
	}
	
	public int getCommonSides(){
		int sides=0;
		for(int i=0;i<this.island.length;i++){
			for(int j=0;j<this.island.length;j++){
				if(this.island[i][j]==1){
					if(i+1 <this.island.length){
						if(this.island[i+1][j]==1){
						sides++;
						}
					}
					if(j+1 <this.island.length){
						if(this.island[i][j+1]==1){
						sides++;
						}
					}
				}
			}
		}
		return sides;
	}
}
