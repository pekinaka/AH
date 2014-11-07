package kitanaka.com.dlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kitanaka.com.entity.MemberInfo;

public class AikidoDbU {
	public void aikidodbU(MemberInfo mi) throws SQLException{
		//引数から入力項目を取得
		String id = mi.getId();
		String name = mi.getName();
		String year = mi.getYear();
		String password = mi.getPassword();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//SQL文
		String psql = "UPDATE aikido_member SET name = ?,year = ?, password = ?,testmodeflag = ? WHERE id = ?";
		
		try{
			//コネクションの取得
			con = ConnectDB.getConnect();
			
			//PreparedStatemetの取得
			pstmt = con.prepareStatement(psql);
			
			//パラメータに値を格納
			
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(year));
			pstmt.setString(3, password);
			pstmt.setString(4, "R");
			pstmt.setInt(5, Integer.parseInt(id));
			pstmt.executeUpdate();
			
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
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}

	}
}
