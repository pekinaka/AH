package kitanaka.com.flayer;

import java.sql.SQLException;
import java.util.ArrayList;

import kitanaka.com.dlayer.AikidoDbS;
import kitanaka.com.entity.SearchResult;

public class AikidoDbS_Driver {

	public static void main(String[] args) throws SQLException{
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<SearchResult> resultList = new ArrayList<SearchResult>();
		int id;
		try{
			id = new AikidoDbS().aikidodbS();
			//resultList = new AikidoDbS().aikidodbS("", "");
			//for(SearchResult temp : resultList){
				//System.out.println("ID:"+ temp.getId());
				//System.out.println("氏名："+ temp.getName());
				//System.out.println("代："+ temp.getYear()+"代");
			//}
			System.out.println(id);
		}catch(SQLException e){
			e.printStackTrace();
		}
		

	}

}
