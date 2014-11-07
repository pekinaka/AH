package kitanaka.com.flayer;

import java.sql.SQLException;

import kitanaka.com.dlayer.AikidoDbI;
import kitanaka.com.dlayer.AikidoDbU;
import kitanaka.com.entity.MemberInfo;

public class AikidoDbU_Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MemberInfo mi = new MemberInfo("3","吉田太郎","100","abcd");
		try{
			//D層呼び出し
			AikidoDbU aikidoDbU = new AikidoDbU();
			aikidoDbU.aikidodbU(mi);

		}catch(SQLException e){
			e.printStackTrace();
			
		}

		
		
	}

}
