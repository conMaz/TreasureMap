package conrad.treasureMap;

public class Grid {

	private String name ;
	private int rows ;
	private int columns ;
	private TreasureChest[][] treasureChest ;

	public Grid(int rows, int cols){
		treasureChest = new TreasureChest[rows][cols] ;
		this.rows =rows ;
		this.columns =cols ;
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreasureChest[][] getTreasureChest() {
		return treasureChest;
	}

	public void addTreasureChest(TreasureChest chest, int row,int col){
		treasureChest[row][col] = chest ;
	}

	public void removeTreasureChest(TreasureChest chest){
		for(int row=0;row<rows;row++){
			for(int col=0;col<columns;col++){
				TreasureChest chest1 = treasureChest[row][col];
				if(chest1.equals(chest)){
					chest1 = null;
					break;
				}
			}
		}
	}

	public void displayGrid(){
		System.out.println("Grid name :"+getName());
		for(int row=0;row<rows;row++){
			StringBuilder gridBulder = new StringBuilder();
			for(int col=0;col<columns;col++){
				TreasureChest chest = treasureChest[row][col];
				if(chest==null){
					gridBulder.append("_ ");
				}else{
					gridBulder.append("X ");
				}
			}
			
			System.out.println(gridBulder.toString());
		}
	}








}
