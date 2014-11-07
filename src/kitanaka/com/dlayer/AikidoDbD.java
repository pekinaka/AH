package kitanaka.com.dlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kitanaka.com.entity.MemberInfo;

public class AikidoDbD {
	int id;
	public void aikidodbD(String id) throws SQLException{
		//引数から入力項目を取得
		
		this.id = Integer.parseInt(id);
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//SQL文
		String psql = "UPDATE aikido_member SET testmodeflag = 'D' WHERE id = ?";
		
		try{
			//コネクションの取得
			con = ConnectDB.getConnect();
			
			//PreparedStatemetの取得
			pstmt = con.prepareStatement(psql);
			
			//パラメータに値を格納
			
			pstmt.setInt(1, this.id);
			
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
