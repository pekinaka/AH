package kitanaka.com.entity;

public class MemberInfo {
	private String id;
	private String name;
	private String year;
	private String password;
	
	

	public MemberInfo(String id,String name,String year,String password){
		this.id = id;
		this.name = name;
		this.year = year;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getYear() {
		return year;
	}

	public String getPassword() {
		return password;
	}
	
	

}
