<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="css/core.css" rel="stylesheet" type="text/css" media="screen"/>
</head>
<body>
    <form method="post" action="excel/ExcelExport">
    <div>
    <br>
    <br>
    <br>
    </div>
    <div class="panelBar">
            <div class="pages">
                   <input class="button" type="submit" name="excel" value="���ɱ���" >
            </div>
        </div>
    <div class="pageContent">
	 <table class="list" width="100%" border="1">
		 <thead>
			 <tr>
				 <th width="100" align="center">����</th>
				 <th width="400" align="left">�ļ�����</th>
			 </tr>
		 </thead>
	 	<tbody>
	            <tr>
	                <td>2014-10-26</td>
	                <td align="left"><a href="./reports/Inventory listing 2014-10.xls">Inventory listing 2014-10.xls</a></td>
	            </tr>
	            <tr>
	                <td>2014-09-26</td>
	                <td align="left"><a href="./reports/Inventory listing 2014-09.xls">Inventory listing 2014-09.xls</a></td>
	            </tr>
            </tbody>
        </table>
        </div>
      
    </form>
</body>
</html>