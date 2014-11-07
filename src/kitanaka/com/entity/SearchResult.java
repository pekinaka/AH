package kitanaka.com.entity;

public class SearchResult {
	int id;
	String name;
	String year;
	public SearchResult(int id,String name,String year){
		this.id =id;
		this.name = name;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getYear() {
		return year;
	}
	

}
