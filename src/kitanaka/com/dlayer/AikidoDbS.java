package kitanaka.com.dlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kitanaka.com.entity.MemberInfo;
import kitanaka.com.entity.SearchResult;

public class AikidoDbS {
	String name;
	String year;
	public ArrayList<SearchResult> aikidodbS(String name,String year) throws SQLException{
		//引数から検索条件を取得
		this.name = name;
		this.year = year;
		String sql ="select id,name,year from aikido_member where ";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//コネクションの取得
			con = ConnectDB.getConnect();
			//ステートメントの取得
			stmt = con.createStatement();
			//リザルトセットの取得
			rs = null;
			
			//動的where句の生成
			ArrayList<String> sqlList = new ArrayList<String>();
			if(this.name.trim().length() != 0){
				sqlList.add("name LIKE '%" + name + "%'");
			}
			
			if(this.year.trim().length() != 0){
				sqlList.add("year = '" + year + "'");
			}
			
			StringBuilder WhereStr = new StringBuilder("NOT testmodeflag = 'D'");
			if(sqlList.size() == 0){
				WhereStr.append(" AND 'A' = 'A'");
			}else{
				for(String temp:sqlList){
					WhereStr.append(" AND " + temp);
				}
			}
			
			//SQL文の実行
			rs = stmt.executeQuery(sql + WhereStr);
			//結果の取得
			ArrayList<SearchResult> resultList = new  ArrayList<SearchResult>();
			while(rs.next()){
				resultList.add(new SearchResult(rs.getInt(1),rs.getString(2),String.valueOf(rs.getInt(3))));
			}
			
			return resultList;
			
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}finally{
			try{
				if(con != null){
					con.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(rs != null){
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	//全件取得用メソッド
	public int aikidodbS() throws SQLException{
		int count = 0;
		String sql ="select id from aikido_member ";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			//コネクションの取得
			con = ConnectDB.getConnect();
			//ステートメントの取得
			pstmt = con.prepareStatement(sql);
			//リザルトセットの取得
			rs = null;
			
			//SQL文の実行
			rs = pstmt.executeQuery();
			//結果の取得
			while(rs.next()){
				count++;
			}
			
			return count;
			
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}finally{
			try{
				if(con != null){
					con.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				if(rs != null){
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	

}
