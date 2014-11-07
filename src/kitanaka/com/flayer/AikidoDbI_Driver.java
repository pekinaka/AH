package kitanaka.com.flayer;

import kitanaka.com.dlayer.AikidoDbI;
import kitanaka.com.entity.MemberInfo;

public class AikidoDbI_Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MemberInfo mi = new MemberInfo("5","五十嵐太郎","60","abcd");
		
		//D層呼び出し
		AikidoDbI aikidoDbI = new AikidoDbI();
		aikidoDbI.aikidodbI(mi);

	}

}
