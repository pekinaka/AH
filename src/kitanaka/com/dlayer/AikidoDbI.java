package kitanaka.com.dlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kitanaka.com.entity.MemberInfo;

public class AikidoDbI {
	public void aikidodbI(MemberInfo mi){
		//引数から入力項目を取得
		String id = mi.getId();
		String name = mi.getName();
		String year = mi.getYear();
		String password = mi.getPassword();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//SQL文
		String psql = "INSERT INTO aikido_member VALUES(?,?,?,?,?)";
		
		try{
			//コネクションの取得
			con = ConnectDB.getConnect();
			
			//PreparedStatemetの取得
			pstmt = con.prepareStatement(psql);
			
			//パラメータに値を格納
			pstmt.setInt(1, Integer.parseInt(id));
			pstmt.setString(2, name);
			pstmt.setInt(3, Integer.parseInt(year));
			pstmt.setString(4, password);
			pstmt.setString(5, "A");
			
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
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
