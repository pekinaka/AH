package kitanaka.com.flayer;

import java.sql.SQLException;

import kitanaka.com.dlayer.AikidoDbD;
import kitanaka.com.dlayer.AikidoDbU;

public class AikidoDbD_Driver {

	public static void main(String[] args) {
		try{
			// TODO 自動生成されたメソッド・スタブ
			//D層呼び出し
					AikidoDbD aikidoDbD = new AikidoDbD();
					aikidoDbD.aikidodbD("3");
		}catch(SQLException e){
			e.printStackTrace();
		}
		

	}

}
