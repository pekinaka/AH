package kitanaka.com.flayer;

import java.sql.SQLException;
import java.util.ArrayList;

import kitanaka.com.dlayer.AikidoDbS;
import kitanaka.com.entity.SearchResult;

public class ReferAikidoDb {
	//メンバ情報検索メソッド
	public ArrayList<SearchResult> searchAikidoMember(String name,String year) throws SQLException{
		AikidoDbS ads = new AikidoDbS();
		return ads.aikidodbS(name, year);
	}

}
