package conrad.treasureMap;

public class TreasureMapUtils {
	
	public static int convertToInt(String string,int defaultInt){
		int number = 0;
		try{
			number=Integer.parseInt(string);
		}catch (Exception e) {
			number =defaultInt;
		}
		return number;
	}

}
