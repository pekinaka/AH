package kitanaka.com.flayer;

import java.sql.SQLException;

import kitanaka.com.dlayer.AikidoDbD;
import kitanaka.com.dlayer.AikidoDbI;
import kitanaka.com.dlayer.AikidoDbS;
import kitanaka.com.dlayer.AikidoDbU;
import kitanaka.com.entity.MemberInfo;

public class EditAikidoDb {
	
	//DB登録用メソッド
	public void entryAikidoMember(String name,String year,String password) throws SQLException{
		try{
			//id採番処理
			AikidoDbS ads = new AikidoDbS();
			int id = ads.aikidodbS();
			id++;
			
			//MenmberInfoのインスタンス生成
			MemberInfo mi = new MemberInfo(String.valueOf(id),name,year,password);
			
			//メンバ情報登録処理
			AikidoDbI adi = new AikidoDbI();
			adi.aikidodbI(mi);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	//DB更新用メソッド
	public void updateAikidoMember(String id,String name,String year,String password) throws SQLException{
		try{
			//MemberInfoのインスタンス生成
			MemberInfo mi = new MemberInfo(id,name,year,password);
			
			//メンバ情報更新処理
			AikidoDbU adu = new AikidoDbU();
			adu.aikidodbU(mi);
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}
		
	}
	
	//DB削除用メソッド
	public void deleteAikidoMember(String id) throws SQLException{
		try{
			//メンバ情報削除処理
			AikidoDbD add = new AikidoDbD();
			add.aikidodbD(id);
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}
		
	}

}
