package conrad.treasureMap;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest {
	private int id ;
	private String name ;
	private List<String> contents ;

	public TreasureChest( String name){
		contents = new ArrayList<String>();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContents() {
		return contents;
	}
	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public void addToTreasureMap(String content){
		if(contents!=null&&content!=null){
			contents.add(content);
		}
	}

	public void removeContent(String content){
		if(contents!=null){
			boolean contentPresent =contents.contains(content);
			if(contentPresent){
				contents.remove(content);
			}
		}
	}

	public int hascode(){
		final int HASH =7;
		int result = (HASH*31)+id ;

		return result ;
	}

	public boolean equals(Object obj){
		boolean equal = false ;
		if(this==obj){
			return true ;
		}
		if(obj==null){
			return false;
		}
		if(getClass()!=obj.getClass()){
			return false ;
		}
		TreasureChest chest = (TreasureChest)obj ;
		if(chest.getId()==getId()&&chest.getName().equalsIgnoreCase(getName())){
			equal =true;
		}

		return equal ;
	}

}
