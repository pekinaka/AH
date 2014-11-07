<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function setcheckbox(table) {
	var length = table.rows.length;
	for(var start = 1 ; start<length ; ++start){
		var cell = table.rows[start].cells[1].firstChild.value;
		alert(cell);
		var HTML = '<input type="checkbox" value = "'+ cell+'" name = "checkbox">';
	    var cell2 = table.rows[start].cells[0];
	    cell2.innerHTML = HTML;
	}
}

function alert1(){
	alert(こんにちは！);
}
</script>


<title>Insert title here</title>
</head>
<body>

機器基本情報
<table  style="table-layout: fixed; border-collapse: collapse;">
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">ホスト名</font></th><td colspan="3" style="border-style: solid; "><input type="text" name="hostname" style="width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">形名</font></th><td style="border-style: solid;;"><input type="text" name="katamei"></td><th style="border-style: solid;background-color: steelblue;"><font color="white">資産番号</font></th><td style="border-style: solid;"><input type="text" name="assetnumber"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">アドレス</font></th><td style="border-style: solid;;"><input type="text" name="ipaddress"></td><th style="border-style: solid;background-color: steelblue;"><font color="white">製番</font></th><td style="border-style: solid;"><input type="text" name="seiban"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">設置先住所</font></th><td style="border-style: solid;" colspan="2"><input type="text" name="installAddress" style="width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">設置年月日</font></th><td style="border-style: solid;" colspan="2"><input type="text" name="installYMD" style="width: 100% ;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">設置先電話番号</font></th><td style="border-style: solid;" colspan="2"><input type="text" name="installTel" style="width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">OS</font></th><td style="border-style: solid;" colspan="4"><input type="text" name="os" style="width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">CPU</font></th><td style="border-style: solid;" colspan="3"><input type="text" name="cpu" style="width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;"></td>
</tr>
<tr>
<th style="border-style: solid;background-color: steelblue;"><font color="white">diskサイズ</font></th><td style="border-style: solid;" colspan="3"><input type="text" name="diskSize" style="width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;"></td><th style="border-style: solid;z-index: 1;background-color: steelblue;"><font color="white">OS区分</font></th><td style="border-style: solid;"><input type="text" name="OSKbn"></td>
</tr>
</table>

機器ソフト情報
<form action="" id = "sofrInfo" name = "softInfo">
<table border="1" id="softList">
<tr>
<th>削除</th><th>プロダクトID</th><th>型名</th>
</tr>
<tr>
<td><input type="checkbox" value = "" name = "checkbox"></td><td><input type="text" value ="12345" name = "productId"></td><td><input type="text" name ="katamei" value =""></td>
</tr>
<tr>
<td><input type="checkbox" value = "" name = "checkbox2"></td><td><input type="text" value ="23456" name = "productId[1]"></td><td><input type="text" name ="katamei2" value =""></td>
</tr>
</table>
</form>

<input type="button" value="テスト" onclick="alert1();">

<script type="text/javascript">
setcheckbox(document.getElementById("softList"));
</script>

</body>
</html>